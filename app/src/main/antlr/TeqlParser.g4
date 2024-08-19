parser grammar TeqlParser;

options{
    tokenVocab=TeqlLexer;
}

selector                    : parantheticalSelector 
                            | startSelector 
                            | endSelector 
                            | seekSelector 
                            | offsetSelector 
                            | findSelector 
                            | lineSelector
                            | beforeSelector 
                            | afterSelector 
                            | betweenSelector 
                            | blockSelector 
                            | qualifiedSelector 
                            | nestedSelector;

parantheticalSelector       : L_PAREN selector R_PAREN;
startSelector               : KW_START;
endSelector                 : KW_END;
seekSelector                : KW_SEEK INT;
offsetSelector              : KW_OFFSET INT;
findSelector                : KW_FIND (regexLiteral | stringLiteral);
lineSelector                : KW_LINE rangeLiteral;
beforeSelector              : (KW_ANY selector | INT | KW_EVERYTHING)? KW_BEFORE selector;
afterSelector               : (KW_ANY selector | INT | KW_EVERYTHING)? KW_AFTER selector;
betweenSelector             : KW_ANY selector KW_BETWEEN selector KW_AND selector;
blockSelector               : KW_FROM selector KW_TO (selector | KW_LENGTH INT);
qualifiedSelector           : rangeLiteral KW_OF selector;
nestedSelector              : KW_ANY selector KW_IN selector;



stringLiteral               : STR_OPEN (STR_BODY | STR_ESCAPE | STR_HEX_BYTE_2 | STR_HEX_BYTE_1 | STR_UNICODE_4 | STR_UNICODE_FLEX | VAR | stringLiteralInterpolation)* STR_CLOSE;
stringLiteralInterpolation  : STR_INTERPOLATE_OPEN VAR STR_INTERPOLATE_CLOSE;

regexLiteral                : REGEX_OPEN regexLiteralQualifiedUnit* REGEX_CLOSE;
regexLiteralQualifier       : REGEX_OPTION | REGEX_REPEAT_FIXED | REGEX_REPEAT_MAX | REGEX_REPEAT_MIN | REGEX_REPEAT_PLUS | REGEX_REPEAT_RANGE | REGEX_REPEAT_STAR;
regexLiteralQualifiedUnit   : regexLiteralUnit regexLiteralQualifier?;
regexLiteralUnit            : regexLiteral_group | regexLiteralCharClass | regexLiteralLiteral;
regexLiteralLiteral         : REGEX_LITERAL | REGEX_ESCAPE | REGEX_HEX_BYTE_2 | REGEX_HEX_BYTE_1 | REGEX_UNICODE_4 | REGEX_UNICODE_FLEX;
regexLiteralCharRange       : regexLiteralLiteral REGEX_CHAR_CLASS_RANGE regexLiteralLiteral;
regexLiteralCharClass       : (REGEX_CHAR_CLASS_OPEN | REGEX_INV_CHAR_CLASS_OPEN) (regexLiteralCharRange | regexLiteralLiteral)+ | REGEX_CHAR_CLASS_CLOSE;
regexLiteral_group          : (REGEX_NONCAP_GROUP_OPEN | REGEX_NAMED_CAP_GROUP_OPEN | REGEX_CAP_GROUP_OPEN) regexLiteralQualifiedUnit+ REGEX_GROUP_CLOSE;

rangeLiteral                : rangeLiteralUnit (COMMA rangeLiteralUnit)*;
rangeLiteralUnit            : rangeLiteralRelrange | rangeLiteralRange | rangeLiteralLiteral;
rangeLiteralRelrange        : (KW_FIRST | KW_NEXT | KW_LAST) INT;
rangeLiteralRange           : rangeLiteralLiteral (HYPHEN | COLON | DOT DOT) rangeLiteralLiteral;
rangeLiteralLiteral         : INT | KW_FIRST | KW_NEXT | KW_LAST;