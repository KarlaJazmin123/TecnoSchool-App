package com.miapp.tecnoschoolapp

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.addListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.LinearLayout
import android.widget.Button
import android.content.Intent
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView


class Explorador_Archivos : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explorador_archivos)

        val btnRegresar = findViewById<Button>(R.id.Regresar)
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


        val ventana=findViewById<LinearLayout>(R.id.ventana)
        val tar1=findViewById<LinearLayout>(R.id.tar1_card)
        val pestaña=findViewById<LinearLayout>(R.id.pestaña)
        val tar2=findViewById<LinearLayout>(R.id.tar2_card)
        val cambiar=findViewById<LinearLayout>(R.id.cambiar)
        val tar3=findViewById<LinearLayout>(R.id.tar3_card)
        val carpeta=findViewById<LinearLayout>(R.id.carpeta)
        val tar4=findViewById<LinearLayout>(R.id.tar4_card)
        val eliminar=findViewById<LinearLayout>(R.id.eliminar)
        val tar5=findViewById<LinearLayout>(R.id.tar5_card)
        val papelera=findViewById<LinearLayout>(R.id.papelera)
        val tar6=findViewById<LinearLayout>(R.id.tar6_card)
        val elemento=findViewById<LinearLayout>(R.id.elemento)
        val tar7=findViewById<LinearLayout>(R.id.tar7_card)
        val renom=findViewById<LinearLayout>(R.id.renom)
        val tar8=findViewById<LinearLayout>(R.id.tar8_card)
        val barra=findViewById<LinearLayout>(R.id.barra)
        val tar9=findViewById<LinearLayout>(R.id.tar9_card)
        val retroceder=findViewById<LinearLayout>(R.id.retroceder)
        val tar10=findViewById<LinearLayout>(R.id.tar10_card)
        val avanzar=findViewById<LinearLayout>(R.id.avanzar)
        val tar11=findViewById<LinearLayout>(R.id.tar11_card)
        val nivel=findViewById<LinearLayout>(R.id.nivel)
        val tar12=findViewById<LinearLayout>(R.id.tar12_card)
        val actualizar=findViewById<LinearLayout>(R.id.actualizar)
        val tar13=findViewById<LinearLayout>(R.id.tar13_card)
        val mostrar=findViewById<LinearLayout>(R.id.mostrar)
        val tar14=findViewById<LinearLayout>(R.id.tar14_card)
        val cerrar=findViewById<LinearLayout>(R.id.cerrar)
        val tar15=findViewById<LinearLayout>(R.id.tar15_card)


        ventana.setOnClickListener {flipCard(ventana, tar1) }
        tar1.setOnClickListener { flipCard(tar1,ventana) }
        pestaña.setOnClickListener { flipCard(pestaña, tar2) }
        tar2.setOnClickListener { flipCard(tar2, pestaña) }
        cambiar.setOnClickListener { flipCard(cambiar,tar3) }
        tar3.setOnClickListener { flipCard(tar3,cambiar) }
        carpeta.setOnClickListener { flipCard(carpeta, tar4) }
        tar4.setOnClickListener { flipCard(tar4,carpeta) }
        eliminar.setOnClickListener { flipCard(eliminar,tar5) }
        tar5.setOnClickListener { flipCard(tar5, eliminar) }
        papelera.setOnClickListener { flipCard(papelera,tar6) }
        tar6.setOnClickListener { flipCard(tar6,papelera) }
        elemento.setOnClickListener { flipCard(elemento,tar7) }
        tar7.setOnClickListener { flipCard(tar7,elemento) }
        renom.setOnClickListener { flipCard(renom,tar8) }
        tar8.setOnClickListener { flipCard(tar8,renom) }
        barra.setOnClickListener { flipCard(barra,tar9) }
        tar9.setOnClickListener { flipCard(tar9,barra) }
        retroceder.setOnClickListener { flipCard(retroceder,tar10) }
        tar10.setOnClickListener { flipCard(tar10,retroceder) }
        avanzar.setOnClickListener { flipCard(avanzar,tar11) }
        tar11.setOnClickListener { flipCard(tar11,avanzar) }
        nivel.setOnClickListener { flipCard(nivel,tar12) }
        tar12.setOnClickListener { flipCard(tar12,nivel) }
        actualizar.setOnClickListener { flipCard(actualizar,tar13) }
        tar13.setOnClickListener { flipCard(tar13,actualizar) }
        mostrar.setOnClickListener { flipCard(mostrar,tar14) }
        tar14.setOnClickListener { flipCard(tar14,mostrar) }
        cerrar.setOnClickListener { flipCard(cerrar,tar15) }
        tar15.setOnClickListener { flipCard(tar15,cerrar) }

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