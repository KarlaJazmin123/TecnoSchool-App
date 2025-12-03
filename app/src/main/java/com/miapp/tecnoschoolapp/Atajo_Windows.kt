package com.miapp.tecnoschoolapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.animation.ObjectAnimator
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import androidx.core.animation.addListener


class Atajo_Windows : AppCompatActivity() {
    private var flipped = false



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_atajo_windows)

        val btnRegresar: Button = findViewById(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            startActivity(Intent(this, Windows11Activity::class.java))
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





        val front = findViewById<LinearLayout>(R.id.back_card)
        val back = findViewById<LinearLayout>(R.id.front_card)
        val tarjeta = findViewById<LinearLayout>(R.id.tarjeta_card)
        val tar2 = findViewById<LinearLayout>(R.id.tar2_card)
        val Abrir = findViewById<LinearLayout>(R.id.Abrir)
        val tar3 = findViewById<LinearLayout>(R.id.tar3_card)
        val Explorador = findViewById<LinearLayout>(R.id.Explorador)
        val tar4 = findViewById<LinearLayout>(R.id.tar4_card)
        val HistorialP = findViewById<LinearLayout>(R.id.HistorialP)
        val tar5 = findViewById<LinearLayout>(R.id.tar5_card)
        val Bloquear = findViewById<LinearLayout>(R.id.Bloquear)
        val tar6 = findViewById<LinearLayout>(R.id.tar6_card)
        val Mostrar = findViewById<LinearLayout>(R.id.Escritorio)
        val tar7 = findViewById<LinearLayout>(R.id.tar7_card)
        val Minimizar = findViewById<LinearLayout>(R.id.Minimizar)
        val tar8 = findViewById<LinearLayout>(R.id.tar8_card)
        val Restaurar = findViewById<LinearLayout>(R.id.Restaurar)
        val tar9 = findViewById<LinearLayout>(R.id.tar9_card)
        val Asistente = findViewById<LinearLayout>(R.id.Asistente)
        val tar10 = findViewById<LinearLayout>(R.id.tar10_card)
        val Menu = findViewById<LinearLayout>(R.id.Menu)
        val tar12 = findViewById<LinearLayout>(R.id.tar12_card)
        val Ejecucion = findViewById<LinearLayout>(R.id.Ejecucion)
        val tar13 = findViewById<LinearLayout>(R.id.tar13_card)


        front.setOnClickListener { flipCard(front, back) }
        back.setOnClickListener { flipCard(back, front) }
        tarjeta.setOnClickListener { flipCard(tarjeta, tar2) }
        tar2.setOnClickListener { flipCard(tar2, tarjeta) }
        Abrir.setOnClickListener { flipCard(Abrir, tar3) }
        tar3.setOnClickListener { flipCard(tar3, Abrir) }
        Explorador.setOnClickListener { flipCard(Explorador, tar4) }
        tar4.setOnClickListener { flipCard(tar4, Explorador) }
        HistorialP.setOnClickListener { flipCard(HistorialP, tar5) }
        tar5.setOnClickListener { flipCard(tar5, HistorialP) }
        Bloquear.setOnClickListener { flipCard(Bloquear, tar6) }
        tar6.setOnClickListener { flipCard(tar6, Bloquear) }
        Mostrar.setOnClickListener { flipCard(Mostrar, tar7) }
        tar7.setOnClickListener { flipCard(tar7, Mostrar) }
        Minimizar.setOnClickListener { flipCard(Minimizar, tar8) }
        tar8.setOnClickListener { flipCard(tar8, Minimizar) }
        Restaurar.setOnClickListener { flipCard(Restaurar, tar9) }
        tar9.setOnClickListener { flipCard(tar9, Restaurar) }
        Asistente.setOnClickListener { flipCard(Asistente, tar10) }
        tar10.setOnClickListener { flipCard(tar10, Asistente) }
        Menu.setOnClickListener { flipCard(Menu, tar12) }
        tar12.setOnClickListener { flipCard(tar12, Menu) }
        Ejecucion.setOnClickListener { flipCard(Ejecucion, tar13) }
        tar13.setOnClickListener { flipCard(tar13, Ejecucion) }


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
}