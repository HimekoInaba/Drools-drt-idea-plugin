package me.syrym.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import me.syrym.DrtFileType
import me.syrym.DrtLanguage

class DrtFile constructor(viewProvider: FileViewProvider): PsiFileBase(viewProvider, DrtLanguage.INSTANCE) {
    override fun getFileType(): FileType = DrtFileType.INSTANCE

    override fun toString(): String = "Drools Drt File"
}