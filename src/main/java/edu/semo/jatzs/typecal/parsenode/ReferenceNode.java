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
        return ((ParseNode)TypeCalPT.getInstance().getSym().getValue(id)).getType();
    }

    public void set(Object value) {
        TypeCalPT.getInstance().getSym().assignValue(this.id, value);
    }

    public Object getValue() {
        System.out.println(id);
        return ((LiteralNode)((DeclarationNode)TypeCalPT.getInstance().getSym().getValue(id)).evaluate()).getValue();
    }

    @Override
    public ParseNode evaluate() {
        return ((ParseNode) TypeCalPT.getInstance().getSym().getValue(this.id)).evaluate();
    }

    public String getId() {
        return id;
    }
}
