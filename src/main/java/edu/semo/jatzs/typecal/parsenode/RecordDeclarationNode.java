package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.SymbolTable;
import edu.semo.jatzs.typecal.TypeCalPT;

public class RecordDeclarationNode implements ParseNode{
    private String record;
    private String id;
    private SymbolTable table;

    public RecordDeclarationNode(String record, String id) {
        this.record = record;
        this.id = id;

        if(TypeCalPT.getInstance().getSym().hasName(record)){
            if(!((ParseNode)TypeCalPT.getInstance().getSym().getValue(record)).getType().equals(Type.RECORD_DEF)) {
                System.out.println(record + " does not name a type");
                System.exit(0);
            }
            this.table = ((RecordDefinitionNode)TypeCalPT.getInstance().getSym().getValue(record)).getSym().clone();
            TypeCalPT.getInstance().getSym().assignValue(id, this);
        } else {
            System.out.println(record + " does not name a type");
            System.exit(0);
        }
    }

    public SymbolTable getSym() {
        return this.table;
    }

    public ParseNode get(String name) {
        if(table.hasName(name)) {
            return (ParseNode) table.getValue(name);
        } else {
            System.out.println("Ref " + name + " does not exists in " + id);
            System.exit(0);
        }
        return null;
    }

    @Override
    public Type getType() {
        return Type.RECORD;
    }

    @Override
    public ParseNode evaluate() {

        return null;
    }
}
