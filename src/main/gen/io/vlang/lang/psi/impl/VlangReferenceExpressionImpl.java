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
import com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access;

public class VlangReferenceExpressionImpl extends VlangExpressionImpl implements VlangReferenceExpression {

  public VlangReferenceExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull VlangVisitor visitor) {
    visitor.visitReferenceExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VlangVisitor) accept((VlangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

  @Override
  public @NotNull VlangReference getReference() {
    return VlangPsiImplUtil.getReference(this);
  }

  @Override
  public @Nullable VlangCompositeElement getQualifier() {
    return VlangPsiImplUtil.getQualifier(this);
  }

  @Override
  public @Nullable PsiElement resolve() {
    return VlangPsiImplUtil.resolve(this);
  }

  @Override
  public @NotNull Access getReadWriteAccess() {
    return VlangPsiImplUtil.getReadWriteAccess(this);
  }

  @Override
  public boolean safeAccess() {
    return VlangPsiImplUtil.safeAccess(this);
  }

}
