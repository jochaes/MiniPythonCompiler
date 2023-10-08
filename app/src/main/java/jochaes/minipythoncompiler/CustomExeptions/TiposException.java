package jochaes.minipythoncompiler.CustomExeptions;

import jochaes.minipythoncompiler.generated.MiniPythonParser;

import org.antlr.v4.runtime.Token;


public class TiposException extends Exception{

    private String message;

    public TiposException(){
        super();
    }

    public TiposException(String message){
        super(message);
    }


    private String getCustomType(int type){
        switch(type){
            case -1:
                return "indefinido";
            case 0:
                return "int";
            case 1:
                return "string";
            case 2:
                return "char";
            case 3:
                return "list";
            case 4:
                return "float";
            case 5:
                return "bool";
            default:
                return "desconocido";
        }
    }

    public TiposException(MiniPythonParser.ListExpression_ASTContext ctx ){
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        this.message =
                "\nTiposException: "+
                        "\n\tTodos los elementos de la lista deben ser del mismo tipo" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public TiposException(MiniPythonParser.ElementAccess_PE_ASTContext ctx ){
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        this.message =
                "\nTiposException: "+
                        "\n\tLa variable a la que quiere acceder, no es una lista" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public TiposException(int primitive1, int primitive2, Token operator){
        int line = operator.getLine();
        int col = operator.getCharPositionInLine();

        this.message =
                "\nTiposException: "+
                        "\n\tEl operador " + operator.getText() + " no puede ser aplicado a los tipos " + getCustomType(primitive1) + " y " + getCustomType(primitive2) +
                        "\n\ten Linea: " + line + " Columna: " + col;

    }



    @Override
    public String getMessage(){
        return this.message;
    }

    @Override
    public String toString(){
        return this.message;
    }
}
