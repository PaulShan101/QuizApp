package com.QuizApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class StartPageView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_views_animation)

        val scaleBTN = findViewById<Button>(R.id.start_scale)
        val fadeBTN = findViewById<Button>(R.id.fade_btn)
        val imageView = findViewById<ImageView>(R.id.scale_image)
        val Quiz_btn = findViewById<Button>(R.id.Quiz_btn1)

        Quiz_btn.setOnClickListener {

            val intent = Intent(this@StartPageView, MainActivity::class.java)
            startActivity(intent)
        }

        scaleBTN.setOnClickListener {
            val aniamtion = AnimationUtils.loadAnimation(this , R.anim.scale)
            imageView.startAnimation(aniamtion)
        }


        fadeBTN.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this,R.anim.fade)
            imageView.startAnimation(animation)
        }
    }
}