package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.SymbolTable;
import edu.semo.jatzs.typecal.TypeCalPT;

public class RecordReferenceNode extends ReferenceNode implements ParseNode{
    private String id;
    private String child;

    public RecordReferenceNode(String id, String child){
        super(id);
        this.id = id;
        this.child = child;
    }

    @Override
    public Type getType() {
        return Type.RECORD;
    }

    @Override
    public ParseNode evaluate() {
        if(TypeCalPT.getInstance().getSym().hasName(this.id)) {
            SymbolTable s = ((RecordDefinitionNode) TypeCalPT.getInstance().getSym().getValue(this.id)).getSym();
            if(s.hasName(this.child)) {
                return (DeclarationNode) s.getValue(this.child);
            } else {
                System.out.println("Reference " + this.id + "." + this.child + " does not exist!a");
                System.exit(0);
            }
        } else {
            System.out.println("Reference " + this.id + " does not exist!b");
            TypeCalPT.getInstance().getSym().print();
            System.exit(0);
        }
        return null;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getChild() {
        return child;
    }
}
