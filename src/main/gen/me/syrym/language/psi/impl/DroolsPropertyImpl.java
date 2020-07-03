// This is a generated file. Not intended for manual editing.
package me.syrym.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.syrym.language.psi.DrtTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.syrym.language.psi.*;

public class DroolsPropertyImpl extends ASTWrapperPsiElement implements DroolsProperty {

  public DroolsPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DroolsVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DroolsVisitor) accept((DroolsVisitor)visitor);
    else super.accept(visitor);
  }

}
