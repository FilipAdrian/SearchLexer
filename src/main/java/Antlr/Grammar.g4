grammar Grammar;

    options
    {
        language = Java;
    }
program
    :  START statement END
    ;

statement
    : (var_decl func_call*)+
    ;
 var_decl
    : PATH  EQUAL DOUBLECOUNT FILEPATH DOUBLECOUNT SEMICOLON
    ;
 func_call
    : standard_func_name LPAREN ALPHA  RPAREN SEMICOLON                             #standardFunction
    | REPLACE LPAREN ALPHA COMMA ALPHA RPAREN SEMICOLON                             #replaceFunction
    | LOOK_FOR LPAREN (special_symbol* ALPHA special_symbol*)+ RPAREN SEMICOLON     #lookFunction
    | COUNT LPAREN WHITE_SPACE* RPAREN SEMICOLON                                    #countFunction
    | FINDL LPAREN DIGIT RPAREN SEMICOLON                                           #findLineFunction
    ;

standard_func_name
    :FIND
    |FINDR
    ;
special_symbol
    :('^'|'?'|'<'|'>'|'|'|'*'|'['|']')
    ;

START
    :'Start'
    ;

END
    : 'End'
    ;

PATH
    :'path'
    ;

FIND
    :'find'
    ;

FINDL
    :'findL'
    ;
FINDR
    :'findR'
    ;

REPLACE
    :'replace'
    ;

COUNT
    :'count'
    ;
LOOK_FOR
    :'lookFor'
    ;
LPAREN
   : '('
   ;

COMMA
  : ','
  ;

RPAREN
   : ')'
   ;

SEMICOLON
    : ';'
    ;
DOUBLECOUNT
    : '"'
    ;

EQUAL
    : '='
    ;
WS
   : [ \r\n\t] + -> skip
   ;
WHITE_SPACE
   : ' '
   ;
DIGIT
    : [0-9]+
    ;

ALPHA
    : ('a' .. 'z'|'A' .. 'Z'|'0' .. '9'|' '|'-'|'_'|'.')+
    ;

FILEPATH
    : ('A'..'Z'|'a'..'z'|'0'..'9'|':'|'\\'|'/'|' '|'-'|'_'|'.')+
    ;

ANY : . ;




