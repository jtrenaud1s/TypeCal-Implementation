package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.TypeCalPT;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents a reference to a variable in a SymbolTable
 */
public class ReferenceNode implements ParseNode{
    private final String id;
    public ReferenceNode(String id) {
        this.id = id;
        if(!TypeCalPT.getInstance().getSym().hasName(id)) {
            System.out.println("Unknown symbol: " + id);
            System.exit(0);
        }
    }

    @Override
    public Type getType() {
        return ((ValueNode)TypeCalPT.getInstance().getSym().getValue(id)).getType();
    }

    @Override
    public ParseNode evaluate() {
        return ((ValueNode) TypeCalPT.getInstance().getSym().getValue(this.id)).evaluate();
    }

    public String getId() {
        return id;
    }
}
