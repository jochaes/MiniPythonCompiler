package jochaes.minipythoncompiler.CustomExeptions;

import jochaes.minipythoncompiler.generated.MiniPythonParser;



public class FuncionYaExisteExeption extends Exception{

    private String message;

    FuncionYaExisteExeption(){
        super();
    }

    public  FuncionYaExisteExeption(MiniPythonParser.DefStatement_ASTContext ctx){
        int line = ctx.getStart().getLine();
        int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        this.message =
                "\nFuncionYaExisteExeption: "+
                        "\n\tEl nombre de la funcion ya existe en la Tabla de Metodos" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public  FuncionYaExisteExeption(MiniPythonParser.Identifier_PE_ASTContext ctx){
        int line = ctx.getStart().getLine();
        int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        this.message =
                "\nFuncionYaExisteExeption: "+
                        "\n\tEl nombre de esta variable, pertenece al de una funcion" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public  FuncionYaExisteExeption(MiniPythonParser.ElementAccess_PE_ASTContext ctx){
        int line = ctx.getStart().getLine();
        int col = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        this.message =
                "\nFuncionYaExisteExeption: "+
                        "\n\tEl nombre de esta variable lista, pertenece al de una funcion" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public  FuncionYaExisteExeption(MiniPythonParser.AssignStatement_ASTContext ctx){
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        this.message =
                "\nFuncionYaExisteExeption: "+
                        "\n\tSe quiere asignar algo a una variable que ya existe como funcion" +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }

    public  FuncionYaExisteExeption(MiniPythonParser.ForStatement_ASTContext ctx){
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        this.message =
                "\nFuncionYaExisteExeption: "+
                        "\n\tEl identificador de un for no puede ser el nombre de una función." +
                        "\n\ten Linea: " + line + " Columna: " + col;
    }



    public FuncionYaExisteExeption(String message){
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
