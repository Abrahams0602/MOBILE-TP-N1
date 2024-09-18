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
        val botonLimpiar = findViewById<Button>(R.id.botonLimpiar)
        val etnombre = findViewById<EditText>(R.id.TVnombre)
        val etedad= findViewById<EditText>(R.id.TVedad)
        val etdireccion = findViewById<EditText>(R.id.TVdireccion)


        boton1.setOnClickListener {
            val inputNombre = etnombre.text.toString()
            val inputedad = etedad.text.toString()
            val inputdireccion= etdireccion.text.toString()

            if (inputNombre.isEmpty()){
                Toast.makeText( this, "Por favor, ingresa tu nombre", Toast.LENGTH_SHORT).show()


            }else if(inputedad.isEmpty()){
                Toast.makeText( this, "Por favor, ingresa tu edad", Toast.LENGTH_SHORT).show()


            }else if(inputdireccion.isEmpty()){
                Toast.makeText( this,"Por favor, ingresa tu dirección ", Toast.LENGTH_SHORT).show()


               }else{
                   val numeroEdad = inputedad.toIntOrNull()

                    if(numeroEdad == null || numeroEdad <=  0) {
                    Toast.makeText( this, "Por favor, ingresa una edad válida", Toast.LENGTH_SHORT).show()

               }else{
                    if(inputdireccion.length < 11) {
                    Toast.makeText( this, "Por favor, ingresa una dirección válida", Toast.LENGTH_SHORT).show()
                }else {
                        tviewTitulo.text = "Hola, $inputNombre Tu edad es: $inputedad y tu dirección es $inputdireccion"
                        tviewTitulo.setTextColor(Color.BLUE)

                    }

        }
        }
botonLimpiar.setOnClickListener{

    etnombre.text.clear()
    etedad.text.clear()
    etdireccion.text.clear()
    tviewTitulo.text = ""

}
        }
    }
}


