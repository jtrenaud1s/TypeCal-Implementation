package edu.semo.jatzs.typecal;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Written By:
 * Dr. Robert Lowe
 *
 * Adapted By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents the assignment of a value to a variable reference
 */
public class TypeCalLexer implements TypeCalTokens {
    //constructor
    public TypeCalLexer(final InputStream in) {
        line = "";
        lineNo = 0;
        colNo = 0;
        currentChar = ' ';
        scan = new Scanner(in);
    }

    // input status
    private String line;
    private int lineNo;
    private int colNo;
    private char currentChar;
    private final Scanner scan;

    // get the next character
    private void nextChar() {
        colNo++;
        while (colNo > line.length()) {
            if (!scan.hasNext()) {
                colNo--;
                currentChar = (char) 0;
                return;
            }

            line = scan.nextLine() + "\n";
            colNo = 1;
            lineNo++;
        }

        currentChar = line.charAt(colNo - 1);
    }

    // report current line number
    public int getLineNumber() {
        return lineNo;
    }

    // report current column number
    public int getColumnNumber() {
        return colNo;
    }

    // return the current line
    public String getLine() {
        return line;
    }

    // print an error message
    public void printError(final String msg) {
        final String lineMsg = "Line " + getLineNumber() + " Column " + getColumnNumber();
        System.err.println(msg);
        System.out.printf("%s: %s", lineMsg, getLine());
        System.out.printf(" %" + lineMsg.length() + "s %" + getColumnNumber() + "s\n", "", "^");
        System.out.println();
    }

    // Lexer Status
    int token;
    Object value;

    public int getToken() {
        return token;
    }

    public Object getValue() {
        return value;
    }


    // matches a single character token
    // Returns true on match
    private boolean singleMatch(final char[] c, final int[] token) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == currentChar) {
                this.token = token[i];
                this.value = null;
                return true;
            }
        }

        return false;
    }


    //matches an id
    private void idOrKw() {
        StringBuilder sb = new StringBuilder();

        while (Character.isLetter(currentChar)) {
            sb.append(currentChar);
            nextChar();
        }

        value = sb.toString();

        if (value.equals("real")) {
            token = REAL;
        } else if (value.equals("end")) {
            token = END;
        } else if (value.equals("record")) {
            token = RECORD;
        } else if (value.equals("int")) {
            token = INT;
        } else if (value.equals("while")) {
            token = WHILE;
        } else if (value.equals("do")) {
            token = DO;
        } else if (value.equals("if")) {
            token = IF;
        } else if (value.equals("then")) {
            token = THEN;
        } else {
            token = ID;
            value = sb.toString();
        }

    }


    //matches literals 
    private void literal() {
        StringBuilder sb = new StringBuilder();

        //grab the whole number part
        while (Character.isDigit(currentChar)) {
            sb.append(currentChar);
            nextChar();
        }
        //grab the fractional part (if there is one)
        if (currentChar == '.') {
            sb.append('.');
            nextChar();
            while (Character.isDigit(currentChar)) {
                sb.append(currentChar);
                nextChar();
            }
        } else {
            value = Integer.valueOf(sb.toString());
            token = LITERAL;
            return;
        }
        token = DECIMAL;
        value = Double.valueOf(sb.toString());
    }


    // load the next token
    public void next() {
        // the keyword tokens
        final char[] c = {'+', '-', '/', ';', '(', ')', '.', '-'};
        final int[] ct = {ADD, SUB, DIV, SEMI, LPAREN, RPAREN, DOT, UNARY};

        // skip whitespace
        while (Character.isWhitespace(currentChar)) {
            nextChar();
        }

        // detect end of the file
        if (currentChar == 0) {
            token = ENDINPUT;
            return;
        }

        // assume there is an error
        token = error;
        value = String.valueOf(currentChar);

        // match strings
        if (Character.isLetter(currentChar)) {
            idOrKw();
        } else if (Character.isDigit(currentChar)) {
            literal();
        } else if (singleMatch(c, ct)) {

            nextChar();
        } else if (currentChar == '*') {
            nextChar();
            if (currentChar == '*') {
                token = EXP;
                value = null;
                nextChar();
            } else {
                token = MUL;
                value = null;
            }
        } else if (currentChar == '<') {
            nextChar();
            if (currentChar == '=') {
                token = LEQ;
                value = null;
                nextChar();
            } else {
                token = LESS;
                value = null;
            }
        } else if (currentChar == '>') {
            nextChar();
            if (currentChar == '=') {
                token = GEQ;
                value = null;
                nextChar();
            } else {
                token = GREATER;
                value = null;
            }
        } else if (currentChar == '=') {
            nextChar();
            if (currentChar == '=') {
                token = EQ;
                value = null;
                nextChar();
            } else {
                token = EQUAL;
                value = null;
            }
        } else if (currentChar == '~') {
            nextChar();
            if (currentChar == '=') {
                token = NEQ;
                value = null;
                nextChar();
            } else {
                token = error;
                value = null;
            }
        } else {
            currentChar = ' ';
        }
    }

    // convert the current token to a string
    public String toString() {
        String[] label = new String[error + 1];

        label[EQUAL] = "EQUAL";
        label[ID] = "ID";
        label[ADD] = "ADD";
        label[SUB] = "SUB";
        label[MUL] = "MUL";
        label[DIV] = "DIV";
        label[EXP] = "EXP";
        label[LITERAL] = "LITERAL";
        label[LPAREN] = "LPAREN";
        label[RPAREN] = "RPAREN";
        label[SEMI] = "SEMI";
        label[REAL] = "REAL";
        label[END] = "END";
        label[RECORD] = "RECORD";
        label[DOT] = "DOT";
        label[INT] = "INTEGER";
        label[ENDINPUT] = "ENDINPUT";
        label[DECIMAL] = "DECIMAL";
        label[UNARY] = "UNARY";
        label[EQ] = "EQ";
        label[GEQ] = "GEQ";
        label[GREATER] = "GREATER";
        label[LEQ] = "LEQ";
        label[LESS] = "LESS";
        label[NEQ] = "NEQ";
        label[IF] = "IF";
        label[DO] = "DO";
        label[THEN] = "THEN";
        label[error] = "error";

        return label[token] + ": " + value;
    }

    // test the lexer
    public static void main(final String[] args) {
        final TypeCalLexer lexer = new TypeCalLexer(System.in);

        do {
            lexer.next();
            if (lexer.getToken() == error) {
                lexer.printError("Invalid Token");
            } else {
                System.out.println(lexer);
            }
        } while (lexer.getToken() != ENDINPUT);
    }
}
