package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.SymbolTable;
import edu.semo.jatzs.typecal.TypeCalPT;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents the creation of a new instance of a record from its definition
 */
public class RecordDeclarationNode extends DeclarationNode implements ParseNode{
    private final String record;
    private final String id;
    private SymbolTable table;

    public RecordDeclarationNode(String record, String id) {
        super(id, Type.RECORD);
        this.record = record;
        this.id = id;

        if(TypeCalPT.getInstance().getSym().hasName(record)){
            if(!((ValueNode)TypeCalPT.getInstance().getSym().getValue(record)).getType().equals(Type.RECORD_DEF)) {
                System.out.println(record + " does not name a record type");
                System.exit(0);
            }
            try {
                this.table = ((SymbolTable)((ValueNode)TypeCalPT.getInstance().getSym().getValue(record)).getValue()).clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            TypeCalPT.getInstance().getSym().assignValue(id, new ValueNode(this.table, Type.RECORD));
        } else {
            System.out.println(record + " does not exist");
            System.exit(0);
        }
    }

    @Override
    public Type getType() {
        return Type.RECORD;
    }

    @Override
    public ParseNode evaluate() {
        if(TypeCalPT.getInstance().getSym().hasName(record)){
            if(!((ValueNode)TypeCalPT.getInstance().getSym().getValue(record)).getType().equals(Type.RECORD_DEF)) {
                System.out.println(record + " does not name a record type");
                System.exit(0);
            }
            try {
                this.table = ((SymbolTable)((ValueNode)TypeCalPT.getInstance().getSym().getValue(record)).getValue()).clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            TypeCalPT.getInstance().getSym().assignValue(id, new ValueNode(this.table, Type.RECORD));
        } else {
            System.out.println(record + " does not exist");
            System.exit(0);
        }
        return null;
    }
}
