// This is a generated file. Not intended for manual editing.
package io.vlang.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VlangImplementsClause extends VlangCompositeElement {

  @Nullable
  VlangLastComma getLastComma();

  @NotNull
  List<VlangTypeReferenceExpression> getTypeReferenceExpressionList();

  @NotNull
  PsiElement getImplements();

}
