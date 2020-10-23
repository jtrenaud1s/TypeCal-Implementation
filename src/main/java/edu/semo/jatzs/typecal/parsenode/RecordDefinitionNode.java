package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.SymbolTable;
import edu.semo.jatzs.typecal.TypeCalPT;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents the structure of a record type
 */
public class RecordDefinitionNode implements ParseNode{
    private final String name;
    private final SymbolTable sym;

    public RecordDefinitionNode(String name, SymbolTable sym) {
        this.name = name;
        this.sym = sym;
        TypeCalPT.getInstance().getSym().assignValue(name, new ValueNode(this.sym, Type.RECORD_DEF));

    }

    @Override
    public Type getType() {
        return Type.RECORD_DEF;
    }

    @Override
    public ParseNode evaluate() {
        TypeCalPT.getInstance().getSym().assignValue(name, new ValueNode(this.sym, Type.RECORD_DEF));
        return this;
    }

    public String getName() {
        return name;
    }
}
