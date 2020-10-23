package edu.semo.jatzs.typecal.parsenode;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents an if statement
 */
public class IfNode implements ParseNode{
    private final ParseNode condition;
    private final StatementListNode statements;

    public IfNode(ParseNode condition, StatementListNode statements) {
        this.condition = condition;
        this.statements = statements;
    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public ParseNode evaluate() {
        if((int)((ValueNode)condition.evaluate()).getValue() != 0) {
            statements.evaluate();
        }
        return null;
    }
}
