package edu.semo.jatzs.typecal.parsenode;

public class BinaryOperationNode implements ParseNode{
    private ParseNode left;
    private ParseNode right;
    private String operation;
    public BinaryOperationNode(ParseNode left, String c, ParseNode right) {
        this.left = left;
        this.right = right;
        this.operation = c;
    }

    @Override
    public Type getType() {
        if(left.evaluate().toString().contains(".") || right.evaluate().toString().contains("."))
            return Type.REAL;
        else
            return Type.INTEGER;
    }

    @Override
    public Object evaluate() {
        Object lval;
        Object rval;

        if(getType().equals(Type.INTEGER)){
            lval = left.evaluate();
            rval = right.evaluate();
            switch(operation) {
                case "+":
                    return (Integer) lval + (Integer) rval;
                case "-":
                    return (Integer)lval - (Integer)rval;
                case "*":
                    return (Integer)lval * (Integer)rval;
                case "/":
                    return (Integer)lval / (Integer)rval;
                case "**":
                    return Math.pow((Integer)lval, (Integer)rval);
            }
        } else if (getType().equals(Type.REAL)) {
            lval = left.evaluate();
            rval = right.evaluate();
            switch(operation) {
                case "+":
                    return (Double) lval + (Double) rval;
                case "-":
                    return (Double)lval - (Double) rval;
                case "*":
                    return (Double)lval * (Double) rval;
                case "/":
                    return (Double)lval / (Double) rval;
                case "**":
                    return Math.pow((Integer)lval, (Integer) rval);
            }
        }
        return 0;
    }
}
