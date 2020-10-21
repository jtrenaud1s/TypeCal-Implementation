package edu.semo.jatzs.typecal.parsenode;

public class LiteralNode implements ParseNode{
    private int value;

    public LiteralNode(int value) {
        this.value = value;
    }


    @Override
    public Type getType() {
        return Type.INTEGER;
    }

    @Override
    public ParseNode evaluate() {
        return null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
