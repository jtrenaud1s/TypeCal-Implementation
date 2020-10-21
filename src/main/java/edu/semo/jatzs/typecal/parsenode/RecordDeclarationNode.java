package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.SymbolTable;
import edu.semo.jatzs.typecal.TypeCalPT;

public class RecordDeclarationNode implements ParseNode{
    private String record;
    private String id;

    public RecordDeclarationNode(String record, String id) {
        this.record = record;
        this.id = id;
    }

    @Override
    public Type getType() {
        return Type.RECORD;
    }

    @Override
    public Object evaluate() {
        if(TypeCalPT.getInstance().getSym().hasName(record)){
            if(!((ParseNode)TypeCalPT.getInstance().getSym().getValue(record)).getType().equals(Type.RECORD_DEF)) {
                System.out.println("Not a record type: " + record);
                System.exit(0);
            }
            SymbolTable table = new SymbolTable();
            for(String n : TypeCalPT.getInstance().getSym().getValue(record) {
                table.assignValue(n, TypeCalPT.getInstance().getSym().getValue(n));
            }
        } else {
            System.out.println("Not a record type: " + record);
            System.exit(0);
        }
        return null;
    }
}
