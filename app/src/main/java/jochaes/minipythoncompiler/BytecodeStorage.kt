package jochaes.minipythoncompiler

import android.content.Context


class BytecodeStorage {

    private var bytecode:ArrayList<String> = ArrayList()

    fun addBytecode(bytecode:String){
        this.bytecode.add(bytecode)
    }

    fun getBytecode():ArrayList<String>{
        return this.bytecode
    }

    fun printBytecode(){
        bytecode.forEachIndexed { index, element ->
            println("$index $element")
        }
    }

    fun writeBytecodeToFile(context:Context){
        val fileName = "byteCode.txt"
        val outputStream = context.openFileOutput(fileName, Context.MODE_PRIVATE)

        for (line in bytecode) {
            outputStream.write(line.toByteArray())
            outputStream.write("\n".toByteArray())
        }

        outputStream.close()
    }

    fun clearBytecode(){
        this.bytecode.clear()
    }


}