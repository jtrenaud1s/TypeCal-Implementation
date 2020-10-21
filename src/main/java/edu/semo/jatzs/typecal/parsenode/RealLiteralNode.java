package edu.semo.jatzs.typecal.parsenode;

public class RealLiteralNode implements ParseNode{
    private double value;

    public RealLiteralNode(Double value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return Type.REAL;
    }

    @Override
    public ParseNode evaluate() {
        return null;
    }

    public double getValue() {
        return value;
    }
}
