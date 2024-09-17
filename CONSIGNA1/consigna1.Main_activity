package ar.com.ifts18.aprendiendokotlin

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        val tviewTitulo = findViewById<TextView>(R.id.TView)
        val boton1= findViewById<Button>(R.id.boton1)
        val tvnombre = findViewById<TextView>(R.id.TVnombre)


        boton1.setOnClickListener {
            val inputNombre = tvnombre.text.toString()
            if (inputNombre.isNotEmpty()){
               tviewTitulo.text = "Tu nombre es $inputNombre"
                tviewTitulo.setTextColor(Color.BLUE)
            }else {
                Toast.makeText( this, "Por favor, ingresa tu nombre", Toast.LENGTH_SHORT).show()
                Log.w("botonLoco", "No se ha ingresado un nombre ")
            }



        }




        }
        }

