package com.ky_proj.ij_kotlin_test.lexer

/**
 * Created on 2018/01/17.
 */
import com.intellij.lexer.FlexAdapter

import java.io.Reader

class SimpleLexerAdapter : FlexAdapter(SimpleLexer(null as Reader?))