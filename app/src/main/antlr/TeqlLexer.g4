
lexer grammar TeqlLexer;

KW_AFTER                    : A F T E R;
KW_AND                      : A N D;
KW_ANY                      : A N Y;
KW_AT                       : A T;
KW_BEFORE                   : B E F O R E;
KW_BEGIN                    : B E G I N;
KW_BETWEEN                  : B E T W E E N;
KW_CHANGE                   : C H A N G E;
KW_COMMIT                   : C O M M I T;
KW_DELETE                   : D E L E T E;
KW_END                      : E N D;
KW_EVERYTHING               : E V E R Y T H I N G;
KW_FILE                     : F I L E;
KW_FIND                     : F I N D;
KW_FIRST                    : F I R S T;
KW_FROM                     : F R O M;
KW_IN                       : I N;
KW_INDENT                   : I N D E N T;
KW_INSERT                   : I N S E R T;
KW_LAST                     : L A S T;
KW_LENGTH                   : L E N G T H;
KW_LINE                     : L I N E S?;
KW_NEXT                     : N E X T;
KW_OF                       : O F;
KW_OFFSET                   : O F F S E T;
KW_OR                       : O R;
KW_REPEAT                   : R E P E A T;
KW_REPLACE                  : R E P L A C E;
KW_SEEK                     : S E E K;
KW_SET                      : S E T;
KW_SHOW                     : S H O W;
KW_START                    : S T A R T;
KW_SUBSTRING                : S U B S T R I N G;
KW_TO                       : T O;
KW_USE                      : U S E;
KW_WITH                     : W I T H;

INT                         : DIGIT+;
COMMENT                     : ('--' ~[\r\n]* | '//' ~[\r\n]* | '/*' .*? '*/') -> channel(HIDDEN);
STR_OPEN                    : '"' -> pushMode(STRING);
PATH                        : PATH_START? PATH_SEGMENT (PATH_SEP PATH_SEGMENT)*; // TODO might need a predicate to keep paths from being detected as regexes; and some other mechanism to detect path start
REGEX_OPEN                  : '/' -> pushMode(REGEX); 
VAR                         : '$' VAR_NAME;
NAME                        : IDENTIFIER;
HYPHEN                      : '-';
COLON                       : ':';
COMMA                       : ',';
DOT                         : '.';
L_PAREN                     : '(';
R_PAREN                     : ')';
SEMICOLON                   : ';';
SPACES                      : SPACE -> skip;

mode STRING;

STR_ESCAPE                  : '\\' .;
STR_HEX_BYTE_2              : ESC_HEX_BYTE_2;
STR_HEX_BYTE_1              : ESC_HEX_BYTE_1;
STR_UNICODE_4               : ESC_UNICODE_4;
STR_UNICODE_FLEX            : ESC_UNICODE_FLEX;
STR_CLOSE                   : '"' -> popMode;
STR_INTERPOLATE_OPEN        : '{' -> pushMode(STRING_INTERPOLATE);
VAR_2                       : '$' VAR_NAME -> type(VAR);
STR_BODY                    : .;

mode STRING_INTERPOLATE;

VAR_3                       : '$' VAR_NAME -> type(VAR);
SPACES_2                    : SPACE -> skip;
STR_INTERPOLATE_CLOSE       : '}' -> popMode;

mode REGEX;         

