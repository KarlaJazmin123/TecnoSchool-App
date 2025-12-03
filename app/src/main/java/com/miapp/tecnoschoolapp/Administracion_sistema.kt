package com.miapp.tecnoschoolapp

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
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
import android.widget.VideoView
import android.widget.MediaController
import android.net.Uri

class Administracion_sistema : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_administracion_sistema)

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
        val ejecutar=findViewById<LinearLayout>(R.id.ejecutar)
        val tar2=findViewById<LinearLayout>(R.id.tar2_card)
        val configuracion=findViewById<LinearLayout>(R.id.configuracion)
        val tar3=findViewById<LinearLayout>(R.id.tar3_card)
        val control=findViewById<LinearLayout>(R.id.control)
        val tar4=findViewById<LinearLayout>(R.id.tar4_card)
        val simbolo=findViewById<LinearLayout>(R.id.simbolo)
        val tar5=findViewById<LinearLayout>(R.id.tar5_card)
        val terminal=findViewById<LinearLayout>(R.id.terminal)
        val tar6=findViewById<LinearLayout>(R.id.tar6_card)
        val admi=findViewById<LinearLayout>(R.id.admi)
        val tar7=findViewById<LinearLayout>(R.id.tar7_card)
        val discos=findViewById<LinearLayout>(R.id.discos)
        val tar8=findViewById<LinearLayout>(R.id.tar8_card)
        val sistema=findViewById<LinearLayout>(R.id.sistema)
        val tar9=findViewById<LinearLayout>(R.id.tar9_card)




        App.setOnClickListener {flipCard(App, tar1) }
        tar1.setOnClickListener { flipCard(tar1,App) }
        ejecutar.setOnClickListener { flipCard(ejecutar, tar2) }
        tar2.setOnClickListener { flipCard(tar2, ejecutar) }
        configuracion.setOnClickListener { flipCard(configuracion,tar3) }
        tar3.setOnClickListener{flipCard(tar3, configuracion)}
        control.setOnClickListener { flipCard(control, tar4) }
        tar4.setOnClickListener { flipCard(tar4, control) }
        simbolo.setOnClickListener { flipCard(simbolo,tar5) }
        tar5.setOnClickListener { flipCard(tar5,simbolo) }
        terminal.setOnClickListener { flipCard(terminal,tar6) }
        tar6.setOnClickListener { flipCard(tar6,terminal) }
        admi.setOnClickListener { flipCard(admi,tar7) }
        tar7.setOnClickListener { flipCard(tar7,admi) }
        discos.setOnClickListener { flipCard(discos,tar8) }
        tar8.setOnClickListener { flipCard(tar8,discos) }
        sistema.setOnClickListener { flipCard(sistema,tar9) }
        tar9.setOnClickListener { flipCard(tar9,sistema) }

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
