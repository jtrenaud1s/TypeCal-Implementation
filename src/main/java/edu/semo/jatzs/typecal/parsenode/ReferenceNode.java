package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.TypeCalPT;

public class ReferenceNode implements ParseNode{
    private String id;
    public ReferenceNode(String id) {
        this.id = id;
    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    public void set(Object value) {
        TypeCalPT.getInstance().getSym().assignValue(this.id, value);
    }

    @Override
    public ParseNode evaluate() {
        return (ParseNode) TypeCalPT.getInstance().getSym().getValue(this.id);
    }

    public String getId() {
        return id;
    }
}
