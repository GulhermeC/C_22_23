grammar StrLang;

program: stat* EOF;

stat:
    print? NEWLINE
    | asig? NEWLINE
    ;

print:
;

asig:
;

VAR: [a-zA-Z]+[0-9]*;
STR: '"' (~["\\\r\n])* '"';
WS: [ \t]+ -> skip;
NEWLINE: '\r' ? '\n';
COMMENT: '//' .*? '\n' -> skip;