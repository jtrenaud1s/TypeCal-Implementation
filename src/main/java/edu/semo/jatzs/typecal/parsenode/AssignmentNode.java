package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.TypeCalPT;

public class AssignmentNode implements ParseNode{

    private ReferenceNode referenceNode;
    private ParseNode parseNode;

    public AssignmentNode(ReferenceNode referenceNode, ParseNode parseNode) {
        this.referenceNode = referenceNode;
        this.parseNode = parseNode;
        if (referenceNode instanceof RecordReferenceNode) {
            System.out.println("record reference node");

            String child = ((RecordReferenceNode) referenceNode).getChild();
            if (TypeCalPT.getInstance().getSym().hasName(child)) {
                DeclarationNode node = (DeclarationNode)(TypeCalPT.getInstance().getSym().getValue(child));
                System.out.println(node.getClass());
            if (!node.getType().equals(parseNode.getType())){
                    if(!(referenceNode.getType().equals(Type.REAL) && parseNode.evaluate().getType().equals(Type.INTEGER)))
                    {
                        System.out.println("Types are not compatible!");
                        System.out.println(node.getType());
                        System.out.println(parseNode.getType());
                        System.exit(0);
                    }
                }
                ((DeclarationNode)((RecordDeclarationNode)TypeCalPT.getInstance().getSym().getValue(referenceNode.getId())).getSym().getValue(((RecordReferenceNode) referenceNode).getChild())).setValue(parseNode);

            } else {
                System.out.println("Record " + child + " does not exist");
            }
        } else {
            System.out.println("Not record reference node");
            if(!referenceNode.getType().equals(parseNode.evaluate().getType())){
                if(!(referenceNode.getType().equals(Type.REAL) && parseNode.evaluate().getType().equals(Type.INTEGER)))
                {
                    System.out.println("Types are not compatible!");
                    System.out.println(referenceNode.getType());
                    System.out.println(parseNode.getType());
                    System.exit(0);
                }
            }
        }

    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public ParseNode evaluate() {
        return parseNode.evaluate();
    }
}
