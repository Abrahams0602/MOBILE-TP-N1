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
        val etnombre = findViewById<EditText>(R.id.TVnombre)
        val etedad= findViewById<EditText>(R.id.TVedad)


        boton1.setOnClickListener {
            val inputNombre = etnombre.text.toString()
            val inputEdad = etedad.text.toString()

            if (inputNombre.isEmpty()){
                Toast.makeText( this, "Por favor, ingresa tu nombre", Toast.LENGTH_SHORT).show()


            }else if(inputEdad.isEmpty()){
                Toast.makeText( this, "Por favor, ingresa tu edad", Toast.LENGTH_SHORT).show()


            }else {
                //Se convierte la edad en numero
                val Edadnumero = inputEdad.toIntOrNull()

                if(Edadnumero == null || Edadnumero <= 0) {
                    Toast.makeText( this, "Por favor, ingresa una edad válida", Toast.LENGTH_SHORT).show()

                }else {
                    tviewTitulo.text = "HOLA, $inputNombre Tu edad es : $inputEdad"
                    tviewTitulo.setTextColor(Color.BLUE)

                }
            }



        }




        }
        }
