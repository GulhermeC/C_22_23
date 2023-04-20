lexer grammar CalLexer;

ID: [a-zA-Z]+;
Integer: [0-9]+;            //implement with long integers
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;
PLUS: '+';
MINUS: '-';
DIV: '/';
REST: '%';
MULT: '*';
REDUCE: 'reduce';
PARSOPEN: '(';
PARSCLOSE:')';
EQUAL:'=';