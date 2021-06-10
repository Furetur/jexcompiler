package ast

interface AstNode {
    val children: List<AstNode>
}

interface Expression : AstNode

interface Statement : AstNode

abstract class TerminalAstNode : Expression {
    abstract val token: Token
    override val children: List<AstNode> = emptyList()
}

class Identifier(val token: Token) : AstNode {
    override val children = emptyList<AstNode>()
}

data class Token(val text: String, val line: Int, val position: Int)