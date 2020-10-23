package edu.semo.jatzs.typecal.parsenode;

import java.util.ArrayList;
import java.util.List;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents a list of statements
 */
public class StatementListNode implements ParseNode {
    private final List<StatementNode> statements;

    public StatementListNode() {
        statements = new ArrayList<>();
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
