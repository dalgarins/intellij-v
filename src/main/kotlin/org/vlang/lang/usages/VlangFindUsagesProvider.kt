package org.vlang.lang.usages

import com.intellij.lang.HelpID
import com.intellij.lang.cacheBuilder.DefaultWordsScanner
import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.ElementDescriptionUtil
import com.intellij.psi.PsiElement
import com.intellij.usageView.UsageViewLongNameLocation
import com.intellij.usageView.UsageViewShortNameLocation
import org.vlang.lang.lexer.VlangLexer
import org.vlang.lang.psi.*

class VlangFindUsagesProvider : FindUsagesProvider {
    override fun getWordsScanner(): WordsScanner {
        return DefaultWordsScanner(
            VlangLexer(),
            VlangTokenTypes.IDENTIFIERS,
            VlangTokenTypes.COMMENTS,
            VlangTokenTypes.STRING_LITERALS,
        )
    }

    override fun canFindUsagesFor(element: PsiElement) = element is VlangImportSpec || element is VlangNamedElement

    override fun getHelpId(psiElement: PsiElement) = HelpID.FIND_OTHER_USAGES

    override fun getType(element: PsiElement) = when (element) {
        is VlangMethodDeclaration                         -> "method"
        is VlangFunctionDeclaration                       -> "function"
        is VlangConstDefinition, is VlangConstDeclaration -> "constant"
        is VlangVarDefinition, is VlangVarDeclaration     -> "variable"
        is VlangParamDefinition                           -> "parameter"
        is VlangAnonymousFieldDefinition                  -> "anonymous field"
        is VlangImportDeclaration                         -> "import"
        is VlangImportSpec                                -> "import alias"
        is VlangReceiver                                  -> "receiver"
        is VlangLabelDefinition                           -> "label"
        is VlangModuleClause                              -> "module statement"
        is VlangStatement                                 -> "statement"
        else                                              -> ""
    }

    override fun getDescriptiveName(element: PsiElement): String {
        return ElementDescriptionUtil.getElementDescription(element, UsageViewLongNameLocation.INSTANCE)
    }

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String {
        return ElementDescriptionUtil.getElementDescription(element, UsageViewShortNameLocation.INSTANCE)
    }
}
