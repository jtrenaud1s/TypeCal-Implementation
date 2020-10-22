package edu.semo.jatzs.typecal.parsenode;

import java.lang.reflect.ParameterizedType;

public class LiteralNode<T> implements ParseNode{
    private T value;

    public LiteralNode(T value) {

        this.value = value;
    }


    @Override
    public Type getType() {
        return value instanceof Integer ? Type.INTEGER : Type.REAL;

    }

    @Override
    public ParseNode evaluate() {
        return this;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public double asDouble() {
        if (value instanceof Integer) {
            return (double)((int) value);
        }
        return (double)value;
    }
}
