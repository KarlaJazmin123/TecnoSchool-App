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

class Administracion_ventas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_administracion_ventas)

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

        val App=findViewById<LinearLayout>(R.id.App)
        val tar1=findViewById<LinearLayout>(R.id.tar1_card)
        val cam=findViewById<LinearLayout>(R.id.cam)
        val tar2=findViewById<LinearLayout>(R.id.tar2_card)
        val men=findViewById<LinearLayout>(R.id.men)
        val tar3=findViewById<LinearLayout>(R.id.tar3_card)
        val pro=findViewById<LinearLayout>(R.id.pro)
        val tar4=findViewById<LinearLayout>(R.id.tar4_card)
        val cerrar=findViewById<LinearLayout>(R.id.cerrar)
        val tar5=findViewById<LinearLayout>(R.id.tar5_card)
        val virtual=findViewById<LinearLayout>(R.id.virtual)
        val tar6=findViewById<LinearLayout>(R.id.tar6_card)
        val escritorios=findViewById<LinearLayout>(R.id.escritorios)
        val tar7=findViewById<LinearLayout>(R.id.tar7_card)
        val escritorio=findViewById<LinearLayout>(R.id.escritorio)
        val tar8=findViewById<LinearLayout>(R.id.tar8_card)



        App.setOnClickListener {flipCard(App, tar1) }
        tar1.setOnClickListener { flipCard(tar1,App) }
        cam.setOnClickListener {flipCard(cam, tar2) }
        tar2.setOnClickListener { flipCard(tar2, cam) }
        men.setOnClickListener {flipCard(men, tar3) }
        tar3.setOnClickListener { flipCard(tar3, men) }
        pro.setOnClickListener {flipCard(pro, tar4) }
        tar4.setOnClickListener { flipCard(tar4, pro) }
        cerrar.setOnClickListener {flipCard(cerrar, tar5) }
        tar5.setOnClickListener { flipCard(tar5, cerrar) }
        virtual.setOnClickListener {flipCard(virtual, tar6) }
        tar6.setOnClickListener { flipCard(tar6, virtual)}
        escritorios.setOnClickListener {flipCard(escritorios, tar7) }
        tar7.setOnClickListener { flipCard(tar7, escritorios) }
        escritorio.setOnClickListener {flipCard(escritorio, tar8) }
        tar8.setOnClickListener { flipCard(tar8, escritorio) }


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

