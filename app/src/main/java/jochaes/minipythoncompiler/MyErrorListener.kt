package jochaes.minipythoncompiler

import jochaes.minipythoncompiler.generated.*
import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer


class MyErrorListener : BaseErrorListener(){

    private var errorMessages = ArrayList<String>()

    val reset:String = "\u001B[0m"
    val red:String = "\u001B[31m";
    val green:String = "\u001B[32m"

//    String reset = "\u001B[0m"; // Reset to default color
//    String red = "\u001B[31m";   // Red
//    String green = "\u001B[32m"; // Green
//    String yellow = "\u001B[33m";// Yellow

    // Print colored text
//    System.out.println("This is " + red + "red" + reset + " text.");
//    System.out.println("This is " + green + "green" + reset + " text.");
//    System.out.println("This is " + yellow + "yellow" + reset + " text.");

    fun addContextualError(msg: String){
        errorMessages.add(" <font color='#5438DC'>Contextual Error - $msg </font>")
    }



    override fun syntaxError(
        recognizer: Recognizer<*, *>?,
        offendingSymbol: Any?,
        line: Int,
        charPositionInLine: Int,
        msg: String?,
        e: RecognitionException?
    ) {
        if(recognizer is MiniPythonParser){
           // errorMessages.add(" $red Parser Error - line $reset $line:$charPositionInLine $msg")
            errorMessages.add(" <font color='#F5B700'>Parser Error - line $line:$charPositionInLine $msg</font>")
        }else if (recognizer is MiniPythonLexer){
            //errorMessages.add("Scanner Error - line $line:$charPositionInLine $msg")
            errorMessages.add(" <font color='#00A1E4'>Scanner Error - line $line:$charPositionInLine $msg</font>")
        }else{
            errorMessages.add(" <font color='#DC0073'>Other Error</font>")
        }
    }

    fun hasErrors(): Boolean{
        return errorMessages.isNotEmpty()
    }

    override fun toString(): String {
        if( !hasErrors() ) return "0 Errors"
        val builder = StringBuilder()
        for ( error in errorMessages){
            builder.append("$error<br>")
        }

        return builder.toString()
    }

}