package com.QuizApp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_onlinequiz.*

class OnlineQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_onlinequiz)

        cl_online.setOnClickListener {
            val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flexiquiz.com/SC/N/ChampionsLeague"))
            startActivity(i)
        }

        pl_online.setOnClickListener {
            val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flexiquiz.com/SC/N/PremierLeague"))
            startActivity(i)
        }
        pl_online.setOnClickListener {
            val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flexiquiz.com/SC/N/Fifaworldcup"))
            startActivity(i)
        }
        fp_online.setOnClickListener {
            val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flexiquiz.com/SC/N/PLforeignPlayers"))
            startActivity(i)
        }
        ss_online.setOnClickListener {
            val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flexiquiz.com/SC/N/ShirtSponsors"))
            startActivity(i)
        }
        sn_online.setOnClickListener {
            val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flexiquiz.com/SC/N/SquadNumbers"))
            startActivity(i)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.home_1 -> {
                val intent = Intent(this@OnlineQuiz, StartPage::class.java)
                startActivity(intent)
            }

            R.id.cl_1 -> {
                val intent = Intent(this@OnlineQuiz, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.pl_1 -> {
                val intent = Intent(this@OnlineQuiz, PremierLeagueSet1::class.java)
                startActivity(intent)
            }
            R.id.wc_1 -> {
                val intent = Intent(this@OnlineQuiz, MainWorldCup::class.java)
                startActivity(intent)
            }
            R.id.qz_1 -> {
                val intent = Intent(this@OnlineQuiz, MainQuizPage::class.java)
                startActivity(intent)
            }
            R.id.onq_1 -> {
                val intent = Intent(this@OnlineQuiz, OnlineQuiz::class.java)
                startActivity(intent)

            }

        }
        return super.onOptionsItemSelected(item)
    }



}



