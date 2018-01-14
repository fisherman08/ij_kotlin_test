package com.ky_proj.ij_kotlin_test.filetype

/**
 * Created on 2018/01/14.
 */

import com.intellij.openapi.fileTypes.LanguageFileType
import com.ky_proj.ij_kotlin_test.SimpleLanguage
import com.ky_proj.ij_kotlin_test.icon.SimpleIcons
import org.jetbrains.annotations.*

import javax.swing.*

class SimpleFileType private constructor() : LanguageFileType(SimpleLanguage.INSTANCE) {

    override fun getName(): String {
        return "Simple file"
    }

    override fun getDescription(): String {
        return "Simple language file"
    }

    override fun getDefaultExtension(): String {
        return "simple"
    }

    override fun getIcon(): Icon? {
        return SimpleIcons.FILE
    }

    companion object {
        @JvmField val INSTANCE = SimpleFileType()
    }
}