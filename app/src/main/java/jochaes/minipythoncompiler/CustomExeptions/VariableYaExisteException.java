package jochaes.minipythoncompiler.CustomExeptions;


import jochaes.minipythoncompiler.generated.MiniPythonParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VariableYaExisteException extends Exception{

    private String message;

    public VariableYaExisteException(){
        super();
    }

    public  VariableYaExisteException(MiniPythonParser.DefStatement_ASTContext ctx){
        int line = ctx.getStart().getLine();
        int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        this.message =
                "\nVariableYaExisteException: "+
                        "\n\tEl nombre de la funcion ya existe en la Tabla de Variables" +
                        "\n\ten Linea: " + line + " Columna: " + col;
        //Imprimir un error en consola
    }

    public VariableYaExisteException(TerminalNode node ){
        int line = node.getSymbol().getLine();
        int col  = node.getSymbol().getCharPositionInLine();

        this.message =
                "\nVariableYaExisteException: "+
                        "\n\tEl argumento de la funcion ya existe en la Tabla de Variables" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public VariableYaExisteException(MiniPythonParser.FunctionCall_PE_ASTContext ctx ){
        int line = ctx.getStart().getLine();
        int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        this.message =
                "\nVariableYaExisteException: "+
                        "\n\tEl nombre de esta funcion pertenece al de una variable" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public VariableYaExisteException(MiniPythonParser.FunctionCallStatement_ASTContext ctx ){
        int line = ctx.getStart().getLine();
        int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        this.message =
                "\nVariableYaExisteException: "+
                        "\n\tEl nombre de esta funcion pertenece al de una variable" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }




    public VariableYaExisteException(String message){
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
