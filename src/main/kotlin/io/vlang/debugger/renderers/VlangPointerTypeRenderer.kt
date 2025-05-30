package io.vlang.debugger.renderers

import com.intellij.openapi.project.Project
import com.jetbrains.cidr.execution.debugger.backend.LLValue
import com.jetbrains.cidr.execution.debugger.backend.LLValueData

class VlangPointerTypeRenderer : VlangValueRenderer() {
    override fun isApplicable(project: Project, value: LLValue): Boolean =
        value.type.endsWith("*") ||
                value.type == "voidptr" ||
                value.type == "charptr" ||
                value.type == "byteptr"

    override fun getDisplayType(type: String): String = type

    override fun getData(value: VlangValue): LLValueData = processPointer(value) ?: value.data
}
