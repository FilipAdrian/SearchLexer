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
    : PATH EQUAL DOUBLECOUNT FILEPATH DOUBLECOUNT SEMICOLON                         #filePathDeclaration
    ;

func_call
    : FIND LPAREN ALPHA  RPAREN SEMICOLON                                           #findFunction
    | REPLACE LPAREN ALPHA COMMA ALPHA RPAREN SEMICOLON                             #replaceFunction
    | LOOK_FOR LPAREN (special_symbol* ALPHA special_symbol*)+ RPAREN SEMICOLON     #lookFunction
    | COUNT LPAREN  RPAREN SEMICOLON                                                #countFunction
    | FINDL LPAREN DIGIT RPAREN SEMICOLON                                           #findLineFunction
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
    : 'path'
    ;

FIND
    :'find'
    ;

FINDL
    :'findLine'
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
   :(' '|'\t'|'\n'|'\r')+ -> skip
   ;


DIGIT
    : [0-9]+
    ;

ALPHA
    : ('a' .. 'z'|'A' .. 'Z'|'0' .. '9'|'-'|'_'|'.')+
    ;

FILEPATH
    : ('A'..'Z'|'a'..'z'|'0'..'9'|':'|'\\'|'/'|'-'|'_'|'.')+
    ;





