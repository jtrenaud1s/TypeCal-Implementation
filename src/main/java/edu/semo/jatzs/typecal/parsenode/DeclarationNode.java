package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.TypeCalPT;

public class DeclarationNode implements ParseNode {
    private String name;
    private Type type;

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
