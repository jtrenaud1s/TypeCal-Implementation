package edu.semo.jatzs.typecal.parsenode;

public class GroupNode implements ParseNode{
    private ParseNode group;
    public GroupNode(ParseNode group) {
        this.group = group;
    }

    @Override
    public Type getType() {
        return group.getType();
    }

    @Override
    public ParseNode evaluate() {
        return group.evaluate();
    }
}
