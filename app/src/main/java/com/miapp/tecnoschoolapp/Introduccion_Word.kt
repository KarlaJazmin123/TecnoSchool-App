package com.miapp.tecnoschoolapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import android.widget.Button
import android.animation.ObjectAnimator
import androidx.core.animation.addListener
import android.util.Log
import android.net.Uri
import android.webkit.WebChromeClient
import android.webkit.WebView




class Introduccion_Word : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_introduccion_word)

        val webView: WebView = findViewById(R.id.video)

        val video="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zoKGc6zFMpE?si=SLCgY0IUedOw_1kU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"

        webView.loadData(video, "text/html", "utf-8")

        webView.settings.javaScriptEnabled= true

        webView.webChromeClient= WebChromeClient()

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            val intent = Intent(this, Menu_Word::class.java)
            startActivity(intent)
            finish()
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
}