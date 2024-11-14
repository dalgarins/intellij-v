// This is a generated file. Not intended for manual editing.
package io.vlang.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.vlang.lang.psi.VlangPsiTreeUtil;
import static io.vlang.lang.VlangTypes.*;
import io.vlang.lang.psi.*;

public class VlangImportPathImpl extends VlangCompositeElementImpl implements VlangImportPath {

  public VlangImportPathImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VlangVisitor visitor) {
    visitor.visitImportPath(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VlangVisitor) accept((VlangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VlangImportName> getImportNameList() {
    return VlangPsiTreeUtil.getChildrenOfTypeAsList(this, VlangImportName.class);
  }

  @Override
  public @NotNull String getQualifiedName() {
    return VlangPsiImplUtil.getQualifiedName(this);
  }

  @Override
  public @NotNull String getLastPart() {
    return VlangPsiImplUtil.getLastPart(this);
  }

  @Override
  public @NotNull PsiElement getLastPartPsi() {
    return VlangPsiImplUtil.getLastPartPsi(this);
  }

}
