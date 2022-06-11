grammar Expr;		
expr:	expr ('*'|'/') expr
    |	expr ('+'|'-') expr
    |	INT
    |	'(' expr ')'
    ;
INT     : [0-9]+ ;
WS: [ \t\n\r] -> skip;