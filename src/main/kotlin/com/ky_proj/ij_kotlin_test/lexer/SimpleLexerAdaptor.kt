package com.ky_proj.ij_kotlin_test.lexer

import com.intellij.lexer.FlexAdapter
import com.ky_proj.ij_kotlin_test.lexer.*

import java.io.Reader

class SimpleLexerAdapter : FlexAdapter(SimpleLexer(null as Reader?))