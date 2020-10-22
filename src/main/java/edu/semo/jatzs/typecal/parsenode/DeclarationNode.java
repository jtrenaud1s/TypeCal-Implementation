package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.TypeCalPT;

public class DeclarationNode implements ParseNode {
    private String name;
    private Type type;
    private ParseNode value;

    public DeclarationNode(String name, Type type) {
        this.name = name;
        this.type = type;
        this.value = null;
        TypeCalPT.getInstance().getSym().assignValue(name, this);
    }

    public void setValue(ParseNode value) {
        this.value = value;
    }
    public ParseNode getValue() {
        return value;
    }


    @Override
    public Type getType() {
        return type;
    }

    @Override
    public ParseNode evaluate() {
        return value;
    }

    public String getName() {
        return name;
    }
}
