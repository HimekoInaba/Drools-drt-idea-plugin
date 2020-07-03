package me.syrym.language

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import me.syrym.DrtLanguage
import me.syrym.language.parser.DrtParser
import me.syrym.language.psi.DrtFile
import me.syrym.language.psi.DrtTypes

class DrtParserDefinition : ParserDefinition {
    private val whiteSpaces = TokenSet.create(TokenType.WHITE_SPACE)
    private val comments = TokenSet.create(DrtTypes.COMMENT)

    private val file = IFileElementType(DrtLanguage.INSTANCE)

    override fun createParser(project: Project?): PsiParser = DrtParser()

    override fun createFile(viewProvider: FileViewProvider): PsiFile = DrtFile(viewProvider)

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun getFileNodeType(): IFileElementType = file

    override fun createLexer(project: Project?): Lexer = DrtLexerAdapter()

    override fun createElement(node: ASTNode?): PsiElement = DrtTypes.Factory.createElement(node)

    override fun getCommentTokens(): TokenSet = comments

    override fun getWhitespaceTokens(): TokenSet = whiteSpaces
}