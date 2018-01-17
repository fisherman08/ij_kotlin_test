package com.ky_proj.ij_kotlin_test.psi


import com.intellij.lang.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.*
import com.intellij.psi.tree.*
import com.ky_proj.ij_kotlin_test.SimpleLanguage
import com.ky_proj.ij_kotlin_test.parser.SimpleParser
import com.ky_proj.ij_kotlin_test.lexer.*
import com.ky_proj.ij_kotlin_test.psi.*

class SimpleParserDefinition : ParserDefinition {

    override fun createLexer(project: Project): Lexer {
        return SimpleLexerAdapter()
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createParser(project: Project): PsiParser {
        return SimpleParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return SimpleFile(viewProvider)
    }

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    override fun createElement(node: ASTNode): PsiElement {
        return SimpleTypes.Factory.createElement(node)
    }

    companion object {
        @JvmStatic val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        @JvmStatic val COMMENTS = TokenSet.create(SimpleTypes.COMMENT)
        @JvmStatic val FILE = IFileElementType(SimpleLanguage.INSTANCE)
    }
}