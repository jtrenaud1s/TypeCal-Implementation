package edu.semo.jatzs.typecal.parsenode;

public class RealLiteralNode implements ParseNode{
    private Double value;

    public RealLiteralNode(Double value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return Type.REAL;
    }

    @Override
    public Object evaluate() {
        return value;
    }
}