REGEX_ESCAPE                : '\\' .;
REGEX_HEX_BYTE_2            : ESC_HEX_BYTE_2;
REGEX_HEX_BYTE_1            : ESC_HEX_BYTE_1;
REGEX_UNICODE_4             : ESC_UNICODE_4;
REGEX_UNICODE_FLEX          : ESC_UNICODE_FLEX;
REGEX_INV_CHAR_CLASS_OPEN   : '[^' -> pushMode(REGEX_CHAR_CLASS);
REGEX_CHAR_CLASS_OPEN       : '[' -> pushMode(REGEX_CHAR_CLASS);
REGEX_NONCAP_GROUP_OPEN     : '(?:';
REGEX_NAMED_CAP_GROUP_OPEN  : '(?<' IDENTIFIER '>';
REGEX_CAP_GROUP_OPEN        : '(';
REGEX_GROUP_CLOSE           : ')';
REGEX_DOT                   : '.';
REGEX_REPEAT_STAR           : '*' '?'?;
REGEX_REPEAT_PLUS           : '+' '?'?;
REGEX_OPTION                : '?' '?'?;
REGEX_REPEAT_FIXED          : '{' DIGIT+ '}' '?'?;
REGEX_REPEAT_MIN            : '{' DIGIT+ ',}' '?'?;
REGEX_REPEAT_MAX            : '{,' DIGIT+ '}' '?'?;
REGEX_REPEAT_RANGE          : '{' DIGIT+ ',' DIGIT+ '}' '?'?;
REGEX_ANCHOR_START          : '^';
REGEX_ANCHOR_END            : '$';
REGEX_OR                    : '|';
REGEX_CLOSE                 : '/' [ilmsux]* -> popMode;
REGEX_LITERAL               : .;

mode REGEX_CHAR_CLASS;         

REGEX_CC_ESCAPE             : '\\' . -> type(REGEX_ESCAPE);
REGEX_CHAR_CLASS_RANGE      : '-'; // TODO some predicate to not match if previous token was not a literal of some kind
REGEX_CC_HEX_BYTE_2         : ESC_HEX_BYTE_2 -> type(REGEX_HEX_BYTE_2);
REGEX_CC_HEX_BYTE_1         : ESC_HEX_BYTE_1 -> type(REGEX_HEX_BYTE_1);
REGEX_CC_UNICODE_4          : ESC_UNICODE_4 -> type(REGEX_UNICODE_4);
REGEX_CC_UNICODE_FLEX       : ESC_UNICODE_FLEX -> type(REGEX_UNICODE_FLEX);
REGEX_CHAR_CLASS_CLOSE      : ']' -> popMode;
REGEX_CC_LITERAL            : . -> type(REGEX_LITERAL);



fragment UL                 : '_';
fragment ALPHA              : [a-zA-Z];
fragment DIGIT              : [0-9];
fragment HEXIT              : [0-9a-fA-F];
fragment SPACE              : [ \t\r\n];
fragment WORD_CHAR          : [a-zA-Z0-9_];
fragment IDENTIFIER         : [a-zA-Z_\u0080-\ufffe][a-zA-Z0-9_\u0080-\ufffe]*;
fragment VAR_NAME           : (IDENTIFIER|DIGIT*) ('.' (IDENTIFIER|DIGIT*))*;
fragment PATH_START         : './' | '~/' | '/';
fragment PATH_SEGMENT       : (~[\\/; \t\r\n]|('\\' SPACE))+;
fragment PATH_SEP           : '/';
fragment ESC_HEX_BYTE_2     : '\\x' HEXIT HEXIT;
fragment ESC_HEX_BYTE_1     : '\\x' HEXIT;
fragment ESC_UNICODE_4      : '\\u' HEXIT HEXIT HEXIT HEXIT;
fragment ESC_UNICODE_FLEX   : '\\u{' HEXIT+ '}';
fragment A                  : [aA];
fragment B                  : [bB];
fragment C                  : [cC];
fragment D                  : [dD];
fragment E                  : [eE];
fragment F                  : [fF];
fragment G                  : [gG];
fragment H                  : [hH];
fragment I                  : [iI];
fragment J                  : [jJ];
fragment K                  : [kK];
fragment L                  : [lL];
fragment M                  : [mM];
fragment N                  : [nN];
fragment O                  : [oO];
fragment P                  : [pP];
fragment Q                  : [qQ];
fragment R                  : [rR];
fragment S                  : [sS];
fragment T                  : [tT];
fragment U                  : [uU];
fragment V                  : [vV];
fragment W                  : [wW];
fragment X                  : [xX];
fragment Y                  : [yY];
fragment Z                  : [zZ];