// This is a generated file. Not intended for manual editing.
package io.vlang.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.psi.PsiReference;

public interface VlangStringLiteral extends VlangExpression, PsiLanguageInjectionHost {

  @Nullable
  VlangStringTemplate getStringTemplate();

  @Nullable
  PsiElement getRawString();

  boolean isValidHost();

  @NotNull VlangStringLiteral updateText(@NotNull String text);

  @NotNull StringLiteralEscaper<@NotNull VlangStringLiteral> createLiteralTextEscaper();

  //WARNING: getDecodedText(...) is skipped
  //matching getDecodedText(VlangStringLiteral, ...)
  //methods are not found in VlangPsiImplUtil

  @NotNull PsiReference @NotNull [] getReferences();

  @NotNull String getContents();

}
