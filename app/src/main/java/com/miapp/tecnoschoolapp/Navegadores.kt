package com.miapp.tecnoschoolapp

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.addListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Navegadores : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_navegadores)


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


        val reabrir = findViewById<LinearLayout>(R.id.reabrir)
        val tar1 = findViewById<LinearLayout>(R.id.tar1_card)
        val privada = findViewById<LinearLayout>(R.id.privada)
        val tar2 = findViewById<LinearLayout>(R.id.tar2_card)
        val pestañas = findViewById<LinearLayout>(R.id.pestañas)
        val tar3 = findViewById<LinearLayout>(R.id.tar3_card)
        val barra = findViewById<LinearLayout>(R.id.barra)
        val tar4 = findViewById<LinearLayout>(R.id.tar4_card)
        val actualizar = findViewById<LinearLayout>(R.id.actualizar)
        val tar5 = findViewById<LinearLayout>(R.id.tar5_card)
        val forzar = findViewById<LinearLayout>(R.id.forzar)
        val tar6 = findViewById<LinearLayout>(R.id.tar6_card)
        val pagina = findViewById<LinearLayout>(R.id.pagina)
        val tar7 = findViewById<LinearLayout>(R.id.tar7_card)
        val descargas = findViewById<LinearLayout>(R.id.descargas)
        val tar8 = findViewById<LinearLayout>(R.id.tar8_card)
        val zoom = findViewById<LinearLayout>(R.id.zoom)
        val tar9 = findViewById<LinearLayout>(R.id.tar9_card)










        reabrir.setOnClickListener { flipCard(reabrir,tar1) }
        tar1.setOnClickListener { flipCard(tar1,reabrir) }
        privada.setOnClickListener { flipCard(privada,tar2) }
        tar2.setOnClickListener { flipCard(tar2,privada) }
        pestañas.setOnClickListener { flipCard(pestañas,tar3) }
        tar3.setOnClickListener { flipCard(tar3,pestañas) }
        barra.setOnClickListener { flipCard(barra,tar4) }
        tar4.setOnClickListener { flipCard(tar4,barra) }
        actualizar.setOnClickListener { flipCard(actualizar,tar5) }
        tar5.setOnClickListener { flipCard(tar5,actualizar)}
        forzar.setOnClickListener { flipCard(forzar,tar6) }
        tar6.setOnClickListener { flipCard(tar6,forzar) }
        pagina.setOnClickListener { flipCard(pagina,tar7) }
        tar7.setOnClickListener { flipCard(tar7,pagina) }
        descargas.setOnClickListener { flipCard(descargas,tar8) }
        tar8.setOnClickListener { flipCard(tar8,descargas) }
        zoom.setOnClickListener { flipCard(zoom,tar9) }
        tar9.setOnClickListener { flipCard(tar9,zoom)}



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