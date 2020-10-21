package edu.semo.jatzs.typecal;

public class TypeCalPT {
    //symbol types    
    private static TypeCalPT instance;

    //used for error reporting
    private TypeCal parser;

    //symbol table
    private SymbolTable sym;


    public TypeCalPT(TypeCal parser) {
        this.parser = parser;
        sym = new SymbolTable();
        instance = this;
    }

    public static TypeCalPT getInstance(){
        return instance;
    }

    public SymbolTable getSym() {
        return sym;
    }
}
