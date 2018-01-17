package com.ky_proj.ij_kotlin_test.psi

import com.intellij.psi.tree.IElementType
import com.ky_proj.ij_kotlin_test.SimpleLanguage
import org.jetbrains.annotations.*

class SimpleTokenType(@NonNls debugName: String) : IElementType(debugName, SimpleLanguage.INSTANCE) {

    override fun toString(): String {
        return "SimpleTokenType." + super.toString()
    }
}