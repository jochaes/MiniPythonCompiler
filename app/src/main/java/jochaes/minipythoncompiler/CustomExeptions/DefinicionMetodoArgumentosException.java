package jochaes.minipythoncompiler.CustomExeptions;

import jochaes.minipythoncompiler.generated.MiniPythonParser;
import org.antlr.v4.runtime.Token;

public class DefinicionMetodoArgumentosException extends Exception{

    private String message;

    public DefinicionMetodoArgumentosException(){
        super();
    }

    public DefinicionMetodoArgumentosException(String message){
        super(message);
    }

    public DefinicionMetodoArgumentosException(MiniPythonParser.DefStatement_ASTContext ctx, Token token ){
        int line = ctx.getStart().getLine();
        int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        this.message =
                "\nDefinicionMetodoArgumentosException: "+
                        "\n\tHubo un error al tratar de inferir el tipo del argumento: " + token.getText() +
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
