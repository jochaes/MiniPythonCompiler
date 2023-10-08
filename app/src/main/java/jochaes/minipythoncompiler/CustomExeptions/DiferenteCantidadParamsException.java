package jochaes.minipythoncompiler.CustomExeptions;



import jochaes.minipythoncompiler.generated.MiniPythonParser;

public class DiferenteCantidadParamsException extends Exception{

    private String message;

    public DiferenteCantidadParamsException(){
        super();
    }

    public DiferenteCantidadParamsException(MiniPythonParser.FunctionCall_PE_ASTContext ctx ){
        int line = ctx.getStart().getLine();
        int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        this.message =
                "\nDiferenteCantidadParamsException: "+
                        "\n\tLa cantidad de parametros es diferente a su definicion" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public DiferenteCantidadParamsException(MiniPythonParser.FunctionCallStatement_ASTContext ctx ){
        int line = ctx.getStart().getLine();
        int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        this.message =
                "\nDiferenteCantidadParamsException: "+
                        "\n\tLa cantidad de parametros es diferente a su definicion" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public DiferenteCantidadParamsException(String message){
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
