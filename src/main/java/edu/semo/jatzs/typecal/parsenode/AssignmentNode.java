package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.TypeCalPT;

public class AssignmentNode implements ParseNode{

    private ReferenceNode referenceNode;
    private ParseNode parseNode;
    private boolean typeError = false;

    public AssignmentNode(ReferenceNode referenceNode, ParseNode parseNode) {
        this.referenceNode = referenceNode;
        this.parseNode = parseNode;


    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public ParseNode evaluate() {

        ValueNode left = (ValueNode) referenceNode.evaluate();
        ValueNode right = (ValueNode) parseNode.evaluate();


        if(left.getType() != Type.INTEGER && left.getType() != Type.REAL) {
            typeError = true;
        } else if(left.getType() != Type.INTEGER && right.getType() != Type.REAL) {
            typeError = true;
        } else if(left.getType() == Type.INTEGER && right.getType() != Type.INTEGER) {
            typeError = true;
        }

        if(!typeError) {
            left.setValue(right.getValue());
        }
        return null;
    }
}
