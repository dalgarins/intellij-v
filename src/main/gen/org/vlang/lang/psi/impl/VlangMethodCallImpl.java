// This is a generated file. Not intended for manual editing.
package org.vlang.lang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.vlang.lang.psi.VlangArgumentList;
import org.vlang.lang.psi.VlangMethodCall;
import org.vlang.lang.psi.VlangPsiTreeUtil;
import org.vlang.lang.psi.VlangVisitor;

import static org.vlang.lang.VlangTypes.IDENTIFIER;

public class VlangMethodCallImpl extends VlangCompositeElementImpl implements VlangMethodCall {

  public VlangMethodCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VlangVisitor visitor) {
    visitor.visitMethodCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VlangVisitor) accept((VlangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VlangArgumentList getArgumentList() {
    return notNullChild(VlangPsiTreeUtil.getChildOfType(this, VlangArgumentList.class));
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

}
