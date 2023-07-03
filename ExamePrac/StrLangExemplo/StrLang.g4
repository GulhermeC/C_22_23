grammar StrLang;

program:
        stat* EOF;

stat:
        print? NEWLINE              #StatPrint
        | assig? NEWLINE            #StatAssig
        ;

print: 'print' expr+                #PrintReduce
        ;

assig: ID ':' ('trim')? noop        #AssigReduce
        ;

noop:
        'input(' noop ')'           #NoopInput
        | noop op=('+' | '-')       #NoopUnary   
        | ID                        #NoopId
        | STR                       #NoopStr
        | '(' noop ')'              #NoopParent
        ;

expr:
        expr op=('+' | '-') expr        #ExprUnary
        | '(' expr '/' expr '/' expr')' #ExprReplace
        | ID                            #ExprID
        | STR                           #ExprSTR
        ;


ID: [a-zA-Z]+[0-9]*;
STR: '"' (~["\\\r\n])* '"';
WS: [ \t]+ -> skip;
NEWLINE: '\r' ? '\n';
COMMENT: '//' .*? '\n' -> skip;