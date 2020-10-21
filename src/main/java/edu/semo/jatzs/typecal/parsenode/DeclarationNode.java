package edu.semo.jatzs.typecal.parsenode;

public class DeclarationNode implements ParseNode {
    private String name;
    private Type type;
    private ParseNode value;

    public DeclarationNode(String name, Type type) {
        this.name = name;
        this.type = type;
        this.value = null;
    }

    public void setValue(ParseNode value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Object evaluate() {
        return this.value;
    }
}
