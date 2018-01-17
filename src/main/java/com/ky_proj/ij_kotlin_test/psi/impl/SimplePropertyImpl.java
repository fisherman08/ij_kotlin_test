// This is a generated file. Not intended for manual editing.
package com.ky_proj.ij_kotlin_test.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.ky_proj.ij_kotlin_test.psi.SimpleProperty;
import com.ky_proj.ij_kotlin_test.psi.SimpleVisitor;
import org.jetbrains.annotations.NotNull;

public class SimplePropertyImpl extends ASTWrapperPsiElement implements SimpleProperty {

  public SimplePropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

}
