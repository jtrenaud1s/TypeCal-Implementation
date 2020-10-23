package edu.semo.jatzs.typecal.parsenode;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents the assignment of a value to a variable reference
 */
public class AssignmentNode implements ParseNode{

    private final ReferenceNode referenceNode;
    private final ParseNode parseNode;
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
            System.out.println("left not a number");

        } else if(right.getType() != Type.INTEGER && right.getType() != Type.REAL) {
            typeError = true;
            System.out.println("right not a number");

        } else if(left.getType() == Type.INTEGER && right.getType() != Type.INTEGER) {
            typeError = true;
            System.out.println("Real value cannot be assigned to integer variable");

        }
        if(!typeError) {
            left.setValue(right.getValue());
        } else {
            System.out.println("Type error! Integer cannot be assigned a real value!");
            System.out.println(referenceNode.getType() + " " + referenceNode.getId());
            System.out.println(parseNode.getType() + " " + right.getValue());
            System.exit(0);
        }
        return null;
    }
}
