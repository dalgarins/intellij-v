// This is a generated file. Not intended for manual editing.
package org.vlang.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VlangArrayOrSliceType extends VlangTypeDecl {

  @Nullable
  VlangExpression getExpression();

  @Nullable
  VlangTypeDecl getTypeDecl();

  @NotNull
  PsiElement getLbrack();

  @Nullable
  PsiElement getRbrack();

  @Nullable
  PsiElement getTripleDot();

}