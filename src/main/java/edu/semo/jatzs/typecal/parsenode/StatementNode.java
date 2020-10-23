package edu.semo.jatzs.typecal.parsenode;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents a statement that evaluates to null (void line)
 */
public class StatementNode implements ParseNode{
    private final ParseNode statement;
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
        if(stmt instanceof ValueNode) {
            if(stmt.getType().equals(Type.INTEGER) || stmt.getType().equals(Type.REAL)) {
                System.out.println(((ValueNode)stmt).getValue());
            }
        }
        return null;
    }
}
