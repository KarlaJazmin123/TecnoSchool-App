package com.miapp.tecnoschoolapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class Office : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_office)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, Menu_Word::class.java))
        }

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            startActivity(Intent(this, Menu_Power_Point::class.java))
        }
        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            startActivity(Intent(this, Menu_Excel::class.java))
        }






    }
}