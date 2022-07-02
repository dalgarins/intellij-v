// This is a generated file. Not intended for manual editing.
package org.vlang.lang.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.vlang.lang.psi.impl.VlangReference;
import org.vlang.lang.stubs.VlangMethodDeclarationStub;

public interface VlangMethodDeclaration extends VlangFunctionOrMethodDeclaration, VlangReferenceExpressionBase, StubBasedPsiElement<VlangMethodDeclarationStub> {

  @Nullable
  VlangBlock getBlock();

  @Nullable
  VlangReceiver getReceiver();

  @Nullable
  VlangSignature getSignature();

  @NotNull
  VlangSymbolVisibility getSymbolVisibility();

  @Nullable
  PsiElement getFunc();

  @Nullable
  PsiElement getIdentifier();

  //WARNING: getReceiverType(...) is skipped
  //matching getReceiverType(VlangMethodDeclaration, ...)
  //methods are not found in VlangPsiImplUtil

  @NotNull
  VlangReference getReference();

}