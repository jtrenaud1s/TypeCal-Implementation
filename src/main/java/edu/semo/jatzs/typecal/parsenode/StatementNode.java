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
    public ParseNode evaluate() {
        ParseNode stmt = statement.evaluate();
        if(stmt != null) {
            if(stmt.getType().equals(Type.INTEGER) || stmt.getType().equals(Type.REAL)) {
                System.out.println(((ValueNode)stmt).getValue());
            }
        }
        return null;
    }
}
