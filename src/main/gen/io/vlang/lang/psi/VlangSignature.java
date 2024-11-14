// This is a generated file. Not intended for manual editing.
package io.vlang.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import io.vlang.lang.stubs.VlangSignatureStub;
import kotlin.Pair;

public interface VlangSignature extends VlangCompositeElement, StubBasedPsiElement<VlangSignatureStub> {

  @NotNull
  VlangParameters getParameters();

  @Nullable
  VlangResult getResult();

  @NotNull Pair<@NotNull Integer, @NotNull Integer> resultCount();

}
