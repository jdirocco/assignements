grammar Parentheses;

prog: par EOF ;
par:	'('par')' | 
    ;
WS: [ \t\n\r] -> skip;