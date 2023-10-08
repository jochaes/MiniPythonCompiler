package jochaes.minipythoncompiler.CustomExeptions;

import org.antlr.v4.runtime.Token;

public class AsignacionException extends Exception{

    private String message;

    public AsignacionException(){
        super();
    }

    public AsignacionException(String message){
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

    public AsignacionException(int identificador, int expresion, Token operator){
        int line = operator.getLine();
        int col = operator.getCharPositionInLine();

        this.message =
                "\nAsignacionException: "+
                        "\n\tNo se puede asignar " + getCustomType(expresion) + " a una variable ya definida de tipo  " + getCustomType(identificador) +
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
