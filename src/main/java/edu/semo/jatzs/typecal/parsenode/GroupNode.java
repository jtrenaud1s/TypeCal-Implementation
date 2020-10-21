package edu.semo.jatzs.typecal.parsenode;

public class GroupNode implements ParseNode{
    private ParseNode group;
    public GroupNode(ParseNode group) {
        this.group = group;
    }

    @Override
    public Type getType() {
        return Util.typeOf(group);
    }

    @Override
    public Object evaluate() {
        return group.evaluate();
    }
}
