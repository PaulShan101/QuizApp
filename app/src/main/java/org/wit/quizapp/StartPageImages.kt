package com.QuizApp

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class StartPageImages : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images_animation)


        val image = findViewById<ImageView>(R.id.animation_image)
        val overlay = findViewById<LinearLayout>(R.id.overlay_background)
        val Quiz_btn1 = findViewById<Button>(R.id.Quiz_btn1)

        Quiz_btn1.setOnClickListener {

            val intent = Intent(this@StartPageImages, MainActivity::class.java)
            startActivity(intent)
        }

        applyAnimation(image)
        applyAnimation(overlay)


    }


    fun applyAnimation(viewAnimation: View) {

        val overLay = viewAnimation.background as AnimationDrawable
        overLay.setEnterFadeDuration(3000)
        overLay.setExitFadeDuration(1000)
        overLay.start()


    }


}