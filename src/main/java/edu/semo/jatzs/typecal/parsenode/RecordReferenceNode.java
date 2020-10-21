package edu.semo.jatzs.typecal.parsenode;

import edu.semo.jatzs.typecal.SymbolTable;

public class RecordReferenceNode implements ParseNode{
    private SymbolTable sym;

    public RecordReferenceNode(ReferenceNode id, ReferenceNode symbol){
        this.sym = new SymbolTable();
    }

    public Object getSymbol(ReferenceNode referenceNode) {
        return sym.getValue(referenceNode.getId());
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
