package com.ky_proj.ij_kotlin_test.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.ky_proj.ij_kotlin_test.SimpleLanguage
import com.ky_proj.ij_kotlin_test.filetype.SimpleFileType
import com.ky_proj.ij_kotlin_test.*

import javax.swing.*

class SimpleFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SimpleLanguage.INSTANCE) {

    override fun getFileType(): FileType {
        return SimpleFileType.INSTANCE
    }

    override fun toString(): String {
        return "Simple File"
    }

    override fun getIcon(flags: Int): Icon? {
        return super.getIcon(flags)
    }
}