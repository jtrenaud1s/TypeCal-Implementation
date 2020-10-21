package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.SymbolTable;

public class RecordDefinitionNode implements ParseNode{
    private String name;
    private SymbolTable sym;

    public RecordDefinitionNode(String name, SymbolTable sym) {
        this.name = name;
        this.sym = sym;
    }

    @Override
    public Type getType() {
        return Type.RECORD_DEF;
    }

    @Override
    public ParseNode evaluate() {
        return null;
    }

    public SymbolTable getSym() {
        return sym;
    }

    public String getName() {
        return name;
    }
}