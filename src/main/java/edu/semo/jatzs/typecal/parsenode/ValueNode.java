package edu.semo.jatzs.typecal.parsenode;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents a value to be stored in some Symbol Table
 */
public class ValueNode implements ParseNode{
    private Object value;
    private final Type type;

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
