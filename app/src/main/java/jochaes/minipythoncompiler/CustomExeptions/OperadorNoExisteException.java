package jochaes.minipythoncompiler.CustomExeptions;

import jochaes.minipythoncompiler.generated.MiniPythonParser;
import org.antlr.v4.runtime.Token;

public class OperadorNoExisteException extends Exception{

    private String message;

    public OperadorNoExisteException(){
        super();
    }

    public OperadorNoExisteException(String message){
        super(message);
    }

    public OperadorNoExisteException(Token token){
        int line = token.getLine();
        int col = token.getCharPositionInLine();

        this.message =
                "\nOperadorNoExisteException: "+
                        "\n\tEl operador de esta expresion no se reconoce" +
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