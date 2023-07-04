grammar StrLang;

program: stat+ EOF;

stat: 
        print? NEWLINE              #PrintStat
        | assig? NEWLINE              #AssigStat
        ;

print:
        'print' pexpr               #PrintEx
        ;

assig:
        VAR ':' asexpr              #AssignEx
        ;

pexpr:
          pexpr op=('+' | '-') pexpr        #printAdd
        | STR                               #printStr
        | VAR                               #printVar
        | '(' pexpr '/' pexpr '/' pexpr ')' #printReplace
        ;

asexpr:
          asexpr op=('+' | '-') asexpr      #assigAdd
        | 'input' '(' asexpr ')'            #assigInput
        | STR                               #assigStr
        | VAR                               #assigVar
        | '(' asexpr ')'                    #assigPar
        ;

VAR: [a-zA-Z]+[0-9]*;
STR: '"' (~["\\\r\n])* '"';
WS: [ \t]+ -> skip;
NEWLINE: '\r' ? '\n';
COMMENT: '//' .*? '\n' -> skip;

