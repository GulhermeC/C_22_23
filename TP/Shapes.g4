grammar Shapes;

main: stat* EOF;

stat: expr #StatExpr;

expr returns[Double res]:
        expr op=('*'|'/') expr #ExprMultDiv
    |   expr op=('+'|'-') expr #ExprAddSub
    |   '(' expr ')'           #ExprParent
    |   distance               #ExprDistance
    |   Number                 #ExprNumber
    ;
distance returns[Double res]: 'distance' point point;

point returns[Double x, Double y]: '('expr ',' expr ')'; //point returns tuple

Number : [0-9]+;
WS: [ \t\r\n]+ -> skip;