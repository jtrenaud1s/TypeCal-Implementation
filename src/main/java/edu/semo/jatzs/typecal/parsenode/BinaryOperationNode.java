package edu.semo.jatzs.typecal.parsenode;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents any supported Binary Operation
 */
public class BinaryOperationNode implements ParseNode{
    private final ParseNode left;
    private final ParseNode right;
    private final String operation;
    private Type type;

    public BinaryOperationNode(ParseNode left, String c, ParseNode right) {
        this.left = left;
        this.right = right;
        this.operation = c;

        if(left.getType().equals(Type.RECORD)) {
            left = left.evaluate();
        }

        if(right.getType().equals(Type.RECORD)) {
            right = right.evaluate();
        }

        boolean typeError = false;
        if(left.getType() == Type.REAL) {
            type = Type.REAL;
        } else if(left.getType() != Type.INTEGER) {
            typeError = true;
        }
        if(right.getType() == Type.REAL) {
            type = Type.REAL;
        } else if(right.getType() != Type.INTEGER) {
            typeError = true;
        }

        if(typeError) {
            System.out.println("Invalid Type");
            System.exit(-1);
        }
        this.type = (left.getType().equals(Type.INTEGER) && right.getType().equals(Type.INTEGER)) ? Type.INTEGER : Type.REAL;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public ParseNode evaluate() {
        double lval;
        double rval;
        double result;

        if(left.getType() == Type.INTEGER) {
            lval = (Integer) ((ValueNode) left.evaluate()).getValue();
        } else {
            lval = (Double) ((ValueNode) left.evaluate()).getValue();
        }

        if(right.getType() == Type.INTEGER) {
            rval = (Integer) ((ValueNode) right.evaluate()).getValue();
        } else {
            rval = (Double) ((ValueNode) right.evaluate()).getValue();
        }

        switch(operation) {
            case "+":
                result = lval + rval;
                break;
            case "-":
                result = lval - rval;
                break;
            case "*":
                result = lval * rval;
                break;
            case "/":
                result = lval / rval;
                break;
            case "**":
                result = Math.pow(lval, rval);
                break;
            case "<":
                result = lval < rval ? 1 : 0;
                break;
            case ">":
                result = lval > rval ? 1 : 0;
                break;
            case "<=":
                result = lval <= rval ? 1 : 0;
                break;
            case ">=":
                result = lval >= rval ? 1 : 0;
                break;
            case "==":
                result = lval == rval ? 1 : 0;
                break;
            case "~=":
                result = lval != rval ? 1 : 0;
                break;
            default:
                result = 0;
                break;
        }

        if(type == Type.INTEGER) {
            return new ValueNode((int) result, Type.INTEGER);
        } else {
            return new ValueNode(result, Type.REAL);
        }
    }
}
