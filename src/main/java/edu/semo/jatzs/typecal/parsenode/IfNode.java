package edu.semo.jatzs.typecal.parsenode;

public class IfNode implements ParseNode{
    private ParseNode condition;
    private StatementListNode statements;

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
