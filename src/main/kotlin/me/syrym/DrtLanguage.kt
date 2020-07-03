package me.syrym

import com.intellij.lang.Language

class DrtLanguage private constructor() : Language("Drt") {
    companion object {
        @JvmStatic val INSTANCE = DrtLanguage()
    }
}