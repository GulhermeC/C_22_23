grammar Shapes;

main: stat* EOF;

stat: expr {
    if ($expr.res != null) 
        System.out.println("Result (A): " +$expr.res);
} #StatExpr;

expr returns[Double res]:
        e1=expr op=('*'|'/') e2=expr {
            Double res = null;
            Double e1 = $e1.res;
            Double e2 = $e2.res;
            
            switch($op.getText()){
                case "*":
                    $res = e1 * e2;
                    break;
                case "/":
                    $res = e1 / e2;
                    break;
            }
        }   #ExprMultDiv
    |   expr op=('+'|'-') expr {}   #ExprAddSub
    |   '(' expr ')'  {}            #ExprParent
    |   distance {}                 #ExprDistance
    |   Number {}                   #ExprNumber
    ;
distance returns[Double res]: 'distance' point point;

point returns[Double x, Double y]: '('expr ',' expr ')'; //point returns tuple

Number : [0-9]+;
WS: [ \t\r\n]+ -> skip;