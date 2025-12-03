package com.miapp.tecnoschoolapp

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.addListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.LinearLayout
import android.widget.MediaController
import android.widget.VideoView

class Funciones_Especiales : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_funciones_especiales)

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            val intent = Intent(this, Windows11Activity::class.java)
            startActivity(intent)
            finish()
        }
        val videoView = findViewById<VideoView>(R.id.videoView)

        val videoUrl = "https://TU-LINK-DE-VIDEO/video.mp4"
        val uri = Uri.parse(videoUrl)

        videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.setOnPreparedListener {
            videoView.start()
        }


        val lupa = findViewById<LinearLayout>(R.id.lupa)
        val tar1 = findViewById<LinearLayout>(R.id.tar1_card)
        val cerrar = findViewById<LinearLayout>(R.id.cerrar)
        val tar2 = findViewById<LinearLayout>(R.id.tar2_card)
        val narrador = findViewById<LinearLayout>(R.id.narrador)
        val tar3 = findViewById<LinearLayout>(R.id.tar3_card)
        val teclado = findViewById<LinearLayout>(R.id.teclado)
        val tar4 = findViewById<LinearLayout>(R.id.tar4_card)
        val alto = findViewById<LinearLayout>(R.id.alto)
        val tar5 = findViewById<LinearLayout>(R.id.tar5_card)
        val opciones = findViewById<LinearLayout>(R.id.opciones)
        val tar6 = findViewById<LinearLayout>(R.id.tar6_card)
        val molestar = findViewById<LinearLayout>(R.id.molestar)
        val tar7 = findViewById<LinearLayout>(R.id.tar7_card)
        val ampliar = findViewById<LinearLayout>(R.id.ampliar)
        val tar8 = findViewById<LinearLayout>(R.id.tar8_card)




        lupa.setOnClickListener { flipCard(lupa,tar1) }
        tar1.setOnClickListener { flipCard(tar1,lupa) }
        cerrar.setOnClickListener { flipCard(cerrar,tar2) }
        tar2.setOnClickListener { flipCard(tar2,cerrar) }
        narrador.setOnClickListener { flipCard(narrador,tar3) }
        tar3.setOnClickListener { flipCard(tar3,narrador) }
        teclado.setOnClickListener { flipCard(teclado,tar4) }
        tar4.setOnClickListener { flipCard(tar4,teclado) }
        alto.setOnClickListener { flipCard(alto,tar5) }
        tar5.setOnClickListener { flipCard(tar5,alto)}
        opciones.setOnClickListener { flipCard(opciones,tar6) }
        tar6.setOnClickListener { flipCard(tar6,opciones) }
        molestar.setOnClickListener { flipCard(molestar,tar7) }
        tar7.setOnClickListener { flipCard(tar7,molestar) }
        ampliar.setOnClickListener { flipCard(ampliar,tar8) }
        tar8.setOnClickListener { flipCard(tar8,ampliar) }

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