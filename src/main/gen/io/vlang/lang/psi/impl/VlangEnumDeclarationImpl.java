// This is a generated file. Not intended for manual editing.
package io.vlang.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.vlang.lang.psi.VlangPsiTreeUtil;
import static io.vlang.lang.VlangTypes.*;
import io.vlang.lang.stubs.VlangEnumDeclarationStub;
import io.vlang.lang.psi.*;
import com.intellij.psi.ResolveState;
import io.vlang.lang.psi.types.VlangTypeEx;
import com.intellij.psi.stubs.IStubElementType;

public class VlangEnumDeclarationImpl extends VlangNamedElementImpl<VlangEnumDeclarationStub> implements VlangEnumDeclaration {

  public VlangEnumDeclarationImpl(@NotNull VlangEnumDeclarationStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public VlangEnumDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VlangVisitor visitor) {
    visitor.visitEnumDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VlangVisitor) accept((VlangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VlangAttributes getAttributes() {
    return VlangPsiTreeUtil.getStubChildOfType(this, VlangAttributes.class);
  }

  @Override
  @NotNull
  public VlangEnumType getEnumType() {
    return notNullChild(VlangPsiTreeUtil.getStubChildOfType(this, VlangEnumType.class));
  }

  @Override
  @Nullable
  public VlangSymbolVisibility getSymbolVisibility() {
    return VlangPsiTreeUtil.getChildOfType(this, VlangSymbolVisibility.class);
  }

  @Override
  public @NotNull String getName() {
    return VlangPsiImplUtil.getName(this);
  }

  @Override
  public @Nullable PsiElement getIdentifier() {
    return VlangPsiImplUtil.getIdentifier(this);
  }

  @Override
  public @NotNull VlangTypeEx getTypeInner(@Nullable ResolveState context) {
    return VlangPsiImplUtil.getTypeInner(this, context);
  }

  @Override
  public boolean isFlag() {
    return VlangPsiImplUtil.isFlag(this);
  }

}
