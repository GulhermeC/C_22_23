grammar ExprCalculator;

program:
    stat+ EOF
    ;

stat :
    expr? NEWLINE
    ;

expr:
        expr op=('*'|'/'|'%'|'&') expr  #ExprMultDivMod
    |   expr op=('+'|'-') expr          #ExprAddSub
    |   expr ',' expr                   #ExprWord
    |   '(' expr ')'                    #ExprParent
    |   '{' expr '}'                    #ExprGroup
    |   ID                              #ExprLetr
    |   Integer                         #ExprInt
    |   '-''-' expr                     #ExprComment
    ;

ID: [a-z]+;
Integer: [0-9]+;            //implement with long integers
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;