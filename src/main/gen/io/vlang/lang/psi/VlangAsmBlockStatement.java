// This is a generated file. Not intended for manual editing.
package io.vlang.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VlangAsmBlockStatement extends VlangStatement {

  @Nullable
  VlangAsmBlock getAsmBlock();

  @NotNull
  PsiElement getAsm();

  @NotNull
  PsiElement getIdentifier();

  @Nullable
  PsiElement getVolatile();

}
