package jochaes.minipythoncompiler.CustomExeptions;

import jochaes.minipythoncompiler.generated.MiniPythonParser;


public class VariableNoExisteException extends Exception{

    private String message;

    public VariableNoExisteException(){
        super();
    }

    public VariableNoExisteException(MiniPythonParser.ElementAccess_PE_ASTContext ctx ){
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        this.message =
                "\nVariableNoExisteException: "+
                        "\n\tLa lista no existe en la tabla de variables" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public VariableNoExisteException(String message){
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

