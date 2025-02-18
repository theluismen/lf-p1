grammar IntExpr;

    ini : (expr ';')+  ; 

    expr :
                '(' expr ')'   # ParExpr
                |
                expr '+' expr   # AddExpr
                |
                expr '-' expr   # SubExpr
                |
                expr '*' expr   # MultExpr
                |
                expr '/' expr   # DivExpr
                |
                INT     # IntExpr
        ;

    INT : [0-9]+ ;

    WS  : [ \t\r\n]+ -> skip ;  // toss out whitespace
    NEWLINE: '\r'? '\n' ;   // return newlines to parser (is end-statement signal)
