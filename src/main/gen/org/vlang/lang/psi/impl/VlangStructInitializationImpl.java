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

public class VlangStructInitializationImpl extends VlangExpressionImpl implements VlangStructInitialization {

  public VlangStructInitializationImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull VlangVisitor visitor) {
    visitor.visitStructInitialization(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VlangVisitor) accept((VlangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VlangFieldInitialization getFieldInitialization() {
    return VlangPsiTreeUtil.getChildOfType(this, VlangFieldInitialization.class);
  }

  @Override
  @NotNull
  public VlangTypeDecl getTypeDecl() {
    return notNullChild(VlangPsiTreeUtil.getChildOfType(this, VlangTypeDecl.class));
  }

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return notNullChild(findChildByType(LBRACE));
  }

  @Override
  @NotNull
  public PsiElement getRbrace() {
    return notNullChild(findChildByType(RBRACE));
  }

}
