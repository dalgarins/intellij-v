// This is a generated file. Not intended for manual editing.
package org.vlang.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.vlang.lang.psi.VlangPsiTreeUtil;
import static org.vlang.lang.VlangTypes.*;
import org.vlang.lang.psi.*;

public class VlangSqlExpressionImpl extends VlangExpressionImpl implements VlangSqlExpression {

  public VlangSqlExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull VlangVisitor visitor) {
    visitor.visitSqlExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VlangVisitor) accept((VlangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VlangSqlBlock getSqlBlock() {
    return VlangPsiTreeUtil.getChildOfType(this, VlangSqlBlock.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @NotNull
  public PsiElement getSql() {
    return notNullChild(findChildByType(SQL));
  }

}
