package edu.semo.jatzs.typecal.parsenode;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents a unary negation
 */
public class UnaryOperationNode implements ParseNode {
    private final String operation;
    private final ParseNode right;

    public UnaryOperationNode(String operation, ParseNode right) {
        this.operation = operation;
        this.right = right;

        if(!(right.getType().equals(Type.INTEGER) || right.getType().equals(Type.REAL))) {
            System.out.println("Incompatibly type, must be integer or real");
            System.exit(0);
        }
    }

    @Override
    public Type getType() {
        return right.getType();
    }

    @Override
    public ParseNode evaluate() {
        double rval;
        double result;

        if(right.getType() == Type.INTEGER) {
            rval = (Integer) ((ValueNode) right.evaluate()).getValue();
        } else {
            rval = (Double) ((ValueNode) right.evaluate()).getValue();
        }

        if ("-".equals(operation)) {
            result = rval * -1;
        } else {
            result = 0;
        }

        if(getType() == Type.INTEGER) {
            return new ValueNode((int) result, Type.INTEGER);
        } else {
            return new ValueNode(result, Type.REAL);
        }
    }
}
