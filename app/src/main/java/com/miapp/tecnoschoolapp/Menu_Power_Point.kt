package com.miapp.tecnoschoolapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent

class Menu_Power_Point : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_power_point)

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            startActivity(Intent(this, Office::class.java))

        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            startActivity(Intent(this, Barra_HerramientasP::class.java))
        }
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            startActivity(Intent(this, Introduccion_PowerP::class.java))
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            startActivity(Intent(this, Diseno_DiapositivasP::class.java))
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            startActivity(Intent(this, Contenido_MultimediaP::class.java))
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            startActivity(Intent(this, Presentacion_IterativaP::class.java))
        }
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            startActivity(Intent(this, Funciones_AvanzadasP::class.java))
        }
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            startActivity(Intent(this, Transiciones_AnimacionesP::class.java))
        }









    }
}