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
        return (left.getType().equals(Type.INTEGER) && right.getType().equals(Type.INTEGER)) ? Type.INTEGER : Type.REAL;
    }

    @Override
    public ParseNode evaluate() {
        System.out.println("1. " + right.getClass());
        ParseNode lval = right.evaluate();
        System.out.println("2. " + right.getClass());
        ParseNode rval;

        if(right.getType().equals(Type.RECORD)) {
            RecordReferenceNode r = (RecordReferenceNode)right;
            right = r.evaluate();
        }
        if(left.getType().equals(Type.RECORD)) {
            RecordReferenceNode r = (RecordReferenceNode)left;
            left = r.evaluate();
        }

        if(getType().equals(Type.INTEGER)){
            lval = left.evaluate();
            rval = right.evaluate();
            switch(operation) {
                case "+":
                    System.out.println("add");

                    return new LiteralNode<>(((LiteralNode<Integer>) lval).getValue() + ((LiteralNode<Integer>) rval).getValue());
                case "-":
                    System.out.println("sub");

                    return new LiteralNode<>(((LiteralNode<Integer>) lval).getValue() - ((LiteralNode<Integer>) rval).getValue());
                case "*":
                    System.out.println("mult");

                    return new LiteralNode<>(((LiteralNode<Integer>) lval).getValue() * ((LiteralNode<Integer>) rval).getValue());
                case "/":
                    System.out.println("div");

                    return new LiteralNode<>(((LiteralNode<Integer>) lval).getValue() / ((LiteralNode<Integer>) rval).getValue());
                case "**":
                    System.out.println("Power");

                    return new LiteralNode<>((int)Math.pow(((LiteralNode<Integer>) lval).getValue(), ((LiteralNode<Integer>) rval).getValue()));
            }
        } else if (getType().equals(Type.REAL)) {
            lval = left.evaluate();
            rval = right.evaluate();

            switch(operation) {
                case "+":
                    System.out.println("add");

                    return new LiteralNode<>(((LiteralNode<Double>) lval).asDouble() + ((LiteralNode<Double>) rval).asDouble());
                case "-":
                    System.out.println("sub");

                    return new LiteralNode<>(((LiteralNode<Double>) lval).asDouble() - ((LiteralNode<Double>) rval).asDouble());
                case "*":
                    System.out.println("mult");

                    return new LiteralNode<>(((LiteralNode<Double>) lval).asDouble() * ((LiteralNode<Double>) rval).asDouble());
                case "/":
                    System.out.println("div");

                    return new LiteralNode<>(((LiteralNode<Double>) lval).getValue() / ((LiteralNode<Double>) rval).asDouble());
                case "**":
                    System.out.println("Power");
                    return new LiteralNode<>(Math.pow(((LiteralNode<Double>) lval).getValue(), ((LiteralNode<Double>) rval).asDouble()));
            }
        }
        System.out.println("BINOPNODE");
        return null;
    }
}
