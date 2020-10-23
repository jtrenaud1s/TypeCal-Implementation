package edu.semo.jatzs.typecal.parsenode;

/**
 * Written By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents the base parse node, that all parse nodes implement from
 */
public interface ParseNode
{
    Type getType();
    ParseNode evaluate();
}