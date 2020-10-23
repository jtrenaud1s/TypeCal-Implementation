// Output created by jacc on Fri Oct 23 15:51:09 CDT 2020

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
                case 79:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 158;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 27;
                            continue;
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case ADD:
                            yyn = 31;
                            continue;
                        case SUB:
                            yyn = 32;
                            continue;
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    switch (yytok) {
                        case SEMI:
                            yyn = 39;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 161;
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
                case 97:
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
                case 98:
                    yyn = yys19();
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
                case 99:
                    switch (yytok) {
                        case ID:
                            yyn = 43;
                            continue;
                    }
                    yyn = 161;
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
                case 100:
                    yyn = yys21();
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
                case 101:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 102:
                    switch (yytok) {
                        case ID:
                            yyn = 47;
                            continue;
                    }
                    yyn = 161;
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
                case 103:
                    switch (yytok) {
                        case ID:
                            yyn = 48;
                            continue;
                    }
                    yyn = 161;
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
                case 104:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 105:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 50;
                            continue;
                    }
                    yyn = 161;
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
                case 106:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 107:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 108:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 109:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 110:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 111:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 112:
                    switch (yytok) {
                        case ID:
                            yyn = 57;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 115:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 116:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 117:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
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
                case 121:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 161;
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
                case 122:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                        case EQUAL:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    switch (yytok) {
                        case ADD:
                            yyn = 31;
                            continue;
                        case SUB:
                            yyn = 32;
                            continue;
                        case RPAREN:
                            yyn = 66;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys45();
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
                case 125:
                    yyn = yys46();
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
                case 126:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                        case EQUAL:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 161;
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
                case 127:
                    switch (yytok) {
                        case INT:
                            yyn = 20;
                            continue;
                        case REAL:
                            yyn = 23;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 18;
                            continue;
                        case LITERAL:
                            yyn = 21;
                            continue;
                        case LPAREN:
                            yyn = 22;
                            continue;
                        case SUB:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    switch (yytok) {
                        case ADD:
                            yyn = 31;
                            continue;
                        case SUB:
                            yyn = 32;
                            continue;
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case ADD:
                            yyn = 31;
                            continue;
                        case SUB:
                            yyn = 32;
                            continue;
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    switch (yytok) {
                        case END:
                        case SEMI:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    switch (yytok) {
                        case END:
                            yyn = 70;
                            continue;
                        case SEMI:
                            yyn = 71;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case ADD:
                            yyn = 31;
                            continue;
                        case SUB:
                            yyn = 32;
                            continue;
                        case RPAREN:
                            yyn = 72;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    switch (yytok) {
                        case INT:
                            yyn = 20;
                            continue;
                        case REAL:
                            yyn = 23;
                            continue;
                        case ID:
                            yyn = 75;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    switch (yytok) {
                        case DO:
                            yyn = 76;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    switch (yytok) {
                        case END:
                        case SEMI:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case END:
                        case SEMI:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case ID:
                            yyn = 42;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    switch (yytok) {
                        case SEMI:
                            yyn = 39;
                            continue;
                        case END:
                            yyn = 78;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case ENDINPUT:
                        case END:
                        case SEMI:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 158:
                    return true;
                case 159:
                    yyerror("stack overflow");
                case 160:
                    return false;
                case 161:
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
                return 18;
            case ID:
                return 19;
            case INT:
                return 20;
            case LITERAL:
                return 21;
            case LPAREN:
                return 22;
            case REAL:
                return 23;
            case RECORD:
                return 24;
            case SUB:
                return 25;
            case WHILE:
                return 26;
        }
        return 161;
    }

    private int yys4() {
        switch (yytok) {
            case EQ:
                return 28;
            case EXP:
                return 29;
            case NEQ:
                return 30;
            case ENDINPUT:
            case SUB:
            case END:
            case DIV:
            case SEMI:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr27();
        }
        return 161;
    }

    private int yys5() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr37();
    }

    private int yys7() {
        switch (yytok) {
            case ENDINPUT:
            case SUB:
            case END:
            case DIV:
            case SEMI:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr23();
        }
        return 161;
    }

    private int yys8() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr39();
    }

    private int yys11() {
        switch (yytok) {
            case DECIMAL:
            case LITERAL:
            case RPAREN:
            case DO:
            case REAL:
            case LPAREN:
            case WHILE:
            case error:
            case UNARY:
            case ID:
            case RECORD:
            case INT:
                return 161;
            case DOT:
                return 33;
            case EQUAL:
                return 34;
        }
        return yyr40();
    }

    private int yys12() {
        switch (yytok) {
            case GEQ:
                return 35;
            case GREATER:
                return 36;
            case LEQ:
                return 37;
            case LESS:
                return 38;
            case ENDINPUT:
            case EQ:
            case SUB:
            case END:
            case DIV:
            case SEMI:
            case RPAREN:
            case NEQ:
            case MUL:
            case EXP:
            case ADD:
                return yyr30();
        }
        return 161;
    }

    private int yys15() {
        switch (yytok) {
            case DIV:
                return 40;
            case MUL:
                return 41;
            case ENDINPUT:
            case SUB:
            case END:
            case SEMI:
            case RPAREN:
            case ADD:
                return yyr20();
        }
        return 161;
    }

    private int yys16() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr35();
    }

    private int yys18() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr41();
    }

    private int yys19() {
        switch (yytok) {
            case INT:
            case LPAREN:
            case UNARY:
            case REAL:
            case DECIMAL:
            case LITERAL:
            case DO:
            case WHILE:
            case RECORD:
            case RPAREN:
            case error:
                return 161;
            case ID:
                return 42;
        }
        return yyr43();
    }

    private int yys21() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr42();
    }

    private int yys39() {
        switch (yytok) {
            case DECIMAL:
                return 18;
            case ID:
                return 19;
            case INT:
                return 20;
            case LITERAL:
                return 21;
            case LPAREN:
                return 22;
            case REAL:
                return 23;
            case RECORD:
                return 24;
            case SUB:
                return 25;
            case WHILE:
                return 26;
        }
        return 161;
    }

    private int yys45() {
        switch (yytok) {
            case DO:
            case LPAREN:
            case WHILE:
            case RECORD:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case UNARY:
            case ID:
            case REAL:
            case INT:
                return 161;
            case DOT:
                return 33;
        }
        return yyr40();
    }

    private int yys46() {
        switch (yytok) {
            case REAL:
            case LPAREN:
            case WHILE:
            case RECORD:
            case DO:
            case LITERAL:
            case EQUAL:
            case error:
            case UNARY:
            case ID:
            case DECIMAL:
            case INT:
                return 161;
        }
        return yyr43();
    }

    private int yys49() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr36();
    }

    private int yys52() {
        switch (yytok) {
            case GEQ:
                return 35;
            case GREATER:
                return 36;
            case LEQ:
                return 37;
            case LESS:
                return 38;
            case ENDINPUT:
            case EQ:
            case SUB:
            case END:
            case DIV:
            case SEMI:
            case RPAREN:
            case NEQ:
            case MUL:
            case EXP:
            case ADD:
                return yyr28();
        }
        return 161;
    }

    private int yys53() {
        switch (yytok) {
            case ENDINPUT:
            case SUB:
            case END:
            case DIV:
            case SEMI:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr26();
        }
        return 161;
    }

    private int yys54() {
        switch (yytok) {
            case GEQ:
                return 35;
            case GREATER:
                return 36;
            case LEQ:
                return 37;
            case LESS:
                return 38;
            case ENDINPUT:
            case EQ:
            case SUB:
            case END:
            case DIV:
            case SEMI:
            case RPAREN:
            case NEQ:
            case MUL:
            case EXP:
            case ADD:
                return yyr29();
        }
        return 161;
    }

    private int yys55() {
        switch (yytok) {
            case DIV:
                return 40;
            case MUL:
                return 41;
            case ENDINPUT:
            case SUB:
            case END:
            case SEMI:
            case RPAREN:
            case ADD:
                return yyr21();
        }
        return 161;
    }

    private int yys56() {
        switch (yytok) {
            case DIV:
                return 40;
            case MUL:
                return 41;
            case ENDINPUT:
            case SUB:
            case END:
            case SEMI:
            case RPAREN:
            case ADD:
                return yyr22();
        }
        return 161;
    }

    private int yys57() {
        switch (yytok) {
            case error:
            case INT:
            case UNARY:
            case REAL:
            case LPAREN:
            case LITERAL:
            case DO:
            case WHILE:
            case ID:
            case RECORD:
            case DECIMAL:
                return 161;
        }
        return yyr44();
    }

    private int yys59() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr34();
    }

    private int yys60() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr32();
    }

    private int yys61() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr33();
    }

    private int yys62() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr31();
    }

    private int yys64() {
        switch (yytok) {
            case ENDINPUT:
            case SUB:
            case END:
            case DIV:
            case SEMI:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr25();
        }
        return 161;
    }

    private int yys65() {
        switch (yytok) {
            case ENDINPUT:
            case SUB:
            case END:
            case DIV:
            case SEMI:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr24();
        }
        return 161;
    }

    private int yys66() {
        switch (yytok) {
            case RECORD:
            case LPAREN:
            case WHILE:
            case UNARY:
            case DECIMAL:
            case LITERAL:
            case EQUAL:
            case error:
            case DOT:
            case ID:
            case REAL:
            case INT:
            case DO:
                return 161;
        }
        return yyr38();
    }

    private int yys76() {
        switch (yytok) {
            case DECIMAL:
                return 18;
            case ID:
                return 19;
            case INT:
                return 20;
            case LITERAL:
                return 21;
            case LPAREN:
                return 22;
            case REAL:
                return 23;
            case RECORD:
                return 24;
            case SUB:
                return 25;
            case WHILE:
                return 26;
        }
        return 161;
    }

    private int yyr1() { // calc : statements
        {
    calc = new CalcNode((StatementListNode) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr18() { // assign : ref EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr19() { // assign : declaration EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)((DeclarationNode)yysv[yysp-3]).evaluate(), (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr10() { // declaration : REAL ID
        { yyrv = new DeclarationNode((String) yysv[yysp-1], Type.REAL); }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr11() { // declaration : INT ID
        { yyrv = new DeclarationNode((String) yysv[yysp-1], Type.INTEGER); }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yypdeclaration() {
        switch (yyst[yysp-1]) {
            case 71: return 73;
            case 48: return 67;
            default: return 3;
        }
    }

    private int yyr13() { // declaration_list : declaration_list SEMI declaration
        { yyrv = addDeclaration(yysv[yysp-3], (DeclarationNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 68;
    }

    private int yyr14() { // declaration_list : declaration_list SEMI record_declaration
        { yyrv = addDeclaration(yysv[yysp-3], (DeclarationNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 68;
    }

    private int yyr15() { // declaration_list : declaration
        { yyrv = addDeclaration(null, (DeclarationNode)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 68;
    }

    private int yyr28() { // equality : equality EQ relational
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "==", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 4;
    }

    private int yyr29() { // equality : equality NEQ relational
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "~=", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 4;
    }

    private int yyr30() { // equality : relational
        yysp -= 1;
        return 4;
    }

    private int yyr38() { // exp : LPAREN expr RPAREN
        {
    yyrv = new GroupNode((ParseNode) yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr39() { // exp : other
        yysp -= 1;
        return yypexp();
    }

    private int yypexp() {
        switch (yyst[yysp-1]) {
            case 25: return 49;
            default: return 5;
        }
    }

    private int yyr20() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yyr21() { // expr : expr ADD term
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr22() { // expr : expr SUB term
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 50: return 69;
            case 34: return 58;
            case 27: return 51;
            case 22: return 44;
            default: return 6;
        }
    }

    private int yyr26() { // factor : equality EXP factor
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "**", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yyr27() { // factor : equality
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 41: return 65;
            case 40: return 64;
            case 29: return 53;
            default: return 7;
        }
    }

    private int yyr40() { // other : ref
        {
    yyrv = yysv[yysp-1];
}
        yysv[yysp-=1] = yyrv;
        return 8;
    }

    private int yyr41() { // other : DECIMAL
        {
    yyrv = new ValueNode((Double)yysv[yysp-1], Type.REAL);
}
        yysv[yysp-=1] = yyrv;
        return 8;
    }

    private int yyr42() { // other : LITERAL
        {
    yyrv = new ValueNode((Integer)yysv[yysp-1], Type.INTEGER);
}
        yysv[yysp-=1] = yyrv;
        return 8;
    }

    private int yyr12() { // record_declaration : ID ID
        { yyrv = new RecordDeclarationNode((String)yysv[yysp-2], (String)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        switch (yyst[yysp-1]) {
            case 71: return 74;
            default: return 9;
        }
    }

    private int yyr16() { // record_definition : RECORD ID declaration_list END
        {
    yyrv = new RecordDefinitionNode((String) yysv[yysp-3].toString(), (SymbolTable) yysv[yysp-2]);
}
        yysv[yysp-=4] = yyrv;
        return 10;
    }

    private int yyr43() { // ref : ID
        {
    yyrv = new ReferenceNode((String) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypref();
    }

    private int yyr44() { // ref : ref DOT ID
        {
    yyrv = new RecordReferenceNode(((ReferenceNode) yysv[yysp-3]).getId(), (String) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypref();
    }

    private int yypref() {
        switch (yyst[yysp-1]) {
            case 76: return 11;
            case 39: return 11;
            case 0: return 11;
            default: return 45;
        }
    }

    private int yyr31() { // relational : relational LESS unary
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "<", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yyprelational();
    }

    private int yyr32() { // relational : relational GREATER unary
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], ">", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yyprelational();
    }

    private int yyr33() { // relational : relational LEQ unary
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "<=", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yyprelational();
    }

    private int yyr34() { // relational : relational GEQ unary
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], ">=", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yyprelational();
    }

    private int yyr35() { // relational : unary
        yysp -= 1;
        return yyprelational();
    }

    private int yyprelational() {
        switch (yyst[yysp-1]) {
            case 30: return 54;
            case 28: return 52;
            default: return 12;
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

    private int yyr6() { // statement : while
        yysp -= 1;
        return yypstatement();
    }

    private int yyr7() { // statement : expr
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 39: return 63;
            default: return 13;
        }
    }

    private int yyr8() { // statements : statements SEMI statement
        {
    ((StatementListNode) yysv[yysp-3]).add(new StatementNode((ParseNode) yysv[yysp-1]));
    yyrv=yysv[yysp-3];
}
        yysv[yysp-=3] = yyrv;
        return yypstatements();
    }

    private int yyr9() { // statements : statement
        {
    yyrv = new StatementListNode(new StatementNode((ParseNode) yysv[yysp-1]));
}
        yysv[yysp-=1] = yyrv;
        return yypstatements();
    }

    private int yypstatements() {
        switch (yyst[yysp-1]) {
            case 0: return 14;
            default: return 77;
        }
    }

    private int yyr23() { // term : factor
        yysp -= 1;
        return yypterm();
    }

    private int yyr24() { // term : term MUL factor
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "*", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr25() { // term : term DIV factor
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "/", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 32: return 56;
            case 31: return 55;
            default: return 15;
        }
    }

    private int yyr36() { // unary : SUB exp
        {
    yyrv = new UnaryOperationNode("-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return yypunary();
    }

    private int yyr37() { // unary : exp
        yysp -= 1;
        return yypunary();
    }

    private int yypunary() {
        switch (yyst[yysp-1]) {
            case 38: return 62;
            case 37: return 61;
            case 36: return 60;
            case 35: return 59;
            default: return 16;
        }
    }

    private int yyr17() { // while : WHILE LPAREN expr RPAREN DO statements END
        {
    yyrv = new WhileNode((ParseNode)yysv[yysp-5], (StatementListNode)yysv[yysp-2]);
}
        yysv[yysp-=7] = yyrv;
        return 17;
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
