package jochaes.minipythoncompiler


import RequestHandler
import android.graphics.Color
import android.os.Bundle
import android.text.Html
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.amrdeveloper.codeview.CodeView
import jochaes.minipythoncompiler.databinding.FragmentFirstBinding
import jochaes.minipythoncompiler.generated.MiniPythonLexer
import jochaes.minipythoncompiler.generated.MiniPythonParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.tree.ParseTree
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(){

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var viewModel: SharedViewModel

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
        codeView?.setLineNumberTextColor(Color.parseColor("#9D8DF1"))
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
            var bytecodeStorage: BytecodeStorage?
            var tree: ParseTree? = null

            //val input =  CharStreams.fromStream(context?.openFileInput(fileName))
            val input =  CharStreams.fromString(binding.codeView.text.toString())
            val lexer = MiniPythonLexer(input)
            val parser = MiniPythonParser(CommonTokenStream(lexer))

            bytecodeStorage = BytecodeStorage()
            errorListener = MyErrorListener()
            lexer.removeErrorListeners()
            lexer.addErrorListener(errorListener)

            parser.removeErrorListeners()
            parser.addErrorListener(errorListener)

            val texto = binding.compileResponseTextView

            try{
                println("Iniciando Compilación")

                tree = parser.program()
                Checker(errorListener).visit(tree)
                var error = false

                if (!errorListener.hasErrors()){

                    val spannedText = Html.fromHtml("<font color='#9CEC5B'>Compilación Sin Errores</font>", Html.FROM_HTML_MODE_LEGACY)
                    texto?.text = spannedText
                    println("Compilación Exitosa!!\n")
                } else{
                    var spannedText = Html.fromHtml("<font color='#DC0073'>Compilación Fallida</font>", Html.FROM_HTML_MODE_LEGACY)
                    texto?.text = spannedText
                    texto?.append("\n")
                    println("Compilación Fallida!!\n")

                    spannedText = Html.fromHtml(errorListener.toString(), Html.FROM_HTML_MODE_LEGACY)

                    texto?.append(spannedText)
                    println(errorListener.toString())
                    ///throw RecognitionException(null, null, null)
                    error = true
                }
                if (error){
                    GeneradorBytecode(bytecodeStorage).visit(tree)
                    bytecodeStorage.writeBytecodeToFile(requireContext())
                    var spannedText = Html.fromHtml("<font color='#DC0073'>Bytecode Generado</font>", Html.FROM_HTML_MODE_LEGACY)
                    texto?.text = spannedText
                    texto?.append("\n")
                    spannedText = Html.fromHtml(bytecodeStorage.toString(), Html.FROM_HTML_MODE_LEGACY)
                    texto?.append(spannedText)

                    bytecodeStorage.printBytecode()
                }




            } catch (e: RecognitionException){
                //texto?.text = "Error de Reconocimiento"
                println("Error de Reconocimiento!!!")
                e.printStackTrace()
            }

        }

        binding.runButton.setOnClickListener{
            println("Run Button Clicked")

            val consola: android.widget.TextView = binding.compileResponseTextView
            val RH: RequestHandler = RequestHandler()

            //Display alert to ask for the IP address
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("IP Address")
            builder.setMessage("Enter the IP address of the server")
            val input = EditText(requireContext())
            input.inputType = InputType.TYPE_CLASS_TEXT

            builder.setView(input)

            builder.setPositiveButton("OK") { dialog, which ->

                val ipAddress = input.text.toString()
                RH.sendFile(ipAddress, consola, requireContext() )
            }

            builder.setNegativeButton("Cancel") { dialog, which -> dialog.cancel() }
            builder.show()


        }

        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        viewModel.menuItemClicked.observe(viewLifecycleOwner, Observer {
            clicked -> if (clicked){
                val texto = binding.compileResponseTextView
                texto.text = "Presione \"Compilar\" "
                viewModel.clearMenuItemclicked()
        }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}