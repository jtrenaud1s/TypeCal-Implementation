package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.TypeCalPT;

public class ReferenceNode implements ParseNode{
    private String id;
    public ReferenceNode(String id) {
        this.id = id;
        if(!TypeCalPT.getInstance().getSym().hasName(id)) {
            System.out.println("Unknown symbol: " + id);
            System.exit(0);
        }
    }

    @Override
    public Type getType() {
        return ((ValueNode)TypeCalPT.getInstance().getSym().getValue(id)).getType();
    }

    public void set(Object value) {
        ((ValueNode)TypeCalPT.getInstance().getSym().getValue(id)).setValue(value);
    }

    @Override
    public ParseNode evaluate() {
        return ((ValueNode) TypeCalPT.getInstance().getSym().getValue(this.id)).evaluate();
    }

    public String getId() {
        return id;
    }
}
