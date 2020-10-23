// Output created by jacc on Fri Oct 23 16:26:40 CDT 2020

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
                case 88:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 176;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 29;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    switch (yytok) {
                        case ADD:
                            yyn = 33;
                            continue;
                        case SUB:
                            yyn = 34;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    switch (yytok) {
                        case SEMI:
                            yyn = 41;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 179;
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
                case 107:
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
                case 108:
                    yyn = yys20();
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
                case 109:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 45;
                            continue;
                    }
                    yyn = 179;
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
                case 110:
                    switch (yytok) {
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 179;
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
                case 111:
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
                case 112:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 113:
                    switch (yytok) {
                        case ID:
                            yyn = 50;
                            continue;
                    }
                    yyn = 179;
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
                case 114:
                    switch (yytok) {
                        case ID:
                            yyn = 51;
                            continue;
                    }
                    yyn = 179;
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
                case 115:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 116:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 53;
                            continue;
                    }
                    yyn = 179;
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
                case 117:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 118:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 119:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 120:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 121:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 122:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 123:
                    switch (yytok) {
                        case ID:
                            yyn = 60;
                            continue;
                    }
                    yyn = 179;
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
                case 124:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 125:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 126:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 127:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 128:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 129:
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
                case 130:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 131:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 179;
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
                case 133:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
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
                case 134:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                        case EQUAL:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    switch (yytok) {
                        case ADD:
                            yyn = 33;
                            continue;
                        case SUB:
                            yyn = 34;
                            continue;
                        case RPAREN:
                            yyn = 70;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
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
                case 137:
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
                case 138:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                        case EQUAL:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case INT:
                            yyn = 22;
                            continue;
                        case REAL:
                            yyn = 25;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    yyn = yys52();
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
                case 141:
                    switch (yytok) {
                        case DECIMAL:
                            yyn = 19;
                            continue;
                        case LITERAL:
                            yyn = 23;
                            continue;
                        case LPAREN:
                            yyn = 24;
                            continue;
                        case SUB:
                            yyn = 27;
                            continue;
                        case ID:
                            yyn = 49;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case ADD:
                            yyn = 33;
                            continue;
                        case SUB:
                            yyn = 34;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr21();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case ADD:
                            yyn = 33;
                            continue;
                        case SUB:
                            yyn = 34;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case ADD:
                            yyn = 33;
                            continue;
                        case SUB:
                            yyn = 34;
                            continue;
                        case RPAREN:
                            yyn = 74;
                            continue;
                    }
                    yyn = 179;
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
                case 158:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    switch (yytok) {
                        case SEMI:
                        case END:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case END:
                            yyn = 75;
                            continue;
                        case SEMI:
                            yyn = 76;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    switch (yytok) {
                        case ADD:
                            yyn = 33;
                            continue;
                        case SUB:
                            yyn = 34;
                            continue;
                        case RPAREN:
                            yyn = 77;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case THEN:
                            yyn = 78;
                            continue;
                    }
                    yyn = 179;
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
                case 163:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 179;
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
                case 164:
                    switch (yytok) {
                        case INT:
                            yyn = 22;
                            continue;
                        case REAL:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 81;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case DO:
                            yyn = 82;
                            continue;
                    }
                    yyn = 179;
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
                case 166:
                    switch (yytok) {
                        case DO:
                            yyn = 83;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case SEMI:
                        case END:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case SEMI:
                        case END:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    switch (yytok) {
                        case ID:
                            yyn = 44;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    switch (yytok) {
                        case SEMI:
                            yyn = 41;
                            continue;
                        case END:
                            yyn = 86;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    switch (yytok) {
                        case SEMI:
                            yyn = 41;
                            continue;
                        case END:
                            yyn = 87;
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                        case END:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 179;
                    continue;

                case 176:
                    return true;
                case 177:
                    yyerror("stack overflow");
                case 178:
                    return false;
                case 179:
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
                return 19;
            case ID:
                return 20;
            case IF:
                return 21;
            case INT:
                return 22;
            case LITERAL:
                return 23;
            case LPAREN:
                return 24;
            case REAL:
                return 25;
            case RECORD:
                return 26;
            case SUB:
                return 27;
            case WHILE:
                return 28;
        }
        return 179;
    }

    private int yys4() {
        switch (yytok) {
            case EQ:
                return 30;
            case EXP:
                return 31;
            case NEQ:
                return 32;
            case ENDINPUT:
            case SUB:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr29();
        }
        return 179;
    }

    private int yys5() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr39();
        }
        return 179;
    }

    private int yys7() {
        switch (yytok) {
            case ENDINPUT:
            case SUB:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr25();
        }
        return 179;
    }

    private int yys9() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr41();
        }
        return 179;
    }

    private int yys12() {
        switch (yytok) {
            case DOT:
                return 35;
            case EQUAL:
                return 36;
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr42();
        }
        return 179;
    }

    private int yys13() {
        switch (yytok) {
            case GEQ:
                return 37;
            case GREATER:
                return 38;
            case LEQ:
                return 39;
            case LESS:
                return 40;
            case ENDINPUT:
            case EQ:
            case SUB:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case NEQ:
            case MUL:
            case EXP:
            case ADD:
                return yyr32();
        }
        return 179;
    }

    private int yys16() {
        switch (yytok) {
            case DIV:
                return 42;
            case MUL:
                return 43;
            case ENDINPUT:
            case SUB:
            case SEMI:
            case END:
            case RPAREN:
            case ADD:
                return yyr22();
        }
        return 179;
    }

    private int yys17() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr37();
        }
        return 179;
    }

    private int yys19() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr43();
        }
        return 179;
    }

    private int yys20() {
        switch (yytok) {
            case LPAREN:
            case DO:
            case UNARY:
            case REAL:
            case error:
            case LITERAL:
            case DECIMAL:
            case WHILE:
            case RECORD:
            case RPAREN:
            case THEN:
            case IF:
            case INT:
                return 179;
            case ID:
                return 44;
        }
        return yyr45();
    }

    private int yys23() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr44();
        }
        return 179;
    }

    private int yys41() {
        switch (yytok) {
            case DECIMAL:
                return 19;
            case ID:
                return 20;
            case IF:
                return 21;
            case INT:
                return 22;
            case LITERAL:
                return 23;
            case LPAREN:
                return 24;
            case REAL:
                return 25;
            case RECORD:
                return 26;
            case SUB:
                return 27;
            case WHILE:
                return 28;
        }
        return 179;
    }

    private int yys48() {
        switch (yytok) {
            case EQUAL:
            case LITERAL:
            case WHILE:
            case RECORD:
            case UNARY:
            case LPAREN:
            case DO:
            case error:
            case THEN:
            case ID:
            case REAL:
            case IF:
            case INT:
            case DECIMAL:
                return 179;
            case DOT:
                return 35;
        }
        return yyr42();
    }

    private int yys49() {
        switch (yytok) {
            case REAL:
            case EQUAL:
            case WHILE:
            case RECORD:
            case DECIMAL:
            case LITERAL:
            case DO:
            case error:
            case THEN:
            case ID:
            case UNARY:
            case IF:
            case INT:
            case LPAREN:
                return 179;
        }
        return yyr45();
    }

    private int yys52() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr38();
        }
        return 179;
    }

    private int yys55() {
        switch (yytok) {
            case GEQ:
                return 37;
            case GREATER:
                return 38;
            case LEQ:
                return 39;
            case LESS:
                return 40;
            case ENDINPUT:
            case EQ:
            case SUB:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case NEQ:
            case MUL:
            case EXP:
            case ADD:
                return yyr30();
        }
        return 179;
    }

    private int yys56() {
        switch (yytok) {
            case ENDINPUT:
            case SUB:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr28();
        }
        return 179;
    }

    private int yys57() {
        switch (yytok) {
            case GEQ:
                return 37;
            case GREATER:
                return 38;
            case LEQ:
                return 39;
            case LESS:
                return 40;
            case ENDINPUT:
            case EQ:
            case SUB:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case NEQ:
            case MUL:
            case EXP:
            case ADD:
                return yyr31();
        }
        return 179;
    }

    private int yys58() {
        switch (yytok) {
            case DIV:
                return 42;
            case MUL:
                return 43;
            case ENDINPUT:
            case SUB:
            case SEMI:
            case END:
            case RPAREN:
            case ADD:
                return yyr23();
        }
        return 179;
    }

    private int yys59() {
        switch (yytok) {
            case DIV:
                return 42;
            case MUL:
                return 43;
            case ENDINPUT:
            case SUB:
            case SEMI:
            case END:
            case RPAREN:
            case ADD:
                return yyr24();
        }
        return 179;
    }

    private int yys60() {
        switch (yytok) {
            case THEN:
            case LITERAL:
            case UNARY:
            case REAL:
            case LPAREN:
            case DO:
            case DECIMAL:
            case WHILE:
            case ID:
            case RECORD:
            case error:
            case IF:
            case INT:
                return 179;
        }
        return yyr46();
    }

    private int yys62() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr36();
        }
        return 179;
    }

    private int yys63() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr34();
        }
        return 179;
    }

    private int yys64() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr35();
        }
        return 179;
    }

    private int yys65() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr33();
        }
        return 179;
    }

    private int yys67() {
        switch (yytok) {
            case ENDINPUT:
            case SUB:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr27();
        }
        return 179;
    }

    private int yys68() {
        switch (yytok) {
            case ENDINPUT:
            case SUB:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case MUL:
            case ADD:
                return yyr26();
        }
        return 179;
    }

    private int yys70() {
        switch (yytok) {
            case LEQ:
            case EQ:
            case SEMI:
            case END:
            case DIV:
            case RPAREN:
            case GREATER:
            case NEQ:
            case SUB:
            case GEQ:
            case MUL:
            case EXP:
            case LESS:
            case ENDINPUT:
            case ADD:
                return yyr40();
        }
        return 179;
    }

    private int yys82() {
        switch (yytok) {
            case DECIMAL:
                return 19;
            case ID:
                return 20;
            case IF:
                return 21;
            case INT:
                return 22;
            case LITERAL:
                return 23;
            case LPAREN:
                return 24;
            case REAL:
                return 25;
            case RECORD:
                return 26;
            case SUB:
                return 27;
            case WHILE:
                return 28;
        }
        return 179;
    }

    private int yys83() {
        switch (yytok) {
            case DECIMAL:
                return 19;
            case ID:
                return 20;
            case IF:
                return 21;
            case INT:
                return 22;
            case LITERAL:
                return 23;
            case LPAREN:
                return 24;
            case REAL:
                return 25;
            case RECORD:
                return 26;
            case SUB:
                return 27;
            case WHILE:
                return 28;
        }
        return 179;
    }

    private int yyr1() { // calc : statements
        {
    calc = new CalcNode((StatementListNode) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr20() { // assign : ref EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr21() { // assign : declaration EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)((DeclarationNode)yysv[yysp-3]).evaluate(), (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr11() { // declaration : REAL ID
        { yyrv = new DeclarationNode((String) yysv[yysp-1], Type.REAL); }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr12() { // declaration : INT ID
        { yyrv = new DeclarationNode((String) yysv[yysp-1], Type.INTEGER); }
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yypdeclaration() {
        switch (yyst[yysp-1]) {
            case 76: return 79;
            case 51: return 71;
            default: return 3;
        }
    }

    private int yyr14() { // declaration_list : declaration_list SEMI declaration
        { yyrv = addDeclaration(yysv[yysp-3], (DeclarationNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 72;
    }

    private int yyr15() { // declaration_list : declaration_list SEMI record_declaration
        { yyrv = addDeclaration(yysv[yysp-3], (DeclarationNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 72;
    }

    private int yyr16() { // declaration_list : declaration
        { yyrv = addDeclaration(null, (DeclarationNode)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 72;
    }

    private int yyr30() { // equality : equality EQ relational
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "==", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 4;
    }

    private int yyr31() { // equality : equality NEQ relational
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "~=", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 4;
    }

    private int yyr32() { // equality : relational
        yysp -= 1;
        return 4;
    }

    private int yyr40() { // exp : LPAREN expr RPAREN
        {
    yyrv = new GroupNode((ParseNode) yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr41() { // exp : other
        yysp -= 1;
        return yypexp();
    }

    private int yypexp() {
        switch (yyst[yysp-1]) {
            case 27: return 52;
            default: return 5;
        }
    }

    private int yyr22() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yyr23() { // expr : expr ADD term
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr24() { // expr : expr SUB term
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 53: return 73;
            case 45: return 69;
            case 36: return 61;
            case 29: return 54;
            case 24: return 47;
            default: return 6;
        }
    }

    private int yyr28() { // factor : equality EXP factor
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "**", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yyr29() { // factor : equality
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 43: return 68;
            case 42: return 67;
            case 31: return 56;
            default: return 7;
        }
    }

    private int yyr19() { // if : IF LPAREN expr RPAREN THEN DO statements END
        {
    yyrv = new IfNode((ParseNode)yysv[yysp-6], (StatementListNode)yysv[yysp-2]);
}
        yysv[yysp-=8] = yyrv;
        return 8;
    }

    private int yyr42() { // other : ref
        {
    yyrv = yysv[yysp-1];
}
        yysv[yysp-=1] = yyrv;
        return 9;
    }

    private int yyr43() { // other : DECIMAL
        {
    yyrv = new ValueNode((Double)yysv[yysp-1], Type.REAL);
}
        yysv[yysp-=1] = yyrv;
        return 9;
    }

    private int yyr44() { // other : LITERAL
        {
    yyrv = new ValueNode((Integer)yysv[yysp-1], Type.INTEGER);
}
        yysv[yysp-=1] = yyrv;
        return 9;
    }

    private int yyr13() { // record_declaration : ID ID
        { yyrv = new RecordDeclarationNode((String)yysv[yysp-2], (String)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        switch (yyst[yysp-1]) {
            case 76: return 80;
            default: return 10;
        }
    }

    private int yyr17() { // record_definition : RECORD ID declaration_list END
        {
    yyrv = new RecordDefinitionNode((String) yysv[yysp-3].toString(), (SymbolTable) yysv[yysp-2]);
}
        yysv[yysp-=4] = yyrv;
        return 11;
    }

    private int yyr45() { // ref : ID
        {
    yyrv = new ReferenceNode((String) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypref();
    }

    private int yyr46() { // ref : ref DOT ID
        {
    yyrv = new RecordReferenceNode(((ReferenceNode) yysv[yysp-3]).getId(), (String) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypref();
    }

    private int yypref() {
        switch (yyst[yysp-1]) {
            case 83: return 12;
            case 82: return 12;
            case 41: return 12;
            case 0: return 12;
            default: return 48;
        }
    }

    private int yyr33() { // relational : relational LESS unary
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "<", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yyprelational();
    }

    private int yyr34() { // relational : relational GREATER unary
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], ">", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yyprelational();
    }

    private int yyr35() { // relational : relational LEQ unary
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "<=", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yyprelational();
    }

    private int yyr36() { // relational : relational GEQ unary
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], ">=", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yyprelational();
    }

    private int yyr37() { // relational : unary
        yysp -= 1;
        return yyprelational();
    }

    private int yyprelational() {
        switch (yyst[yysp-1]) {
            case 32: return 57;
            case 30: return 55;
            default: return 13;
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

    private int yyr7() { // statement : if
        yysp -= 1;
        return yypstatement();
    }

    private int yyr8() { // statement : expr
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 41: return 66;
            default: return 14;
        }
    }

    private int yyr9() { // statements : statements SEMI statement
        {
    ((StatementListNode) yysv[yysp-3]).add(new StatementNode((ParseNode) yysv[yysp-1]));
    yyrv=yysv[yysp-3];
}
        yysv[yysp-=3] = yyrv;
        return yypstatements();
    }

    private int yyr10() { // statements : statement
        {
    yyrv = new StatementListNode(new StatementNode((ParseNode) yysv[yysp-1]));
}
        yysv[yysp-=1] = yyrv;
        return yypstatements();
    }

    private int yypstatements() {
        switch (yyst[yysp-1]) {
            case 82: return 84;
            case 0: return 15;
            default: return 85;
        }
    }

    private int yyr25() { // term : factor
        yysp -= 1;
        return yypterm();
    }

    private int yyr26() { // term : term MUL factor
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "*", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr27() { // term : term DIV factor
        {
    yyrv = new BinaryOperationNode((ParseNode)yysv[yysp-3], "/", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 34: return 59;
            case 33: return 58;
            default: return 16;
        }
    }

    private int yyr38() { // unary : SUB exp
        {
    yyrv = new UnaryOperationNode("-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return yypunary();
    }

    private int yyr39() { // unary : exp
        yysp -= 1;
        return yypunary();
    }

    private int yypunary() {
        switch (yyst[yysp-1]) {
            case 40: return 65;
            case 39: return 64;
            case 38: return 63;
            case 37: return 62;
            default: return 17;
        }
    }

    private int yyr18() { // while : WHILE LPAREN expr RPAREN DO statements END
        {
    yyrv = new WhileNode((ParseNode)yysv[yysp-5], (StatementListNode)yysv[yysp-2]);
}
        yysv[yysp-=7] = yyrv;
        return 18;
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
