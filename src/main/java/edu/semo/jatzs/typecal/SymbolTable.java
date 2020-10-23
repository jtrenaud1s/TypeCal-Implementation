package edu.semo.jatzs.typecal;

import edu.semo.jatzs.typecal.parsenode.ValueNode;

import java.util.Map;

/**
 * Written By:
 * Dr. Robert Lowe
 *
 * Adapted By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents the assignment of a value to a variable reference
 */
public class SymbolTable
{
    //the map of objects
    private final Map<String, ValueNode> map;

    //creates an empty symbol table
    public SymbolTable() {
        //create the map for storing the symbols
        map = new java.util.HashMap<>();
    }


    //assigns a value to the symbol table, overwriting the previous value
    //if it was present
    public void assignValue(String name, ValueNode value) {
        if(hasName(name)) {
            map.replace(name, value);
        } else {
            map.put(name, value);
        }
    }


    //gets the current value of the symbol
    public Object getValue(String name) {
        if(hasName(name)) {
            return map.get(name);
        }

        return null;
    }


    //returns true if the symbol is defined
    public boolean hasName(String name) {
        return map.containsKey(name);
    }

    @Override
    public SymbolTable clone() throws CloneNotSupportedException {
        super.clone();
        SymbolTable s = new SymbolTable();
        s.map.putAll(this.map);
        return s;
    }
}