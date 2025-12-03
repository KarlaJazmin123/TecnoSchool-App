package com.miapp.tecnoschoolapp

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.addListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.LinearLayout

class Menu_Word : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_word)

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            val intent = Intent(this, Office::class.java)
            startActivity(intent)
            finish()
        }
        val barraW = findViewById<Button>(R.id.barraW)
        barraW.setOnClickListener {
            val intent = Intent(this, Barra_Herramientas::class.java)
            startActivity(intent)
            finish()
        }
        val archivo = findViewById<Button>(R.id.archivo)
        archivo.setOnClickListener {
            val intent = Intent(this, Crear_GuardarArc::class.java)
            startActivity(intent)
            finish()
        }
        val formato = findViewById<Button>(R.id.formato)
        formato.setOnClickListener {
            val intent = Intent(this, Formato_Texto::class.java)
            startActivity(intent)
            finish()
        }
        val listas = findViewById<Button>(R.id.listas)
        listas.setOnClickListener {
            val intent = Intent(this, Listas_NumeradasW::class.java)
            startActivity(intent)
            finish()
        }
        val pagina = findViewById<Button>(R.id.pagina)
        pagina.setOnClickListener {
            val intent = Intent(this, Pies_PaginaW::class.java)
            startActivity(intent)
            finish()
        }
        val btninsertar = findViewById<Button>(R.id.btninsertar)
        btninsertar.setOnClickListener {
            val intent = Intent(this, Insertar_ImagenesW::class.java)
            startActivity(intent)
            finish()
        }
        val estilos = findViewById<Button>(R.id.estilos)
        estilos.setOnClickListener {
            val intent = Intent(this, Estilos_PlantillasW::class.java)
            startActivity(intent)
            finish()
        }
        val ortografia = findViewById<Button>(R.id.ortografia)
        ortografia.setOnClickListener {
            val intent = Intent(this, Ortografia_Comentarios::class.java)
            startActivity(intent)
            finish()
        }
        val imprimir = findViewById<Button>(R.id.imprimir)
        imprimir.setOnClickListener {
            val intent = Intent(this, ImprimirW::class.java)
            startActivity(intent)
            finish()
        }
        val Introduccion = findViewById<Button>(R.id.Introduccion)
        Introduccion.setOnClickListener {
            val intent = Intent(this, Introduccion_Word::class.java)
            startActivity(intent)
            finish()
        }








    }
}
