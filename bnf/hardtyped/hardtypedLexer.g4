// -*- Java -*- File generated by the BNF Converter (bnfc 2.9.4).

// Lexer definition for use with Antlr4
lexer grammar hardtypedLexer;
// Predefined regular expressions in BNFC
fragment LETTER  : CAPITAL | SMALL ;
fragment CAPITAL : [A-Z\u00C0-\u00D6\u00D8-\u00DE] ;
fragment SMALL   : [a-z\u00DF-\u00F6\u00F8-\u00FF] ;
fragment DIGIT   : [0-9] ;
Surrogate_id_SYMB_0 : ';' ;
Surrogate_id_SYMB_1 : '(' ;
Surrogate_id_SYMB_2 : ')' ;
Surrogate_id_SYMB_3 : '-|' ;
Surrogate_id_SYMB_4 : '=' ;
Surrogate_id_SYMB_5 : ':' ;
Surrogate_id_SYMB_6 : '/\\' ;
Surrogate_id_SYMB_7 : '{' ;
Surrogate_id_SYMB_8 : '}' ;
Surrogate_id_SYMB_9 : '->' ;
Surrogate_id_SYMB_10 : '.' ;
Surrogate_id_SYMB_11 : ',' ;
Surrogate_id_SYMB_12 : '|' ;
Surrogate_id_SYMB_13 : '|:' ;
Surrogate_id_SYMB_14 : '+' ;
Surrogate_id_SYMB_15 : '-' ;
Surrogate_id_SYMB_16 : '*' ;
Surrogate_id_SYMB_17 : '/' ;
Surrogate_id_SYMB_18 : '>' ;
Surrogate_id_SYMB_19 : '>=' ;
Surrogate_id_SYMB_20 : '==' ;
Surrogate_id_SYMB_21 : '!=' ;
Surrogate_id_SYMB_22 : '<=' ;
Surrogate_id_SYMB_23 : '<' ;
Surrogate_id_SYMB_24 : 'Any' ;
Surrogate_id_SYMB_25 : 'Bool' ;
Surrogate_id_SYMB_26 : 'Int' ;
Surrogate_id_SYMB_27 : 'Real' ;
Surrogate_id_SYMB_28 : 'String' ;
Surrogate_id_SYMB_29 : 'Unit' ;
Surrogate_id_SYMB_30 : 'and' ;
Surrogate_id_SYMB_31 : 'as' ;
Surrogate_id_SYMB_32 : 'in' ;
Surrogate_id_SYMB_33 : 'let' ;
Surrogate_id_SYMB_34 : 'letrec' ;
Surrogate_id_SYMB_35 : 'lettype' ;
Surrogate_id_SYMB_36 : 'not' ;
Surrogate_id_SYMB_37 : 'or' ;
COMMENT_antlr_builtin
: (
'//' ~[\r\n]* (('\r'? '\n')|EOF)
) -> skip;
MULTICOMMENT_antlr_builtin
: (
'/*' (.)*? '*/'
) -> skip;

Bool : 't''r''u''e'|'f''a''l''s''e';
Unit : 'u''n''i''t';
ReadReal : 'r''e''a''d''R''e''a''l';
ReadInt : 'r''e''a''d''I''n''t';
ReadString : 'r''e''a''d''S''t''r''i''n''g';
ReadBool : 'r''e''a''d''B''o''o''l';
// String token type
STRING : '"' -> more, mode(STRINGMODE);

// Double predefined token type
DOUBLE : DIGIT+ '.' DIGIT+ ('e' '-'? DIGIT+)?;
//Integer predefined token type
INTEGER : DIGIT+;
// Identifier token type
fragment
IDENTIFIER_FIRST : LETTER | '_';
IDENT : IDENTIFIER_FIRST (IDENTIFIER_FIRST | DIGIT)*;
// Whitespace
WS : (' ' | '\r' | '\t' | '\n' | '\f')+ ->  skip;
// Escapable sequences
fragment
Escapable : ('"' | '\\' | 'n' | 't' | 'r' | 'f');
ErrorToken : . ;
mode STRESCAPE;
STRESCAPED : Escapable  -> more, popMode ;
mode STRINGMODE;
STRINGESC : '\\' -> more , pushMode(STRESCAPE);
STRINGEND : '"' ->  type(STRING), mode(DEFAULT_MODE);
STRINGTEXT : ~["\\] -> more;
