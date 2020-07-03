package me.syrym.language.psi

import com.intellij.psi.tree.IElementType
import me.syrym.DrtLanguage

class DrtElementType(private val debugName: String) : IElementType(debugName, DrtLanguage.INSTANCE) {
}