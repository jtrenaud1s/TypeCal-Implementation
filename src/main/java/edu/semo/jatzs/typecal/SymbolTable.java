package edu.semo.jatzs.typecal;

import edu.semo.jatzs.typecal.parsenode.ValueNode;

import java.util.Map;

public class SymbolTable
{
    //the map of objects
    private Map<String, ValueNode> map;

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

    public SymbolTable clone() {
        SymbolTable s = new SymbolTable();
        s.map.putAll(this.map);
        return s;
    }

    //returns the set of symbols
    public java.util.Set<String> getSymbols() {
        return map.keySet();
    }

    public void print() {
        System.out.println("Symbol Table");
        for(String s : this.getSymbols()){
            System.out.printf("%s\t\t%s\n", s, this.getValue(s).toString());
        }
    }
}