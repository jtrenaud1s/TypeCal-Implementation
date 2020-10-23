package edu.semo.jatzs.typecal.parsenode;

public class UnaryOperationNode implements ParseNode {
    private String operation;
    private ParseNode right;

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

        switch(operation) {
            case "-":
                result = rval * -1;
                break;
            default:
                result = 0;
                break;
        }

        if(getType() == Type.INTEGER) {
            return new ValueNode((int) result, Type.INTEGER);
        } else {
            return new ValueNode(result, Type.REAL);
        }
    }
}
