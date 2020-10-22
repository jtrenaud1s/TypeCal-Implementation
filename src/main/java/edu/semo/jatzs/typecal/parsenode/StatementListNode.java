package edu.semo.jatzs.typecal.parsenode;

import java.util.ArrayList;
import java.util.List;

public class StatementListNode implements ParseNode {
    private List<StatementNode> statements;

    public StatementListNode() {
        statements = new ArrayList<StatementNode>();
    }


    public StatementListNode(StatementNode statement) {
        this();

        add(statement);
    }


    public void add(StatementNode statement) {
        statements.add(statement);
    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public ParseNode evaluate() {
        for (StatementNode s : statements) {
            s.evaluate();
        }

        return this;
    }
}
