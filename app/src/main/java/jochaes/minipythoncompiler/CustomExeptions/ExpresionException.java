package jochaes.minipythoncompiler.CustomExeptions;

import jochaes.minipythoncompiler.generated.MiniPythonParser;

public class ExpresionException extends Exception{
    private String message;

    public ExpresionException(){
        super();
    }

    public ExpresionException(MiniPythonParser.ExpressionContext ctx ){
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        this.message =
                "\nExpresionException: "+
                        "\n\tDebe venir una comparasion, no una expresion"+
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public ExpresionException(String message){
        super(message);
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