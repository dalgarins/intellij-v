// This is a generated file. Not intended for manual editing.
package io.vlang.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VlangAnonymousStructType extends VlangType, VlangFieldListOwner {

  @NotNull
  List<VlangFieldsGroup> getFieldsGroupList();

  @NotNull
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

  @NotNull
  PsiElement getStruct();

  @NotNull List<@NotNull VlangFieldDefinition> getFieldList();

  @NotNull List<@NotNull VlangFieldDefinition> getOwnFieldList();

}
