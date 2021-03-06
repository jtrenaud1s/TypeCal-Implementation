package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.SymbolTable;
import edu.semo.jatzs.typecal.TypeCalPT;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents a reference to a field within a record instance
 */
public class RecordReferenceNode extends ReferenceNode implements ParseNode{
    private final String id;
    private final String child;

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
            SymbolTable s = (SymbolTable)((ValueNode)TypeCalPT.getInstance().getSym().getValue(this.id)).getValue();
            if(s.hasName(this.child)) {
                return (ValueNode) s.getValue(this.child);
            } else {
                System.out.println("Reference " + this.id + "." + this.child + " does not exist!");
                System.exit(0);
            }
        } else {
            System.out.println("Record " + this.id + " does not exist!b");
            System.exit(0);
        }
        return null;
    }

    @Override
    public String getId() {
        return id;
    }
}
