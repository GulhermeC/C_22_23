grammar Sintax;
line: ID Number;

ID : [a-zA-Z]+ ;                // match lower-case identifiers
Number: [0-9]+;
WS : [ \t\r\n]+ -> skip;        // skip spaces, tabs, newlines, \r (windows)