// This is a generated file. Not intended for manual editing.
package org.vlang.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VlangMapType extends VlangTypeDecl {

  @NotNull
  List<VlangTypeDecl> getTypeDeclList();

  @Nullable
  PsiElement getLbrack();

  @Nullable
  PsiElement getRbrack();

}