// Output created by jacc on Thu Oct 22 22:15:20 CDT 2020

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
                case 57:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 114;
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 23;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    switch (yytok) {
                        case ADD:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case SEMI:
                            yyn = 28;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    yyn = yys14();
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
                case 72:
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
                case 73:
                    yyn = yys16();
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
                case 74:
                    switch (yytok) {
                        case ID:
                            yyn = 33;
                            continue;
                    }
                    yyn = 117;
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
                case 75:
                    yyn = yys18();
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
                case 76:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 15;
                            continue;
                        case LITERAL:
                            yyn = 18;
                            continue;
                        case LPAREN:
                            yyn = 19;
                            continue;
                        case SUB:
                            yyn = 22;
                            continue;
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 117;
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
                case 77:
                    switch (yytok) {
                        case ID:
                            yyn = 37;
                            continue;
                    }
                    yyn = 117;
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
                case 78:
                    switch (yytok) {
                        case ID:
                            yyn = 38;
                            continue;
                    }
                    yyn = 117;
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
                case 79:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 15;
                            continue;
                        case LITERAL:
                            yyn = 18;
                            continue;
                        case LPAREN:
                            yyn = 19;
                            continue;
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 117;
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
                case 80:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 15;
                            continue;
                        case LITERAL:
                            yyn = 18;
                            continue;
                        case LPAREN:
                            yyn = 19;
                            continue;
                        case SUB:
                            yyn = 22;
                            continue;
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 117;
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
                case 81:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 15;
                            continue;
                        case LITERAL:
                            yyn = 18;
                            continue;
                        case LPAREN:
                            yyn = 19;
                            continue;
                        case SUB:
                            yyn = 22;
                            continue;
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 117;
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
                case 82:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 15;
                            continue;
                        case LITERAL:
                            yyn = 18;
                            continue;
                        case LPAREN:
                            yyn = 19;
                            continue;
                        case SUB:
                            yyn = 22;
                            continue;
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 117;
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
                case 83:
                    switch (yytok) {
                        case ID:
                            yyn = 43;
                            continue;
                    }
                    yyn = 117;
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
                case 84:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 15;
                            continue;
                        case LITERAL:
                            yyn = 18;
                            continue;
                        case LPAREN:
                            yyn = 19;
                            continue;
                        case SUB:
                            yyn = 22;
                            continue;
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 117;
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
                case 85:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 15;
                            continue;
                        case LITERAL:
                            yyn = 18;
                            continue;
                        case LPAREN:
                            yyn = 19;
                            continue;
                        case SUB:
                            yyn = 22;
                            continue;
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 15;
                            continue;
                        case LITERAL:
                            yyn = 18;
                            continue;
                        case LPAREN:
                            yyn = 19;
                            continue;
                        case SUB:
                            yyn = 22;
                            continue;
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 117;
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
                case 88:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 15;
                            continue;
                        case LITERAL:
                            yyn = 18;
                            continue;
                        case LPAREN:
                            yyn = 19;
                            continue;
                        case SUB:
                            yyn = 22;
                            continue;
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 117;
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
                case 89:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 117;
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
                case 90:
                    switch (yytok) {
                        case EQUAL:
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    switch (yytok) {
                        case ADD:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case RPAREN:
                            yyn = 49;
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
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
                case 94:
                    switch (yytok) {
                        case EQUAL:
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    switch (yytok) {
                        case INT:
                            yyn = 17;
                            continue;
                        case REAL:
                            yyn = 20;
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    switch (yytok) {
                        case ADD:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    switch (yytok) {
                        case ADD:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    switch (yytok) {
                        case END:
                        case SEMI:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    switch (yytok) {
                        case END:
                            yyn = 52;
                            continue;
                        case SEMI:
                            yyn = 53;
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case INT:
                            yyn = 17;
                            continue;
                        case REAL:
                            yyn = 20;
                            continue;
                        case ID:
                            yyn = 56;
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    switch (yytok) {
                        case END:
                        case SEMI:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    switch (yytok) {
                        case END:
                        case SEMI:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case ID:
                            yyn = 32;
                            continue;
                    }
                    yyn = 117;
                    continue;

                case 114:
                    return true;
                case 115:
                    yyerror("stack overflow");
                case 116:
                    return false;
                case 117:
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
                return 15;
            case ID:
                return 16;
            case INT:
                return 17;
            case LITERAL:
                return 18;
            case LPAREN:
                return 19;
            case REAL:
                return 20;
            case RECORD:
                return 21;
            case SUB:
                return 22;
        }
        return 117;
    }

    private int yys4() {
        switch (yytok) {
            case RPAREN:
            case EXP:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr27();
        }
        return 117;
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
                return yyr21();
        }
        return 117;
    }

    private int yys7() {
        switch (yytok) {
            case RPAREN:
            case EXP:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr29();
        }
        return 117;
    }

    private int yys10() {
        switch (yytok) {
            case DOT:
                return 26;
            case EQUAL:
                return 27;
            case EXP:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr30();
        }
        return 117;
    }

    private int yys13() {
        switch (yytok) {
            case DIV:
                return 29;
            case MUL:
                return 30;
            case RPAREN:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr18();
        }
        return 117;
    }

    private int yys14() {
        switch (yytok) {
            case EXP:
                return 31;
            case RPAREN:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr25();
        }
        return 117;
    }

    private int yys15() {
        switch (yytok) {
            case RPAREN:
            case EXP:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr31();
        }
        return 117;
    }

    private int yys16() {
        switch (yytok) {
            case ID:
                return 32;
            case EXP:
            case MUL:
            case EQUAL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case DOT:
            case ADD:
                return yyr33();
        }
        return 117;
    }

    private int yys18() {
        switch (yytok) {
            case RPAREN:
            case EXP:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr32();
        }
        return 117;
    }

    private int yys28() {
        switch (yytok) {
            case DECIMAL:
                return 15;
            case ID:
                return 16;
            case INT:
                return 17;
            case LITERAL:
                return 18;
            case LPAREN:
                return 19;
            case REAL:
                return 20;
            case RECORD:
                return 21;
            case SUB:
                return 22;
        }
        return 117;
    }

    private int yys35() {
        switch (yytok) {
            case DOT:
                return 26;
            case RPAREN:
            case EXP:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr30();
        }
        return 117;
    }

    private int yys36() {
        switch (yytok) {
            case EXP:
            case MUL:
            case RPAREN:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case DOT:
            case ADD:
                return yyr33();
        }
        return 117;
    }

    private int yys39() {
        switch (yytok) {
            case RPAREN:
            case EXP:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr26();
        }
        return 117;
    }

    private int yys41() {
        switch (yytok) {
            case DIV:
                return 29;
            case MUL:
                return 30;
            case RPAREN:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr19();
        }
        return 117;
    }

    private int yys42() {
        switch (yytok) {
            case DIV:
                return 29;
            case MUL:
                return 30;
            case RPAREN:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr20();
        }
        return 117;
    }

    private int yys43() {
        switch (yytok) {
            case EXP:
            case MUL:
            case EQUAL:
            case RPAREN:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case DOT:
            case ADD:
                return yyr34();
        }
        return 117;
    }

    private int yys46() {
        switch (yytok) {
            case RPAREN:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr23();
        }
        return 117;
    }

    private int yys47() {
        switch (yytok) {
            case RPAREN:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr22();
        }
        return 117;
    }

    private int yys48() {
        switch (yytok) {
            case RPAREN:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr24();
        }
        return 117;
    }

    private int yys49() {
        switch (yytok) {
            case RPAREN:
            case EXP:
            case MUL:
            case DIV:
            case ENDINPUT:
            case SUB:
            case SEMI:
            case ADD:
                return yyr28();
        }
        return 117;
    }

    private int yyr1() { // calc : statements
        {
    calc = new CalcNode((StatementListNode) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr16() { // assign : ref EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr17() { // assign : declaration EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)((DeclarationNode)yysv[yysp-3]).evaluate(), (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr9() { // declaration : REAL ID
        { yyrv = new DeclarationNode((String) yysv[yysp-1], Type.REAL); }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr10() { // declaration : INT ID
        { yyrv = new DeclarationNode((String) yysv[yysp-1], Type.INTEGER); }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yypdeclaration() {
        switch (yyst[yysp-1]) {
            case 53: return 54;
            case 38: return 50;
            default: return 3;
        }
    }

    private int yyr12() { // declaration_list : declaration_list SEMI declaration
        { yyrv = addDeclaration(yysv[yysp-3], (DeclarationNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 51;
    }

    private int yyr13() { // declaration_list : declaration_list SEMI record_declaration
        { yyrv = addDeclaration(yysv[yysp-3], (DeclarationNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 51;
    }

    private int yyr14() { // declaration_list : declaration
        { yyrv = addDeclaration(null, (DeclarationNode)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 51;
    }

    private int yyr28() { // exp : LPAREN expr RPAREN
        {
    yyrv = new GroupNode((ParseNode) yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr29() { // exp : other
        yysp -= 1;
        return yypexp();
    }

    private int yypexp() {
        switch (yyst[yysp-1]) {
            case 22: return 39;
            default: return 4;
        }
    }

    private int yyr18() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yyr19() { // expr : expr ADD term
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr20() { // expr : expr SUB term
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 27: return 44;
            case 23: return 40;
            case 19: return 34;
            default: return 5;
        }
    }

    private int yyr24() { // factor : unary EXP factor
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "**", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yyr25() { // factor : unary
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 31: return 48;
            case 30: return 47;
            case 29: return 46;
            default: return 6;
        }
    }

    private int yyr30() { // other : ref
        {
    yyrv = yysv[yysp-1];
}
        yysv[yysp-=1] = yyrv;
        return 7;
    }

    private int yyr31() { // other : DECIMAL
        {
    yyrv = new ValueNode((Double)yysv[yysp-1], Type.REAL);
}
        yysv[yysp-=1] = yyrv;
        return 7;
    }

    private int yyr32() { // other : LITERAL
        {
    yyrv = new ValueNode((Integer)yysv[yysp-1], Type.INTEGER);
}
        yysv[yysp-=1] = yyrv;
        return 7;
    }

    private int yyr11() { // record_declaration : ID ID
        { yyrv = new RecordDeclarationNode((String)yysv[yysp-2], (String)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        switch (yyst[yysp-1]) {
            case 53: return 55;
            default: return 8;
        }
    }

    private int yyr15() { // record_definition : RECORD ID declaration_list END
        {
    yyrv = new RecordDefinitionNode((String) yysv[yysp-3].toString(), (SymbolTable) yysv[yysp-2]);
}
        yysv[yysp-=4] = yyrv;
        return 9;
    }

    private int yyr33() { // ref : ID
        {
    yyrv = new ReferenceNode((String) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypref();
    }

    private int yyr34() { // ref : ref DOT ID
        {
    yyrv = new RecordReferenceNode(((ReferenceNode) yysv[yysp-3]).getId(), (String) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypref();
    }

    private int yypref() {
        switch (yyst[yysp-1]) {
            case 28: return 10;
            case 0: return 10;
            default: return 35;
        }
    }

    private int yyr2() { // statement : declaration
        yysp -= 1;
        return yypstatement();
    }

    private int yyr3() { // statement : record_declaration
        yysp -= 1;
        return yypstatement();
    }

    private int yyr4() { // statement : assign
        yysp -= 1;
        return yypstatement();
    }

    private int yyr5() { // statement : record_definition
        yysp -= 1;
        return yypstatement();
    }

    private int yyr6() { // statement : expr
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 0: return 11;
            default: return 45;
        }
    }

    private int yyr7() { // statements : statements SEMI statement
        {
    ((StatementListNode) yysv[yysp-3]).add(new StatementNode((ParseNode) yysv[yysp-1]));
    yyrv=yysv[yysp-3];
}
        yysv[yysp-=3] = yyrv;
        return 12;
    }

    private int yyr8() { // statements : statement
        {
    yyrv = new StatementListNode(new StatementNode((ParseNode) yysv[yysp-1]));
}
        yysv[yysp-=1] = yyrv;
        return 12;
    }

    private int yyr21() { // term : factor
        yysp -= 1;
        return yypterm();
    }

    private int yyr22() { // term : term MUL factor
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "*", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr23() { // term : term DIV factor
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "/", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 25: return 42;
            case 24: return 41;
            default: return 13;
        }
    }

    private int yyr26() { // unary : SUB exp
        {
    yyrv = new UnaryOperationNode("-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 14;
    }

    private int yyr27() { // unary : exp
        yysp -= 1;
        return 14;
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
        DeclarationNode declaration = (DeclarationNode)decl;
        table.assignValue(declaration.getName(), new ValueNode(null, declaration.getType()));
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
