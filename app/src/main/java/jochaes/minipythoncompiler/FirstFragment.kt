package jochaes.minipythoncompiler

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import jochaes.minipythoncompiler.databinding.FragmentFirstBinding
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.lang.StringBuilder
import jochaes.minipythoncompiler.MyErrorListener
import jochaes.minipythoncompiler.generated.MiniPythonParser
import jochaes.minipythoncompiler.generated.MiniPythonScanner


import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.tree.ParseTree

import com.amrdeveloper.codeview.CodeView

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fileName = "toCompile.txt"
        val codeView = getView()?.findViewById<CodeView>(R.id.code_view)
        codeView?.setEnableLineNumber(true)
        codeView?.setLineNumberTextColor(Color.BLUE)
        codeView?.setLineNumberTextSize(25f)

        codeView?.setEnableHighlightCurrentLine(true)
        codeView?.setHighlightCurrentLineColor(Color.GRAY)


        try{

            val inputStream = context?.openFileInput(fileName)
            val reader = BufferedReader(InputStreamReader(inputStream))
            val stringBuilder = StringBuilder()
            var line: String?
            while(reader.readLine().also { line = it } != null ){
                stringBuilder.append(line).append("\n")
            }

            reader.close()
            inputStream?.close()

//            binding.fileTextView.text = stringBuilder.toString()
            codeView?.append(stringBuilder)


        } catch (e: IOException){
            e.printStackTrace()
        }



//        binding.compileButton.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }

        binding.compileButton.setOnClickListener{
            var errorListener: MyErrorListener?
            var tree: ParseTree? = null

            //val input =  CharStreams.fromStream(context?.openFileInput(fileName))
            val input =  CharStreams.fromString(binding.codeView.text.toString())
            val lexer = MiniPythonScanner(input)
            val parser = MiniPythonParser(CommonTokenStream(lexer))

            errorListener = MyErrorListener()
            lexer.removeErrorListeners()
            lexer.addErrorListener(errorListener)

            parser.removeErrorListeners()
            parser.addErrorListener(errorListener)

            val texto = binding.compileResponseTextView

            try{
                tree = parser.program()

                if (!errorListener.hasErrors()){
                    texto?.text = "Compilación Exitosa\n"
                    println("Compilación Exitosa!!\n")
                } else{
                    texto?.text = "Compilación Fallida\n"
                    println("Compilación Fallida!!\n")

                    texto?.append(errorListener.toString())
                    println(errorListener.toString())
                }

            } catch (e: RecognitionException){
                texto?.text = "Error de Reconocimiento"
                println("Error de Reconocimiento!!!")
                e.printStackTrace()
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}