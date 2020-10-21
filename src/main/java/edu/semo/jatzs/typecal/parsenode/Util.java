package edu.semo.jatzs.typecal.parsenode;

public class Util {
    public static Type typeOf(ParseNode o) {
        if(o.evaluate().toString().contains(".") || o.evaluate().toString().contains("."))
            return Type.REAL;
        else
            return Type.INTEGER;
    }
}
