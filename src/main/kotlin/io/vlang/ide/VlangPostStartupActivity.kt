package io.vlang.ide

import com.intellij.ide.BrowserUtil
import com.intellij.ide.plugins.InstalledPluginsState
import com.intellij.ide.plugins.PluginManagerCore
import com.intellij.ide.util.PropertiesComponent
import com.intellij.openapi.application.readAction
import com.intellij.openapi.extensions.PluginId
import com.intellij.openapi.options.ShowSettingsUtil
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity
import com.intellij.openapi.util.registry.Registry
import com.jetbrains.cidr.execution.debugger.evaluation.CidrValue
import io.vlang.configurations.VlangProjectStructureState.Companion.projectStructure
import io.vlang.notifications.VlangNotification
import io.vlang.projectWizard.VlangToolchainFlavor
import io.vlang.toolchain.VlangKnownToolchainsState
import io.vlang.toolchain.VlangToolchain
import io.vlang.toolchain.VlangToolchainService.Companion.toolchainSettings
import javax.swing.SwingUtilities.invokeLater

class VlangPostStartupActivity : ProjectActivity {

    override suspend fun execute(project: Project) {
        val knownToolchains = VlangKnownToolchainsState.getInstance().knownToolchains
        val toolchainSettings = project.toolchainSettings

        val needFindToolchains = knownToolchains.isEmpty()
        if (needFindToolchains) {
            val toolchainCandidates = setupToolchainCandidates()
            if (toolchainCandidates.isEmpty()) {
                return
            }

            toolchainSettings.setToolchain(project, VlangToolchain.fromPath(toolchainCandidates.first()))
            return
        }

        if (toolchainSettings.isNotSet() && knownToolchains.isNotEmpty()) {
            toolchainSettings.setToolchain(project, VlangToolchain.fromPath(knownToolchains.first()))
        }

        Registry.get("cidr.debugger.value.stringEvaluator").setValue(false)
        Registry.get("cidr.debugger.lldb.statics").setValue(false)

        try {
            project.putUserData(CidrValue.DO_NOT_SHOW_ADDRESSES, true)
        } catch (e: NoClassDefFoundError) {
            // ignore
        }

        checkUpdates(project)

        readAction {
            project.projectStructure.determineProjectStructure(project)
        }
    }

    private fun checkUpdates(project: Project) {
        val hasNewerVersion = InstalledPluginsState.getInstance().hasNewerVersion(PLUGIN_ID)
        if (!hasNewerVersion) {
            return
        }

        val plugin = PluginManagerCore.getPlugin(PLUGIN_ID) ?: return
        val currentVersion = plugin.version

        val dontShowForVersion = PropertiesComponent.getInstance(project).getValue(DONT_SHOW_UPDATE_NOTIFICATION)
        if (dontShowForVersion != null && dontShowForVersion == currentVersion) {
            // skip any update for current version
            return
        }

        VlangNotification("New version of the V plugin is available")
            .withActions(
                VlangNotification.Action("Update") { _, notification ->
                    invokeLater {
                        ShowSettingsUtil.getInstance().showSettingsDialog(project, "Plugins")
                        notification.expire()
                    }
                }
            )
            .withActions(
                VlangNotification.Action("What's new?") { _, notification ->
                    BrowserUtil.browse("${PLUGIN_URL}/versions")
                    notification.expire()
                }
            )
            .withActions(
                VlangNotification.Action("Don't show again") { _, notification ->
                    PropertiesComponent.getInstance(project).setValue(DONT_SHOW_UPDATE_NOTIFICATION, currentVersion, null)
                    notification.expire()
                }
            )
            .show(project)
    }

    companion object {
        fun setupToolchainCandidates(): List<String> {
            val toolchainCandidates = VlangToolchainFlavor.getApplicableFlavors()
                .flatMap { it.suggestHomePaths() }
                .distinct()
                .map { it.toString() }

            if (toolchainCandidates.isEmpty()) {
                return emptyList()
            }

            VlangKnownToolchainsState.getInstance().knownToolchains = toolchainCandidates.toSet()
            return toolchainCandidates
        }

        private val PLUGIN_ID = PluginId.getId("io.vlang")
        private val PLUGIN_URL = "https://plugins.jetbrains.com/plugin/24183-vlang"
        private const val DONT_SHOW_UPDATE_NOTIFICATION = "io.vlang.dont.show.update.notification"
    }
}
