package edu.semo.jatzs.typecal.parsenode;

public class StatementNode implements ParseNode{
    private ParseNode statement;
    public StatementNode(ParseNode statement) {
        this.statement = statement;
    }
    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public Object evaluate() {
        return statement.evaluate();
    }
}
