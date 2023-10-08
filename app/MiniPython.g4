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



program : (mainStatement mainStatement*|EOF)                #program_AST;                         //Un programa es 1 main statement seguido de 0 más mainStatements

mainStatement:
          defStatement                                      #def_MS_AST
        | assignStatement                                   #assign_MS_AST
        | functionCallStatement                             #functionCall_MS_AST                           //Se agrego, se pueden hacer llamadas a funciones como main statement
        | printStatement                                    #print_MS_AST;

statement:
          ifStatement                                       #if_ST_AST
        | returnStatement                                   #return_ST_AST
        | printStatement                                    #print_ST_AST
        | whileStatement                                    #while_ST_AST
        | forStatement                                      #for_ST_AST
        | assignStatement                                   #assign_ST_AST
        | functionCallStatement                             #functionCall_ST_AST;
//        | assignStatementOperator                           #assignStaOpe_ST_AST;

defStatement: DEF IDENTIFIER OPENPARENTHESIS argList CLOSEPARENTHESIS COLON sequence    #defStatement_AST;

argList: (IDENTIFIER ( COMMA IDENTIFIER )*)?                                            #argList_AST;

ifStatement: IF (expression|comparison) COLON sequence ELSE COLON sequence              #ifStatement_AST;

whileStatement: WHILE (expression|comparison) COLON sequence                            #whileStatement_AST;

forStatement: FOR expression IN expressionList COLON sequence                           #forStatement_AST;

returnStatement: RETURN (expression|comparison) NEWLINE                                 #returnStatement_AST;

printStatement: PRINT (expression|comparison) NEWLINE                                   #printStatement_AST;

assignStatement: IDENTIFIER ASSIGNMENT (expression|comparison) NEWLINE                  #assignStatement_AST;

//assignStatementOperator: IDENTIFIER (SUBSTRACTIONASSIGNMENTOP|ADDITIONASSIGNMENTOP) expression NEWLINE #assignStaOpe_AST; //+= o -=

functionCallStatement: IDENTIFIER OPENPARENTHESIS expressionList CLOSEPARENTHESIS NEWLINE              #functionCallStatement_AST ;  //Se Arreglo, faltaba el parentesis cerrado

sequence: INDENT statement statement* DEDENT                               #sequence_AST;   //Tiene que llevar un Statement, con 0 o más, lo de newline ya no se necesita

expression: primitiveExpression (expressionOperator primitiveExpression)*  #expression_AST;

expressionOperator:
        PLUSSIGN            #addition_EO_AST
        | MINUSSIGN         #substraction_EO_AST
        | ASTERISK          #multiplication_EO_AST
        | SLASH             #division_EO_AST;

comparison: (expression comparisonOperator expression | OPENPARENTHESIS expression comparisonOperator expression CLOSEPARENTHESIS ) #comparison_AST;

comparisonOperator:
        LESSTHAN            #lessThan_CO_AST
        | GREATERTHAN       #greaterThan_CO_AST
        | LESSTHANEQUAL     #lessThanEqual_CO_AST
        | GREATERTHANEQUAL  #greaterThanEqual_CO_AST
        | COMPARISON        #comparison_CO_AST
        | NOTEQUAL          #notEqual_CO_AST;

expressionList: (expression (COMMA expression)*)?                           #expressionList_AST;

primitiveExpression:
          MINUSSIGN? INTEGER                                                #integer_PE_AST
        | MINUSSIGN? FLOAT                                                  #float_PE_AST
        | MINUSSIGN? IDENTIFIER                                             #identifier_PE_AST //Para tener -x por ejemplo
        | CHARCONST                                                         #char_PE_AST
        | STRING                                                            #string_PE_AST
        | IDENTIFIER (OPENPARENTHESIS expressionList CLOSEPARENTHESIS)      #functionCall_PE_AST
        | OPENPARENTHESIS expression CLOSEPARENTHESIS                       #expressioParen_PE_AST
        | listExpression                                                    #listExpression_PE_AST
        | LEN OPENPARENTHESIS expression CLOSEPARENTHESIS                   #len_PE_AST
        | IDENTIFIER (OPENSQRBRACKET expression CLOSESQRBRACKET) (OPENSQRBRACKET expression CLOSESQRBRACKET)*   #elementAccess_PE_AST;

listExpression: OPENSQRBRACKET expressionList CLOSESQRBRACKET               #listExpression_AST;


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
NOTEQUAL            : '!=';

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
CHARCONST : SINGLEQUOTE (.|('\\'.)) SINGLEQUOTE;       //Se Arreglo, ahora cepta caracteres de tipo '\n'
STRING: DOUBLEQUOTES .*? DOUBLEQUOTES;  //TAREA: STRLIT para crear literales de String: x:="hola"

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9' ;

WS  : [ \r\t]+ -> skip ;

LINECOMMENT: '#' ~[\r\n]* -> skip;
COMMENT: '"""' .*? '"""' -> skip;