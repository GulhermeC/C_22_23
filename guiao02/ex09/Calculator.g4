grammar Calculator;

program:
    stat+ EOF
    ;

stat :
    expr? NEWLINE
    ;

expr:
        expr op=('*'|'/'|'%') expr      #ExprMultDivMod
    |   expr op=('+'|'-') expr          #ExprAddSub
    |   'reduce' expr '/' expr          #ExprReduce
    |   Integer                         #ExprInteger
    |   '(' expr ')'                    #ExprParent
    |   ID                              #ExprVar
    |   ID '=' expr                     #ExprAssign
    ;

ID: [a-zA-Z]+;
Integer: [0-9]+;            //implement with long integers
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;