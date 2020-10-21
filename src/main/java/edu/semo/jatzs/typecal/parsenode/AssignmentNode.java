package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.TypeCalPT;

public class AssignmentNode implements ParseNode{

    private ReferenceNode referenceNode;
    private ParseNode parseNode;

    public AssignmentNode(ReferenceNode referenceNode, ParseNode parseNode) {
        this.referenceNode = referenceNode;
        this.parseNode = parseNode;
        if(Util.typeOf(referenceNode)!= Util.typeOf(parseNode)){
            System.out.println("Types are not compatible!");
            System.exit(0);
        }
    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public Object evaluate() {
        Object rhs = parseNode.evaluate();
        if(parseNode.getType().equals(referenceNode.getType())){
            TypeCalPT.getInstance().getSym().assignValue(this.referenceNode.getId(), rhs);
            return rhs;
        } else {
            System.out.println("Incompatible types!");
            return null;
        }
    }
}
