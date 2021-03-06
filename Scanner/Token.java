package compiler;

public enum Token {
    VOID, IF, FOR, WHILE, ELSE, INT, DOUBLE, BOOL, STRING, CLASS, INTERFACE, NULL,
    THIS, EXTENDS, IMPLEMENTS, RETURN, BREAK, CONTINUE, NEW, NEWARRAY, PRINT, READINTEGER,
    READLINE, DTOI, ITOD, BTOI, ITOB, PRIVATE, PROTECTED, PUBLIC, TRUE, FALSE,
    ID, STRINGLITERAL, INTLITERAL, DOUBLELITERAL, SCIDOUBLELITERAL, ADD, MINUS, PROD, DIV, MOD, LESS, LESSEQ,
    GR, GREQ, ASSIGN, EQ, NOTEQ, AND , OR, NOT, SEMICOLON , COMMA, DOT, LBRACK, RBRACK,
    LPAREN, RPAREN, EOF, LCURLY, RCURLY, COMMENT, ERROR,
}
