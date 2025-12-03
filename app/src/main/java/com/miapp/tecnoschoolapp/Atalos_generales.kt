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

class Atalos_generales : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atalos_generales)

        val btnRegresar: Button = findViewById(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            startActivity(Intent(this, Windows11Activity::class.java))
        }
        val videoView = findViewById<VideoView>(R.id.videoView)

        val videoUrl = ""
        val uri = Uri.parse(videoUrl)

        videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.setOnPreparedListener {
            videoView.start()
        }



        val tarjeta = findViewById<LinearLayout>(R.id.tarjeta_card)
        val tar1 = findViewById<LinearLayout>(R.id.tar1_card)
        val pegar = findViewById<LinearLayout>(R.id.pegar)
        val tar2 = findViewById<LinearLayout>(R.id.tar2_card)
        val Cortar = findViewById<LinearLayout>(R.id.Cortar)
        val tar3 = findViewById<LinearLayout>(R.id.tar3_card)
        val Seleccionar = findViewById<LinearLayout>(R.id.Seleccionar)
        val tar4 = findViewById<LinearLayout>(R.id.tar4_card)
        val deshacer = findViewById<LinearLayout>(R.id.deshacer)
        val tar5 = findViewById<LinearLayout>(R.id.tar5_card)
        val rehacer = findViewById<LinearLayout>(R.id.rehacer)
        val tar6 = findViewById<LinearLayout>(R.id.tar6_card)
        val buscar = findViewById<LinearLayout>(R.id.buscar)
        val tar7 = findViewById<LinearLayout>(R.id.tar7_card)
        val imprmir = findViewById<LinearLayout>(R.id.imprimir)
        val tar8 = findViewById<LinearLayout>(R.id.tar8_card)
        val guardar = findViewById<LinearLayout>(R.id.guardar)
        val tar10 = findViewById<LinearLayout>(R.id.tar10_card)
        val cerrar = findViewById<LinearLayout>(R.id.cerrar)
        val tar11 = findViewById<LinearLayout>(R.id.tar11_card)


        tarjeta.setOnClickListener { flipCard(tarjeta, tar1) }
        tar1.setOnClickListener { flipCard(tar1, tarjeta) }
        pegar.setOnClickListener { flipCard(pegar, tar2) }
        tar2.setOnClickListener { flipCard(tar2, pegar) }
        Cortar.setOnClickListener { flipCard(Cortar, tar3) }
        tar3.setOnClickListener { flipCard(tar3, Cortar) }
        Seleccionar.setOnClickListener { flipCard(Seleccionar, tar4) }
        tar4.setOnClickListener { flipCard(tar4, Seleccionar) }
        deshacer.setOnClickListener { flipCard(deshacer, tar5) }
        tar5.setOnClickListener { flipCard(tar5, deshacer) }
        rehacer.setOnClickListener { flipCard(rehacer, tar6) }
        tar6.setOnClickListener { flipCard(tar6, rehacer) }
        buscar.setOnClickListener { flipCard(buscar, tar7) }
        tar7.setOnClickListener { flipCard(tar7, buscar)}
        imprmir.setOnClickListener { flipCard(imprmir, tar8) }
        tar8.setOnClickListener { flipCard(tar8, imprmir) }
        guardar.setOnClickListener { flipCard(guardar, tar10) }
        tar10.setOnClickListener { flipCard(tar10, guardar) }
        cerrar.setOnClickListener { flipCard(cerrar, tar11) }
        tar11.setOnClickListener { flipCard(tar11, cerrar) }


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
