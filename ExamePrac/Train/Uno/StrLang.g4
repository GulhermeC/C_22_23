grammar StrLang;

program: stat+ EOF;

stat: 
    print? NEWLINE 
    | assig? NEWLINE 
    ;

print:
    'print' expr #StatPrint
    ;

assig:
    VAR ':' expr #StatAssign
    ;

expr:
    expr '+' expr                  #ExprAdd
    | expr '-' expr                #ExprMin
    | 'trim' expr                       #ExprTrim
    | 'input(' expr ')'                 #ExprInput
    | STR                               #ExprString
    | VAR                               #ExprVar
    | '(' expr ')'                      #ExprPar
    | expr '/' expr '/' expr           #ExprSubstitute
    ;


VAR: [a-zA-Z]+[0-9]*;
STR: '"' (~["\\\r\n])* '"';
WS: [ \t]+ -> skip;
NEWLINE: '\r' ? '\n'; 
COMMENT: '//' .*? '\n' -> skip;

