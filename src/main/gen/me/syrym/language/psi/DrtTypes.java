// This is a generated file. Not intended for manual editing.
package me.syrym.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.syrym.language.psi.impl.*;

public interface DrtTypes {

  IElementType PROPERTY = new DrtElementType("PROPERTY");

  IElementType COMMENT = new DrtTokenType("COMMENT");
  IElementType CRLF = new DrtTokenType("CRLF");
  IElementType KEY = new DrtTokenType("KEY");
  IElementType SEPARATOR = new DrtTokenType("SEPARATOR");
  IElementType VALUE = new DrtTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new DroolsPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
