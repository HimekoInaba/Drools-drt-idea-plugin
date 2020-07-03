package me.syrym

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class DrtFileType private constructor(): LanguageFileType(DrtLanguage.INSTANCE) {
    companion object {
        @JvmStatic val INSTANCE = DrtFileType()
    }

    override fun getIcon(): Icon? = DrtIcon.FILE

    override fun getName(): String = "Drools Drt"

    override fun getDefaultExtension(): String = "drt"

    override fun getDescription(): String = "JBoss Drools"
}