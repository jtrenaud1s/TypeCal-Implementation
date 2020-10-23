package edu.semo.jatzs.typecal.parsenode;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents entry point of the program
 */
public class CalcNode implements ParseNode{
    private final StatementListNode statementList;

    public CalcNode(StatementListNode statementListNode) {
        this.statementList = statementListNode;
    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public ParseNode evaluate() {
        return statementList.evaluate();
    }
}
