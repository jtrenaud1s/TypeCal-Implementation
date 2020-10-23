package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.TypeCalPT;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents a variable declaration
 */
public class DeclarationNode implements ParseNode {
    private final String name;
    private final Type type;

    public DeclarationNode(String name, Type type) {
        this.name = name;
        this.type = type;
        TypeCalPT.getInstance().getSym().assignValue(name, new ValueNode(null, type));
    }
    @Override
    public Type getType() {
        return type;
    }

    @Override
    public ParseNode evaluate() {
        TypeCalPT.getInstance().getSym().assignValue(name, new ValueNode(null, type));
        return new ReferenceNode(this.name);
    }

    public String getName() {
        return name;
    }
}
