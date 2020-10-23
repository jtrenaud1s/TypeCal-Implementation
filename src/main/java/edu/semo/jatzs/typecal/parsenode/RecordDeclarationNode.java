package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.SymbolTable;
import edu.semo.jatzs.typecal.TypeCalPT;

public class RecordDeclarationNode extends DeclarationNode implements ParseNode{
    private String record;
    private String id;
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
            this.table = ((SymbolTable)((ValueNode)TypeCalPT.getInstance().getSym().getValue(record)).getValue()).clone();
            TypeCalPT.getInstance().getSym().assignValue(id, new ValueNode(this.table, Type.RECORD));
        } else {
            System.out.println(record + " does not exist");
            System.exit(0);
        }
    }

    public SymbolTable getSym() {
        return this.table;
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
            this.table = ((SymbolTable)((ValueNode)TypeCalPT.getInstance().getSym().getValue(record)).getValue()).clone();
            TypeCalPT.getInstance().getSym().assignValue(id, new ValueNode(this.table, Type.RECORD));
        } else {
            System.out.println(record + " does not exist");
            System.exit(0);
        }
        return null;
    }
}
