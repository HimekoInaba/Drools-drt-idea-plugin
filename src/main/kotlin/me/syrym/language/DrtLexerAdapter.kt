package me.syrym.language

import com.intellij.lexer.FlexAdapter

class DrtLexerAdapter : FlexAdapter(DrtLexer(null)) {
}