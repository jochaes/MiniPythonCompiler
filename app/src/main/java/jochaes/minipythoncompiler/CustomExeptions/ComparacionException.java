package jochaes.minipythoncompiler.CustomExeptions;

public class ComparacionException extends Exception{
    private String message;

    public ComparacionException(){
        super();
    }

    public ComparacionException(String message){
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
