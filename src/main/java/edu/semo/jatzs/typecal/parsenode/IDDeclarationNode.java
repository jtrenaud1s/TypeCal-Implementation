package edu.semo.jatzs.typecal.parsenode;

public class IDDeclarationNode implements ParseNode{
    public IDDeclarationNode(String s, String s1) {
    }

    @Override
    public Type getType() {
        return Type.RECORD;
    }

    @Override
    public Object evaluate() {
        return null;
    }
}
