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

class Otros_Comandos : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_otros_comandos)


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

        val captura = findViewById<LinearLayout>(R.id.captura)
        val tar1 = findViewById<LinearLayout>(R.id.tar1_card)
        val pantalla = findViewById<LinearLayout>(R.id.pantalla)
        val tar2 = findViewById<LinearLayout>(R.id.tar2_card)
        val guardar = findViewById<LinearLayout>(R.id.guardar)
        val tar3 = findViewById<LinearLayout>(R.id.tar3_card)
        val mostrar = findViewById<LinearLayout>(R.id.mostrar)
        val tar4 = findViewById<LinearLayout>(R.id.tar4_card)
        val rotacion = findViewById<LinearLayout>(R.id.rotacion)
        val tar5 = findViewById<LinearLayout>(R.id.tar5_card)
        val rotar = findViewById<LinearLayout>(R.id.rotar)
        val tar6 = findViewById<LinearLayout>(R.id.tar6_card)
        val sesion = findViewById<LinearLayout>(R.id.sesion)
        val tar7 = findViewById<LinearLayout>(R.id.tar7_card)
        val seguridad = findViewById<LinearLayout>(R.id.seguridad)
        val tar8 = findViewById<LinearLayout>(R.id.tar8_card)


        captura.setOnClickListener { flipCard(captura,tar1) }
        tar1.setOnClickListener { flipCard(tar1,captura) }
        pantalla.setOnClickListener { flipCard(pantalla,tar2) }
        tar2.setOnClickListener { flipCard(tar2,pantalla) }
        guardar.setOnClickListener { flipCard(guardar,tar3) }
        tar3.setOnClickListener { flipCard(tar3,guardar) }
        mostrar.setOnClickListener { flipCard(mostrar,tar4) }
        tar4.setOnClickListener { flipCard(tar4,mostrar) }
        rotacion.setOnClickListener { flipCard(rotacion,tar5) }
        tar5.setOnClickListener { flipCard(tar5,rotacion) }
        rotar.setOnClickListener { flipCard(rotar,tar6) }
        tar6.setOnClickListener { flipCard(tar6,rotar) }
        sesion.setOnClickListener { flipCard(sesion,tar7) }
        tar7.setOnClickListener { flipCard(tar7,sesion) }
        seguridad.setOnClickListener { flipCard(seguridad,tar8) }
        tar8.setOnClickListener { flipCard(tar8,seguridad) }
    }

    private fun findViewById() {
        TODO("Not yet implemented")
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