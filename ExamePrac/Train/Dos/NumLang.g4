grammar NumLang;

program: stat* EOF;

stat:
    display? ';'
    | asign? ';'
    ;

display:
    'display' expr  #StatDisplay
    ;

asign:
    VAR '<=' expr    #StatAsig 
    ;

expr:
    op=('+' | '-') expr #ExprUnary
    | expr '+' expr   #ExprAdd
    | expr '-' expr   #ExprSub
    | expr '*' expr   #ExprMult
    | expr ':' expr   #ExprDiv
    | 'read' expr     #ExprRead
    | STR             #ExprStr
    | FRAC            #ExprFrac
    | VAR             #ExprVar
    | INT             #ExprInt
    | '(' expr ')'    #ExprPar
    ;

VAR: [a-zA-Z]+[0-9]*;
INT: [0-9]+; 
FRAC: INT'/'INT;
STR: '"' (~["\\\r\n])* '"';
WS: [ \t\n]+ -> skip;
COMMENT: '-' .*? '\n' -> skip;
