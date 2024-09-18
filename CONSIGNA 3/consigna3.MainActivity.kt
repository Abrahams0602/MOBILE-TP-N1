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
        val tvtelefono= findViewById<TextView>(R.id.TVtelefono)


        boton1.setOnClickListener {
            val inputNombre = etnombre.text.toString()
            val inputTelefono = tvtelefono.text.toString()

            if (inputNombre.isEmpty()){
                Toast.makeText( this, "Por favor, ingresa tu nombre", Toast.LENGTH_SHORT).show()


            }else if(inputTelefono.isEmpty()){
                Toast.makeText( this, "Por favor, ingresa tu n´mero de teléfono", Toast.LENGTH_SHORT).show()


            }else {


                if(inputTelefono == null || inputTelefono.length != 10){
                    Toast.makeText( this, "Por favor, ingresa una número de teléfono válido", Toast.LENGTH_SHORT).show()

                }else {
                    tviewTitulo.text = "Hola, $inputNombre Tu número de teléfono es: $inputTelefono"
                    tviewTitulo.setTextColor(Color.BLUE)

                }
            }



        }




    }}
