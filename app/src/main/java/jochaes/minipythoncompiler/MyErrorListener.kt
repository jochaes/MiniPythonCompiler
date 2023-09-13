package jochaes.minipythoncompiler

import jochaes.minipythoncompiler.generated.*
import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer


class MyErrorListener : BaseErrorListener(){

    private var errorMessages = ArrayList<String>()

    override fun syntaxError(
        recognizer: Recognizer<*, *>?,
        offendingSymbol: Any?,
        line: Int,
        charPositionInLine: Int,
        msg: String?,
        e: RecognitionException?
    ) {
        if(recognizer is MiniPythonParser){
            errorMessages.add("Parser Error - line $line:$charPositionInLine $msg")
        }else if (recognizer is MiniPythonLexer){
            errorMessages.add("Scanner Error - line $line:$charPositionInLine $msg")
        }else{
            errorMessages.add("Other Error")
        }
    }

    fun hasErrors(): Boolean{
        return errorMessages.isNotEmpty()
    }

    override fun toString(): String {
        if( !hasErrors() ) return "0 Errors"
        val builder = StringBuilder()
        for ( error in errorMessages){
            builder.append("$error\n")
        }
        return builder.toString()
    }

}