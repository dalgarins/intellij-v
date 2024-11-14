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

public class VlangJsonCallExprImpl extends VlangCallExprImpl implements VlangJsonCallExpr {

  public VlangJsonCallExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull VlangVisitor visitor) {
    visitor.visitJsonCallExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VlangVisitor) accept((VlangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VlangJsonArgumentList getJsonArgumentList() {
    return notNullChild(VlangPsiTreeUtil.getChildOfType(this, VlangJsonArgumentList.class));
  }

  @Override
  public @NotNull List<@NotNull VlangExpression> getParameters() {
    return VlangPsiImplUtil.getParameters(this);
  }

}
