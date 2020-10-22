// Output created by jacc on Thu Oct 22 16:46:56 CDT 2020

package edu.semo.jatzs.typecal;
import edu.semo.jatzs.typecal.parsenode.*;
class TypeCal implements TypeCalTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 98;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case ADD:
                            yyn = 20;
                            continue;
                        case SUB:
                            yyn = 21;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case SEMI:
                            yyn = 24;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    switch (yytok) {
                        case ID:
                            yyn = 28;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 12;
                            continue;
                        case LITERAL:
                            yyn = 15;
                            continue;
                        case LPAREN:
                            yyn = 16;
                            continue;
                        case ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    switch (yytok) {
                        case ID:
                            yyn = 32;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    switch (yytok) {
                        case ID:
                            yyn = 33;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 12;
                            continue;
                        case LITERAL:
                            yyn = 15;
                            continue;
                        case LPAREN:
                            yyn = 16;
                            continue;
                        case ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 12;
                            continue;
                        case LITERAL:
                            yyn = 15;
                            continue;
                        case LPAREN:
                            yyn = 16;
                            continue;
                        case ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 12;
                            continue;
                        case LITERAL:
                            yyn = 15;
                            continue;
                        case LPAREN:
                            yyn = 16;
                            continue;
                        case ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    switch (yytok) {
                        case ID:
                            yyn = 37;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 12;
                            continue;
                        case LITERAL:
                            yyn = 15;
                            continue;
                        case LPAREN:
                            yyn = 16;
                            continue;
                        case ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 12;
                            continue;
                        case LITERAL:
                            yyn = 15;
                            continue;
                        case LPAREN:
                            yyn = 16;
                            continue;
                        case ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 12;
                            continue;
                        case LITERAL:
                            yyn = 15;
                            continue;
                        case LPAREN:
                            yyn = 16;
                            continue;
                        case ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    switch (yytok) {
                        case END:
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    switch (yytok) {
                        case END:
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    switch (yytok) {
                        case ADD:
                            yyn = 20;
                            continue;
                        case SUB:
                            yyn = 21;
                            continue;
                        case RPAREN:
                            yyn = 42;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    switch (yytok) {
                        case END:
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    switch (yytok) {
                        case INT:
                            yyn = 14;
                            continue;
                        case REAL:
                            yyn = 17;
                            continue;
                        case ID:
                            yyn = 45;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    switch (yytok) {
                        case ADD:
                            yyn = 20;
                            continue;
                        case SUB:
                            yyn = 21;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    switch (yytok) {
                        case END:
                        case SEMI:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    switch (yytok) {
                        case END:
                            yyn = 46;
                            continue;
                        case SEMI:
                            yyn = 47;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    switch (yytok) {
                        case INT:
                            yyn = 14;
                            continue;
                        case REAL:
                            yyn = 17;
                            continue;
                        case ID:
                            yyn = 45;
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    switch (yytok) {
                        case END:
                        case SEMI:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 101;
                    continue;

                case 98:
                    return true;
                case 99:
                    yyerror("stack overflow");
                case 100:
                    return false;
                case 101:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys0() {
        switch (yytok) {
            case DECIMAL:
                return 12;
            case ID:
                return 13;
            case INT:
                return 14;
            case LITERAL:
                return 15;
            case LPAREN:
                return 16;
            case REAL:
                return 17;
            case RECORD:
                return 18;
        }
        return 101;
    }

    private int yys4() {
        switch (yytok) {
            case EXP:
                return 19;
            case RPAREN:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr22();
        }
        return 101;
    }

    private int yys6() {
        switch (yytok) {
            case RPAREN:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr18();
        }
        return 101;
    }

    private int yys8() {
        switch (yytok) {
            case DOT:
                return 22;
            case EQUAL:
                return 23;
            case EXP:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr24();
        }
        return 101;
    }

    private int yys11() {
        switch (yytok) {
            case DIV:
                return 25;
            case MUL:
                return 26;
            case RPAREN:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr15();
        }
        return 101;
    }

    private int yys12() {
        switch (yytok) {
            case EXP:
            case MUL:
            case RPAREN:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr25();
        }
        return 101;
    }

    private int yys13() {
        switch (yytok) {
            case ID:
                return 27;
            case EXP:
            case MUL:
            case EQUAL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case DOT:
            case ADD:
                return yyr27();
        }
        return 101;
    }

    private int yys15() {
        switch (yytok) {
            case EXP:
            case MUL:
            case RPAREN:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr26();
        }
        return 101;
    }

    private int yys24() {
        switch (yytok) {
            case DECIMAL:
                return 12;
            case ID:
                return 13;
            case INT:
                return 14;
            case LITERAL:
                return 15;
            case LPAREN:
                return 16;
            case REAL:
                return 17;
            case RECORD:
                return 18;
        }
        return 101;
    }

    private int yys30() {
        switch (yytok) {
            case DOT:
                return 22;
            case EXP:
            case MUL:
            case RPAREN:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr24();
        }
        return 101;
    }

    private int yys31() {
        switch (yytok) {
            case EXP:
            case MUL:
            case DIV:
            case RPAREN:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case DOT:
            case ADD:
                return yyr27();
        }
        return 101;
    }

    private int yys34() {
        switch (yytok) {
            case RPAREN:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr21();
        }
        return 101;
    }

    private int yys35() {
        switch (yytok) {
            case DIV:
                return 25;
            case MUL:
                return 26;
            case RPAREN:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr16();
        }
        return 101;
    }

    private int yys36() {
        switch (yytok) {
            case DIV:
                return 25;
            case MUL:
                return 26;
            case RPAREN:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr17();
        }
        return 101;
    }

    private int yys37() {
        switch (yytok) {
            case ID:
            case LPAREN:
            case DECIMAL:
            case END:
            case REAL:
            case RECORD:
            case INT:
            case error:
            case LITERAL:
                return 101;
        }
        return yyr28();
    }

    private int yys40() {
        switch (yytok) {
            case RPAREN:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr20();
        }
        return 101;
    }

    private int yys41() {
        switch (yytok) {
            case RPAREN:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr19();
        }
        return 101;
    }

    private int yys42() {
        switch (yytok) {
            case EXP:
            case MUL:
            case RPAREN:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr23();
        }
        return 101;
    }

    private int yyr1() { // calc : statements
        {
        calc = new CalcNode((StatementListNode) yysv[yysp-1]);
    }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr14() { // assign : ref EQUAL expr
        {
          yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
      }
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr8() { // declaration : REAL ID
        { yyrv = new DeclarationNode((String) yysv[yysp-1], Type.REAL); }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr9() { // declaration : INT ID
        { yyrv = new DeclarationNode((String) yysv[yysp-1], Type.INTEGER); }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr10() { // declaration : ID ID
        { yyrv = new RecordDeclarationNode((String)yysv[yysp-2], (String)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yypdeclaration() {
        switch (yyst[yysp-1]) {
            case 47: return 48;
            case 33: return 43;
            default: return 3;
        }
    }

    private int yyr11() { // declaration_list : declaration_list SEMI declaration
        { yyrv = addDeclaration(yysv[yysp-3], yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 44;
    }

    private int yyr12() { // declaration_list : declaration
        { yyrv = addDeclaration(null, yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 44;
    }

    private int yyr23() { // exp : LPAREN expr RPAREN
        {
   System.out.println("Group Node " + yysv[yysp-2]);
       yyrv = new GroupNode((ParseNode) yysv[yysp-2]);
   }
        yysv[yysp-=3] = yyrv;
        return 4;
    }

    private int yyr24() { // exp : ref
        {
        yyrv = yysv[yysp-1];
        if(yyrv instanceof ReferenceNode)
            System.out.println(((LiteralNode<?>)((ReferenceNode) yyrv).evaluate()).getValue());
        }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr25() { // exp : DECIMAL
        {
          System.out.println("Got double " + yysv[yysp-1]);
          yyrv = new LiteralNode<Double>((Double)yysv[yysp-1]);
      }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr26() { // exp : LITERAL
        {
        System.out.println("Got Integer " +  yysv[yysp-1]);
       yyrv = new LiteralNode<Integer>((Integer)yysv[yysp-1]);
   }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr15() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yyr16() { // expr : expr ADD term
        {
        yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
    }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : expr SUB term
        {
        yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
    }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 23: return 38;
            case 16: return 29;
            default: return 5;
        }
    }

    private int yyr21() { // factor : exp EXP factor
        {
          yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "**", (ParseNode) yysv[yysp-1]);
      }
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yyr22() { // factor : exp
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 26: return 41;
            case 25: return 40;
            case 19: return 34;
            default: return 6;
        }
    }

    private int yyr13() { // record_definition : RECORD ID declaration_list END
        {
                    yyrv = new RecordDefinitionNode((String) yysv[yysp-3].toString(), (SymbolTable) yysv[yysp-2]);
                 }
        yysv[yysp-=4] = yyrv;
        return 7;
    }

    private int yyr27() { // ref : ID
        {
        yyrv = new ReferenceNode((String) yysv[yysp-1]);
   }
        yysv[yysp-=1] = yyrv;
        return yypref();
    }

    private int yyr28() { // ref : ref DOT ID
        {
        yyrv = new RecordReferenceNode(((ReferenceNode) yysv[yysp-3]).getId(), (String) yysv[yysp-1]);
   }
        yysv[yysp-=3] = yyrv;
        return yypref();
    }

    private int yypref() {
        switch (yyst[yysp-1]) {
            case 24: return 8;
            case 0: return 8;
            default: return 30;
        }
    }

    private int yyr2() { // statement : assign
        yysp -= 1;
        return yypstatement();
    }

    private int yyr3() { // statement : declaration
        yysp -= 1;
        return yypstatement();
    }

    private int yyr4() { // statement : record_definition
        yysp -= 1;
        return yypstatement();
    }

    private int yyr5() { // statement : expr
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 0: return 9;
            default: return 39;
        }
    }

    private int yyr6() { // statements : statements SEMI statement
        {
              ((StatementListNode) yysv[yysp-3]).add(new StatementNode((ParseNode) yysv[yysp-1]));
              yyrv=yysv[yysp-3];
          }
        yysv[yysp-=3] = yyrv;
        return 10;
    }

    private int yyr7() { // statements : statement
        {
                          yyrv = new StatementListNode(new StatementNode((ParseNode) yysv[yysp-1]));
                      }
        yysv[yysp-=1] = yyrv;
        return 10;
    }

    private int yyr18() { // term : factor
        yysp -= 1;
        return yypterm();
    }

    private int yyr19() { // term : term MUL factor
        {
        yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "*", (ParseNode) yysv[yysp-1]);
    }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr20() { // term : term DIV factor
        {
        yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "/", (ParseNode) yysv[yysp-1]);
    }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 21: return 36;
            case 20: return 35;
            default: return 11;
        }
    }

    protected String[] yyerrmsgs = {
    };

    private TypeCalLexer lexer;
    private TypeCalPT pt;
    private ParseNode calc;
    
    public TypeCal(java.io.InputStream in)
    {
        lexer = new TypeCalLexer(in);
        pt = new TypeCalPT(this);
    }


    public ParseNode getCalc()
    {
        return calc;
    }

    SymbolTable addDeclaration(Object sym, Object decl) {
        if(sym == null)
            sym = new SymbolTable();
        SymbolTable table = (SymbolTable)sym;
        table.assignValue(((DeclarationNode)decl).getName(), decl);
        return table;
    }


    public int next() {
        lexer.next();

        return lexer.getToken();
    }

    
    public void yyerror(String msg) {
           lexer.printError("ERROR: " + msg);
    }


    public static void main(String [] args) {
        try {
            TypeCal parser = new TypeCal(new java.io.FileInputStream(args[0]));
            parser.next();
            if(parser.parse()) {
                parser.getCalc().evaluate();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
