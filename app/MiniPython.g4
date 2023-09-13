//Algoritmo de Descenso recursivo
//Proyecto 1: Parser Mini Python
//Estudiante: Josué Chaves


grammar MiniPython;

tokens {INDENT, DEDENT}
 //import com.yuvalshavit.antlr4.DenterHelper;
@lexer::header{
    import jochaes.minipythoncompiler.antlr4.DenterHelper;
}

@lexer::members{
    private final DenterHelper denter = DenterHelper.builder()
        .nl(NEWLINE)
        .indent(MiniPythonParser.INDENT)
        .dedent(MiniPythonParser.DEDENT)
        .pullToken(MiniPythonLexer.super::nextToken);

    @Override
    public Token nextToken(){
        return denter.nextToken();
    }
}


program : mainStatement mainStatement*;                         //Un programa es 1 main statement seguido de 0 más mainStatements

mainStatement:                                                  // Como los statements globales
        defStatement
        | assignStatement;

statement:
        ifStatement
        | returnStatement
        | printStatement
        | whileStatement
        | forStatement
        | assignStatement
        | functionCallStatement
        | expressionStatement
        | assignStatementOperator;

defStatement: DEF IDENTIFIER OPENPARENTHESIS argList CLOSEPARENTHESIS COLON sequence;

argList: (IDENTIFIER ( COMMA IDENTIFIER )*)?;

ifStatement: IF expression COLON sequence ELSE COLON sequence;

whileStatement: WHILE expression COLON sequence;

forStatement: FOR expression IN expressionList COLON sequence;

returnStatement: RETURN expression NEWLINE;

printStatement: PRINT expression NEWLINE;

assignStatement: IDENTIFIER ASSIGNMENT expression NEWLINE;

assignStatementOperator: IDENTIFIER (SUBSTRACTIONASSIGNMENTOP|ADDITIONASSIGNMENTOP) expression NEWLINE;

functionCallStatement: IDENTIFIER OPENPARENTHESIS expressionList NEWLINE;

expressionStatement: expressionList NEWLINE;

sequence: INDENT statement statement* DEDENT;   //Tiene que llevar un Statement, con 0 o más, lo de newline ya no se necesita

expression: additionExpression comparison*;

comparison: comparisonOperator additionExpression;

comparisonOperator:
        LESSTHAN
        | GREATERTHAN
        | LESSTHANEQUAL
        | GREATERTHANEQUAL
        | COMPARISON;

additionExpression: multiplicationExpression additionFactor*;

additionFactor: (PLUSSIGN|MINUSSIGN) multiplicationExpression;

multiplicationExpression: elementExpression multiplicationFactor*;

multiplicationFactor: (ASTERISK|SLASH) elementExpression;

elementExpression: primitiveExpression elementAccess*;

elementAccess: OPENSQRBRACKET expression CLOSESQRBRACKET;

expressionList: (expression (COMMA expression)*)?;

primitiveExpression:
        MINUSSIGN? INTEGER
        | MINUSSIGN? FLOAT
        | MINUSSIGN? IDENTIFIER  //Para tener -x por ejemplo
        | CHARCONST
        | STRING
        | IDENTIFIER (OPENPARENTHESIS expressionList CLOSEPARENTHESIS)?
        | OPENPARENTHESIS expression CLOSEPARENTHESIS
        | listExpression
        | LEN OPENPARENTHESIS expression CLOSEPARENTHESIS;

listExpression: OPENSQRBRACKET expressionList CLOSESQRBRACKET;


//Symbols
COMMA               : ',';
COLON               : ':';
OPENPARENTHESIS     : '(';
CLOSEPARENTHESIS    : ')';
OPENCURLYBRACE      : '{';
CLOSECURLYBRACE     : '}';
OPENSQRBRACKET      : '[';
CLOSESQRBRACKET     : ']';
DOUBLEQUOTES        : '"';
SINGLEQUOTE         : '\'';
PLUSSIGN            : '+';
MINUSSIGN           : '-';
ASTERISK            : '*';
SLASH               : '/';
ASSIGNMENT          : '=';
SUBSTRACTIONASSIGNMENTOP:'-=';
ADDITIONASSIGNMENTOP: '+=';
LESSTHAN            : '<';
GREATERTHAN         : '>';
LESSTHANEQUAL       : '<=';
GREATERTHANEQUAL    : '>=';
COMPARISON          : '==';

//palabras reservadas

IN                  : 'in';
DEF                 : 'def';
IF                  : 'if';
WHILE               : 'while';
FOR                 : 'for';
ELSE                : 'else';
NEWLINE: ('\r'? '\n' (' ' | '\t')*);
DO                  : 'do';
CONST               : 'const';
VAR                 : 'var';
RETURN              : 'return';
PRINT               : 'print';
LEN                 : 'len';

IDENTIFIER : LETTER (LETTER|DIGIT)* ;
INTEGER : DIGIT DIGIT* ;
FLOAT : DIGIT DIGIT* '.' DIGIT DIGIT*;
CHARCONST : SINGLEQUOTE (LETTER|DIGIT) SINGLEQUOTE;       //TAREA: CHARLIT para crear literales de char: x:='h'
STRING: DOUBLEQUOTES .*? DOUBLEQUOTES;  //TAREA: STRLIT para crear literales de String: x:="hola"

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9' ;



WS  : [ \r\t]+ -> skip ;

LINECOMMENT: '#' ~[\r\n]* -> skip;
COMMENT: '"""' .*? '"""' -> skip;