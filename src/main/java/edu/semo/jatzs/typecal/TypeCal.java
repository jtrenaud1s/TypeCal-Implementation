package edu.semo.jatzs.typecal;// Output created by jacc on Tue Oct 20 15:00:00 CDT 2020


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
                case 50:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                            yyn = 100;
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case TypeCalTokens.ADD:
                            yyn = 19;
                            continue;
                        case TypeCalTokens.SUB:
                            yyn = 20;
                            continue;
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    switch (yytok) {
                        case TypeCalTokens.SEMI:
                            yyn = 23;
                            continue;
                        case TypeCalTokens.ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
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
                case 62:
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
                case 63:
                    switch (yytok) {
                        case TypeCalTokens.ID:
                            yyn = 27;
                            continue;
                    }
                    yyn = 103;
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
                case 64:
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
                case 65:
                    switch (yytok) {
                        case TypeCalTokens.LITERAL:
                            yyn = 14;
                            continue;
                        case TypeCalTokens.LPAREN:
                            yyn = 15;
                            continue;
                        case TypeCalTokens.ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 103;
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
                case 66:
                    switch (yytok) {
                        case TypeCalTokens.ID:
                            yyn = 32;
                            continue;
                    }
                    yyn = 103;
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
                case 67:
                    switch (yytok) {
                        case TypeCalTokens.ID:
                            yyn = 33;
                            continue;
                    }
                    yyn = 103;
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
                case 68:
                    switch (yytok) {
                        case TypeCalTokens.LITERAL:
                            yyn = 14;
                            continue;
                        case TypeCalTokens.LPAREN:
                            yyn = 15;
                            continue;
                        case TypeCalTokens.ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 103;
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
                case 69:
                    switch (yytok) {
                        case TypeCalTokens.LITERAL:
                            yyn = 14;
                            continue;
                        case TypeCalTokens.LPAREN:
                            yyn = 15;
                            continue;
                        case TypeCalTokens.ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 103;
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
                case 70:
                    switch (yytok) {
                        case TypeCalTokens.LITERAL:
                            yyn = 14;
                            continue;
                        case TypeCalTokens.LPAREN:
                            yyn = 15;
                            continue;
                        case TypeCalTokens.ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 103;
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
                case 71:
                    switch (yytok) {
                        case TypeCalTokens.ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 103;
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
                case 72:
                    switch (yytok) {
                        case TypeCalTokens.LITERAL:
                            yyn = 14;
                            continue;
                        case TypeCalTokens.LPAREN:
                            yyn = 15;
                            continue;
                        case TypeCalTokens.ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 103;
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
                case 73:
                    yyn = yys23();
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
                case 74:
                    switch (yytok) {
                        case TypeCalTokens.LITERAL:
                            yyn = 14;
                            continue;
                        case TypeCalTokens.LPAREN:
                            yyn = 15;
                            continue;
                        case TypeCalTokens.ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 103;
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
                case 75:
                    switch (yytok) {
                        case TypeCalTokens.LITERAL:
                            yyn = 14;
                            continue;
                        case TypeCalTokens.LPAREN:
                            yyn = 15;
                            continue;
                        case TypeCalTokens.ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 103;
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
                case 76:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                        case TypeCalTokens.END:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 103;
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
                case 77:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                        case TypeCalTokens.END:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 103;
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
                case 78:
                    switch (yytok) {
                        case TypeCalTokens.LITERAL:
                            yyn = 42;
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    switch (yytok) {
                        case TypeCalTokens.ADD:
                            yyn = 19;
                            continue;
                        case TypeCalTokens.SUB:
                            yyn = 20;
                            continue;
                        case TypeCalTokens.RPAREN:
                            yyn = 43;
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
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
                case 81:
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
                case 82:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                        case TypeCalTokens.END:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 103;
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
                case 83:
                    switch (yytok) {
                        case TypeCalTokens.INT:
                            yyn = 13;
                            continue;
                        case TypeCalTokens.REAL:
                            yyn = 16;
                            continue;
                        case TypeCalTokens.ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    switch (yytok) {
                        case TypeCalTokens.ADD:
                            yyn = 19;
                            continue;
                        case TypeCalTokens.SUB:
                            yyn = 20;
                            continue;
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
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
                case 92:
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
                case 93:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    switch (yytok) {
                        case TypeCalTokens.SEMI:
                            yyn = 47;
                            continue;
                        case TypeCalTokens.END:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    switch (yytok) {
                        case TypeCalTokens.END:
                            yyn = 48;
                            continue;
                    }
                    yyn = 103;
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
                case 96:
                    switch (yytok) {
                        case TypeCalTokens.ID:
                            yyn = 26;
                            continue;
                    }
                    yyn = 103;
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
                case 97:
                    switch (yytok) {
                        case TypeCalTokens.INT:
                            yyn = 13;
                            continue;
                        case TypeCalTokens.REAL:
                            yyn = 16;
                            continue;
                        case TypeCalTokens.ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    switch (yytok) {
                        case TypeCalTokens.ENDINPUT:
                        case TypeCalTokens.SEMI:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    switch (yytok) {
                        case TypeCalTokens.END:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 103;
                    continue;

                case 100:
                    return true;
                case 101:
                    yyerror("stack overflow");
                case 102:
                    return false;
                case 103:
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
            case TypeCalTokens.ID:
                return 12;
            case TypeCalTokens.INT:
                return 13;
            case TypeCalTokens.LITERAL:
                return 14;
            case TypeCalTokens.LPAREN:
                return 15;
            case TypeCalTokens.REAL:
                return 16;
            case TypeCalTokens.RECORD:
                return 17;
        }
        return 103;
    }

    private int yys4() {
        switch (yytok) {
            case TypeCalTokens.EXP:
                return 18;
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr22();
        }
        return 103;
    }

    private int yys6() {
        switch (yytok) {
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr18();
        }
        return 103;
    }

    private int yys8() {
        switch (yytok) {
            case TypeCalTokens.DOT:
                return 21;
            case TypeCalTokens.EQUAL:
                return 22;
            case TypeCalTokens.MUL:
            case TypeCalTokens.EXP:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr24();
        }
        return 103;
    }

    private int yys11() {
        switch (yytok) {
            case TypeCalTokens.DIV:
                return 24;
            case TypeCalTokens.MUL:
                return 25;
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.ADD:
                return yyr15();
        }
        return 103;
    }

    private int yys12() {
        switch (yytok) {
            case TypeCalTokens.ID:
                return 26;
            case TypeCalTokens.MUL:
            case TypeCalTokens.EXP:
            case TypeCalTokens.DOT:
            case TypeCalTokens.EQUAL:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr27();
        }
        return 103;
    }

    private int yys14() {
        switch (yytok) {
            case TypeCalTokens.DOT:
                return 28;
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.EXP:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr25();
        }
        return 103;
    }

    private int yys23() {
        switch (yytok) {
            case TypeCalTokens.ID:
                return 12;
            case TypeCalTokens.INT:
                return 13;
            case TypeCalTokens.LITERAL:
                return 14;
            case TypeCalTokens.LPAREN:
                return 15;
            case TypeCalTokens.REAL:
                return 16;
            case TypeCalTokens.RECORD:
                return 17;
        }
        return 103;
    }

    private int yys30() {
        switch (yytok) {
            case TypeCalTokens.DOT:
                return 21;
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.EXP:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr24();
        }
        return 103;
    }

    private int yys31() {
        switch (yytok) {
            case TypeCalTokens.ID:
            case TypeCalTokens.LPAREN:
            case TypeCalTokens.END:
            case TypeCalTokens.INT:
            case TypeCalTokens.REAL:
            case TypeCalTokens.RECORD:
            case TypeCalTokens.INTEGER:
            case TypeCalTokens.error:
            case TypeCalTokens.LITERAL:
                return 103;
        }
        return yyr27();
    }

    private int yys34() {
        switch (yytok) {
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr21();
        }
        return 103;
    }

    private int yys35() {
        switch (yytok) {
            case TypeCalTokens.DIV:
                return 24;
            case TypeCalTokens.MUL:
                return 25;
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.ADD:
                return yyr16();
        }
        return 103;
    }

    private int yys36() {
        switch (yytok) {
            case TypeCalTokens.DIV:
                return 24;
            case TypeCalTokens.MUL:
                return 25;
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.ADD:
                return yyr17();
        }
        return 103;
    }

    private int yys37() {
        switch (yytok) {
            case TypeCalTokens.DOT:
                return 21;
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.EXP:
            case TypeCalTokens.EQUAL:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr28();
        }
        return 103;
    }

    private int yys40() {
        switch (yytok) {
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr20();
        }
        return 103;
    }

    private int yys41() {
        switch (yytok) {
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr19();
        }
        return 103;
    }

    private int yys42() {
        switch (yytok) {
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.EXP:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr26();
        }
        return 103;
    }

    private int yys43() {
        switch (yytok) {
            case TypeCalTokens.RPAREN:
            case TypeCalTokens.MUL:
            case TypeCalTokens.EXP:
            case TypeCalTokens.ENDINPUT:
            case TypeCalTokens.SUB:
            case TypeCalTokens.SEMI:
            case TypeCalTokens.DIV:
            case TypeCalTokens.ADD:
                return yyr23();
        }
        return 103;
    }

    private int yyr1() { // calc : statements
        {
        yyrv = new CalcNode((StatementListNode) yysv[yysp-1]);
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
        {
               yyrv = new RealDeclarationNode((String) yysv[yysp-1].toString());
           }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr9() { // declaration : INT ID
        {
               yyrv = new IntegerDeclarationNode((String) yysv[yysp-1].toString());
           }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr10() { // declaration : ID ID
        {
               yyrv = new IDDeclarationNode((String) yysv[yysp-2].toString(), (String) yysv[yysp-1].toString());
           }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yypdeclaration() {
        switch (yyst[yysp-1]) {
            case 23: return 3;
            case 0: return 3;
            default: return 44;
        }
    }

    private int yyr11() { // declarations : declaration
        yysp -= 1;
        return yypdeclarations();
    }

    private int yyr12() { // declarations : declaration SEMI declarations
        yysp -= 3;
        return yypdeclarations();
    }

    private int yypdeclarations() {
        switch (yyst[yysp-1]) {
            case 33: return 45;
            default: return 49;
        }
    }

    private int yyr23() { // exp : LPAREN expr RPAREN
        {
        yyrv = new GroupNode((ParseNode) yysv[yysp-2]);
    }
        yysv[yysp-=3] = yyrv;
        return 4;
    }

    private int yyr24() { // exp : ref
        yysp -= 1;
        return 4;
    }

    private int yyr25() { // exp : LITERAL
        {
        yyrv = new LiteralNode(yysv[yysp-1].toString());
   }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr26() { // exp : LITERAL DOT LITERAL
        {
       yyrv = new RealLiteralNode(value);
   }
        yysv[yysp-=3] = yyrv;
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
            case 22: return 38;
            case 15: return 29;
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
            case 25: return 41;
            case 24: return 40;
            case 18: return 34;
            default: return 6;
        }
    }

    private int yyr13() { // recorddefinition : RECORD ID declarations END
        {
                    yyrv = new RecordDefinitionNode(yysv[yysp-4].toString(), (StatementListNode) yysv[yysp-2], name, sym);
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

    private int yyr28() { // ref : ref DOT ref
        {
        yyrv = ((RecordReferenceNode)yysv[yysp-3]).getSymbol((ReferenceNode)yysv[yysp-2]);
   }
        yysv[yysp-=3] = yyrv;
        return yypref();
    }

    private int yypref() {
        switch (yyst[yysp-1]) {
            case 23: return 8;
            case 21: return 37;
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

    private int yyr4() { // statement : recorddefinition
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

    private int yyr6() { // statements : statement
        {
              yyrv = new StatementNode((ParseNode) yysv[yysp-1]);
          }
        yysv[yysp-=1] = yyrv;
        return 10;
    }

    private int yyr7() { // statements : statements SEMI statement
        {
              ((StatementListNode) yysv[yysp-3]).add((StatementNode) yysv[yysp-2]);
              yyrv=yysv[yysp-3];
          }
        yysv[yysp-=3] = yyrv;
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
            case 20: return 36;
            case 19: return 35;
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
            System.out.println(e);
        }
    }

}
