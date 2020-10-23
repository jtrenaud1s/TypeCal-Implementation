package edu.semo.jatzs.typecal.parsenode;

public class ValueNode implements ParseNode{
    private Object value;
    private Type type;

    public ValueNode(Object value, Type type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public ParseNode evaluate() {
        return this;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
