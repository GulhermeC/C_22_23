grammar Hello;                  // Define a grammar called Hello
r : (greetings | bye);          // 2 options
greetings : 'hello' ID+;         // match keyword hello followed by an identifier
bye: 'bye' ID+;                  // bye followed by ID
ID : [a-zA-Z]+ ;                // match lower-case identifiers
WS : [ \t\r\n]+ -> skip;        // skip spaces, tabs, newlines, \r (windows)
