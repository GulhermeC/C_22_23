grammar StrLang;

program :
stat+ (NEWLINE | EOF);

stat:
'print' expr+ #Print
| ID ':' ('trim')? np #Assing
;

np:
ID #npID
| STR #npSTR
| 'input(' np ')' #input
| np op=('+' | '-') np #npAdd
| '(' np ')' #RemoveNP
;

expr:
ID #exprID
| STR #exprSTR
| expr op=('+' | '-') expr #exprAdd
| '(' expr '/' expr '/' expr ')' #Replace
;

ID: [a-zA-Z]+[0-9]*;
STR: '"' (~["\\\r\n])* '"';
WS: [ \t]+ -> skip;
NEWLINE: '\r' ? '\n';
COMMENT: '//' .*? '\n' -> skip;