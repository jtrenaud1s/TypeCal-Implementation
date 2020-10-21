package edu.semo.jatzs.typecal.parsenode;

public class CalcNode implements ParseNode{
    private StatementListNode statementList;

    public CalcNode(StatementListNode statementListNode) {
        this.statementList = statementListNode;
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public ParseNode evaluate() {
        return statementList.evaluate();
    }
}
