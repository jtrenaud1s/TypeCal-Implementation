package edu.semo.jatzs.typecal.parsenode;

public interface ParseNode
{
    public Type getType();
    public Object evaluate();
}