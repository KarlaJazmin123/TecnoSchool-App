package com.miapp.tecnoschoolapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Abrir pantalla de Windows 11
        val btnWindows: Button = findViewById(R.id.btnWindows)
        btnWindows.setOnClickListener {
            startActivity(Intent(this, Windows11Activity::class.java))
        }

        // Aquí puedes enlazar más botones si los agregaste
    }
}
