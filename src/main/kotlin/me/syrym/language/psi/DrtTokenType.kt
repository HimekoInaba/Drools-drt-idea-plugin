package me.syrym.language.psi

import com.intellij.psi.tree.IElementType
import me.syrym.DrtLanguage

class DrtTokenType(val debugName: String) : IElementType(debugName, DrtLanguage.INSTANCE) {
    override fun toString(): String = "DrtTokenType." + super.toString()
}