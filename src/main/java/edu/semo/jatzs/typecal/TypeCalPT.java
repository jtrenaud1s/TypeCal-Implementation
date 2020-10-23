package edu.semo.jatzs.typecal;

/**
 * Written By:
 * Dr. Robert Lowe
 *
 * Adapted By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents the assignment of a value to a variable reference
 */
public class TypeCalPT {
    //symbol types    
    private static TypeCalPT instance;

    //symbol table
    private final SymbolTable sym;


    public TypeCalPT() {
        //used for error reporting
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
