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
    : PATH EQUAL DOUBLECOUNT alpha DOUBLECOUNT SEMICOLON                            #filePathDeclaration
    ;

func_call
    : find LPAREN alpha  RPAREN SEMICOLON                                           #findFunction
    | REPLACE LPAREN alpha COMMA alpha RPAREN SEMICOLON                             #replaceFunction
    | lookFor LPAREN (expr)* RPAREN SEMICOLON                                       #lookFunction
    | COUNT LPAREN  RPAREN SEMICOLON                                                #countFunction
    | FINDL LPAREN alpha RPAREN SEMICOLON                                           #findLineFunction
    |  change LPAREN (expr)* COMMA (expr|White)* RPAREN SEMICOLON                           #changeFormat
    ;

find
    : FIND         #findWholeFunction
    | FIND PREFIX       #findByPrefix
    | FIND SUFFIX       #findBySyffix
    |FIND FRAGMENT      #findByFragment
    ;
expr
    :SPECIAL_SYMBOL
    |alpha
    ;
lookFor
    :LOOK_FOR
    | LOOK_FOR FORMAT
    ;
change
    : CHANGE (CHANGE_BY_NUMBER_FORMAT|CHANGE_BY_DATE_FORMAT)
    ;
alpha
    : (DIGIT|LETTER|SYMBOLS)+
    ;

SPECIAL_SYMBOL
    :('+'|'#'|'/'|'*'|'|')
    ;
FORMAT
    :'.format'
    ;
CHANGE
    : 'change'
    ;
CHANGE_BY_NUMBER_FORMAT
    : '.numberFormat'
    ;
CHANGE_BY_DATE_FORMAT
    :   '.dateFormat'
    ;
START
    :   'Start'
    ;
PREFIX
    : '.byPrefix'
    ;
SUFFIX
    : '.bySuffix'
    ;
FRAGMENT
    : '.byFragment'
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
   :(' '|'\t'|'\n'|'\r')+ -> channel(HIDDEN)
   ;
White:' ';

DIGIT
    : [0-9]+
    ;
LETTER
    :([a-z] | [A-Z])+
    ;
SYMBOLS
    :(':'|'\\'|'/'|'-'|'_'|'.'|'-'|'_')+
    ;









