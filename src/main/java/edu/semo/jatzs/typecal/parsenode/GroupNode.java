package edu.semo.jatzs.typecal.parsenode;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents an expression group
 */
public class GroupNode implements ParseNode{
    private final ParseNode group;
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
