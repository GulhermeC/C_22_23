parser grammar CalParser;

program:
    stat+ EOF
    ;

stat:
    expr? NEWLINE
    ;

expr:
        expr op=(MULT|DIV|REST) expr    #ExprMultDivMod
    |   expr op=(PLUS|MINUS) expr       #ExprAddSub
    |   REDUCE expr DIV expr            #ExprReduce
    |   Integer                         #ExprInteger
    |   PARSOPEN expr PARSCLOSE         #ExprParent
    |   ID                              #ExprVar
    |   ID EQUAL expr                   #ExprAssign
    ;