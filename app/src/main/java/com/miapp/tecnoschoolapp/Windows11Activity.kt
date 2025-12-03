package com.miapp.tecnoschoolapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Windows11Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_windows11)


        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            startActivity(Intent(this, Atajos_de_teclado::class.java))
        }


        val buttGeral: Button = findViewById(R.id.buttGenral)
        buttGeral.setOnClickListener {
            startActivity(Intent(this, Atalos_generales::class.java))
        }


        val butonWindows: Button = findViewById(R.id.butonWindows)
        butonWindows.setOnClickListener {
            startActivity(Intent(this, Atajo_Windows::class.java))
        }

        val butonAdm: Button = findViewById(R.id.butonAdm)
        butonAdm.setOnClickListener {
            startActivity(Intent(this, Administracion_ventas::class.java))
        }


        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            startActivity(Intent(this, Administracion_sistema::class.java))
        }


        val buttonr: Button = findViewById(R.id.buttonr)
        buttonr.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            startActivity(Intent(this, Explorador_Archivos::class.java))
        }
        val btonNave: Button = findViewById(R.id.btonNave)
        btonNave.setOnClickListener {
            startActivity(Intent(this, Navegadores::class.java))


        }
        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener {
            startActivity(Intent(this, Funciones_Especiales::class.java))
        }
        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener {
            startActivity(Intent(this, Otros_Comandos::class.java))
        }





    }
}