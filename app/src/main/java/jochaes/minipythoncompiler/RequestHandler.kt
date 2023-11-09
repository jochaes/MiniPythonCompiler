import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File
import java.io.IOException

class RequestHandler {

    fun sendFile(ipAddress: String, consola: android.widget.TextView, context: Context) {
        val client = OkHttpClient()
        val mediaType = "application/octet-stream".toMediaTypeOrNull()
        val byteCode: Array<String> = arrayOf(
            "0 DEF Main",
            "1 LOAD_CONST \"Holis Mundo\"",
            "2 LOAD_GLOBAL print",
            "3 CALL_FUNCTION 1",
            "4 END"
        )


        try {
            val fileName = "byteCode.txt"
            val outputStream = context.openFileOutput(fileName, Context.MODE_PRIVATE)
            for (line in byteCode) {
                outputStream.write(line.toByteArray())
                outputStream.write("\n".toByteArray())
            }
            outputStream.close()

            //Send that file through a POST request to "192.168.100.2:5146/api/upload" and print the response in the console
            val file = File(context.filesDir, fileName)


            // Use coroutines for asynchronous network operation
            GlobalScope.launch(Dispatchers.IO) {
                try {
//                    val request = okhttp3.Request.Builder()
//                        .url("http://$ipAddress:5146/api/upload")
//                        .post(requestBody)
//                        .build()
                    val mediaType = "text/plain".toMediaTypeOrNull()
                    val request = okhttp3.Request.Builder()
                        .url("http://$ipAddress:5146/api/upload")
                        .post(
                            MultipartBody.Builder()
                            .setType(MultipartBody.FORM)
                            .addFormDataPart("file", "byteCode.txt", file.asRequestBody(mediaType))
                            .build())
                        .build()
//                    val request = okhttp3.Request.Builder()
//                        .url("http://$ipAddress:5146/ejecutar/hola.txt")
//                        .get()
//                        .build()

                    val response = client.newCall(request).execute()
                    val responseBodyString = response.body?.string() ?: ""

                    // Update UI on the main thread
                    withContext(Dispatchers.Main) {
                        consola.text = responseBodyString
                    }



                    println(responseBodyString)
                } catch (e: IOException) {
                    e.printStackTrace()

                    // Update UI on the main thread
                    withContext(Dispatchers.Main) {
                        consola.text = e.toString()
                    }
                }
            }

        } catch (e: IOException) {
            e.printStackTrace()

            // Update UI on the main thread
            consola.text = e.toString()
        }
    }
}
