package com.miapp.tecnoschoolapp

import android.animation.ObjectAnimator
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

class Presentacion_IterativaP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_presentacion_iterativa_p)


        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            val intent = Intent(this, Menu_Power_Point::class.java)
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