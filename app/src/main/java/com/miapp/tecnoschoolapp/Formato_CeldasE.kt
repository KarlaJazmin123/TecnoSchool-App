package com.miapp.tecnoschoolapp

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.addListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Formato_CeldasE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_formato_celdas_e)

        val btnRegresar2 = findViewById<Button>(R.id.btnRegresar2)
        btnRegresar2.setOnClickListener {
            val intent = Intent(this, Funciones_TextoE::class.java)
            startActivity(intent)
            finish()
        }
        val btnSiguiente = findViewById<Button>(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            val intent = Intent(this, Ordenar_FiltrarE::class.java)
            startActivity(intent)
            finish()
        }


        val parte_trasera = findViewById<LinearLayout>(R.id.parte_trasera)
        val parte_frontal = findViewById<LinearLayout>(R.id.parte_frontal)

        parte_trasera.setOnClickListener { flipCard(parte_trasera,parte_frontal) }
        parte_frontal.setOnClickListener { flipCard(parte_frontal,parte_trasera) }

    }
}

private fun flipCard(front: View, back: View) {
    val showBack = ObjectAnimator.ofFloat(front, "rotationY", 0f, 180f)
    val showFront = ObjectAnimator.ofFloat(back, "rotationY", -180f, 0f)

    showBack.duration = 500
    showFront.duration = 500

    showBack.start()
    showBack.addListener(onEnd = {
        front.visibility = View.GONE
        back.visibility = View.VISIBLE
        showFront.start()


    })
}
