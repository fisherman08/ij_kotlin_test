package com.ky_proj.ij_kotlin_test

/**
 * Created on 2018/01/14.
 */

import com.intellij.lang.Language


class SimpleLanguage :Language("SimpleLanguage") {
    companion object {
        @JvmStatic val INSTANCE = SimpleLanguage()
    }
}