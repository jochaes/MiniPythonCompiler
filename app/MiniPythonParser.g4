//Algoritmo de Descenso recursivo
//Proyecto 1: Parser Mini Python
//Estudiante: Josué Chaves


parser grammar MiniPythonParser;

options {
  tokenVocab = MiniPythonScanner;
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
        | expressionStatement;

defStatement: DEF IDENTIFIER OPENPARENTHESIS argList CLOSEPARENTHESIS COLON sequence;

argList: (IDENTIFIER ( COMMA IDENTIFIER )*)?;

ifStatement: IF expression COLON sequence ELSE COLON sequence;

whileStatement: WHILE expression COLON sequence;

forStatement: FOR expression IN expressionList COLON sequence;

returnStatement: RETURN expression;

printStatement: PRINT expression NEWLINE;

assignStatement: IDENTIFIER ASSIGNMENT expression NEWLINE;

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
        | CHARCONST
        | STRING
        | IDENTIFIER (OPENPARENTHESIS expressionList CLOSEPARENTHESIS)?
        | OPENPARENTHESIS expression CLOSEPARENTHESIS
        | listExpression
        | LEN OPENPARENTHESIS expression CLOSEPARENTHESIS;

listExpression: OPENSQRBRACKET expressionList CLOSESQRBRACKET;
