package com.QuizApp

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import kotlinx.android.synthetic.main.activitystart_main.*


class StartPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitystart_main)

        val Quiz_btn2 = findViewById<Button>(R.id.Quiz_btn2)
        val WorldCup = findViewById<Button>(R.id.WorldCup)



        Quiz_btn2.setOnClickListener {

            val intent = Intent(this@StartPage, MainActivity::class.java)
            startActivity(intent)
        }

        WorldCup.setOnClickListener {

            val intent = Intent(this@StartPage, MainWorldCup::class.java)
            startActivity(intent)
        }

        premierleague.setOnClickListener {

            val intent = Intent(this@StartPage, PremierLeagueSet1::class.java)
            startActivity(intent)
        }

        championsleague.setOnClickListener {

            val intent = Intent(this@StartPage, MainQuizPage::class.java)
            startActivity(intent)
        }

        onlinequiz.setOnClickListener {

            val intent = Intent(this@StartPage, OnlineQuiz::class.java)
            startActivity(intent)
        }



        var animation = imageView.background as AnimationDrawable?
        animation?.setEnterFadeDuration(3000)
        animation?.setExitFadeDuration(1000)
        animation?.start()

        var layoutAniamtion = overlay_layout.background as AnimationDrawable
        layoutAniamtion.setExitFadeDuration(3000)
        layoutAniamtion.setExitFadeDuration(1000)
        layoutAniamtion.start()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main, menu)
       return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.cl_1 -> {
                val intent = Intent(this@StartPage, MainQuizPage::class.java)
                startActivity(intent)
            }
            R.id.pl_1 -> {
                val intent = Intent(this@StartPage, PremierLeagueSet1::class.java)
                startActivity(intent)
            }
            R.id.wc_1 -> {
                val intent = Intent(this@StartPage, SecondConstraintSet::class.java)
                startActivity(intent)
            }
            R.id.qz_1 -> {
                val intent = Intent(this@StartPage, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.onq_1 -> {
                val intent = Intent(this@StartPage, OnlineQuiz::class.java)
                startActivity(intent)

            }

        }
        return super.onOptionsItemSelected(item)
    }
}
