package jochaes.minipythoncompiler

import android.content.Context
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import jochaes.minipythoncompiler.databinding.ActivityMainBinding
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.StringBuilder



class MainActivity : AppCompatActivity() {


    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val intent: Intent? = intent
        val text = StringBuilder()
        if( Intent.ACTION_VIEW == intent?.action && intent.data != null){
            // Get the URI of the file
            val fileUri: Uri? = intent.data

            //Read and Process the text file data from file
            try {
                val inputStream: InputStream? = contentResolver.openInputStream(fileUri!!)
                val reader =  BufferedReader( InputStreamReader(inputStream) )

                var line: String? = reader.readLine()

                while (line != null ) {
                    text.append(line).append("\n")
                    line = reader.readLine()
                }
                reader.close()
            } catch (e: IOException){
                e.printStackTrace()
            }

            val fileName = "toCompile.txt"
            try{
                val outputStream = openFileOutput(fileName, Context.MODE_PRIVATE)
                outputStream.write(text.toString().toByteArray())
                outputStream.close()

            }catch (e: IOException){
                e.printStackTrace()
            }

        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        viewModel = ViewModelProvider(this).get(SharedViewModel::class.java)
        viewModel.menuItemClicked.observe(this, Observer {
            clicked -> if (clicked){
                println("Button Clicked")
        }
        })
//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> {
                viewModel.setMenuItemClicked()
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}