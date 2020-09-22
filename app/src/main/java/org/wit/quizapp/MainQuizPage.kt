package com.QuizApp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainQuizPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // To hide the status bar.
        // window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        /*    act1.setOnClickListener {

            val intent = Intent(this@MainActivity, SecondConstraintSet::class.java)
            startActivity(intent)*/





        btn_start.setOnClickListener {

            // if (et_name.text.toString().isEmpty()) {

            // Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
            // .show()
            // } else {

            val intent = Intent(this@MainQuizPage, QuizQuestionsActivity::class.java)

            // START
            //intent.putExtra(Constants.USER_NAME, et_name.text.toString())
            // END
            startActivity(intent)
            //finish()

        }




        btn_start1.setOnClickListener {

            //if (et_name1.text.toString().isEmpty()) {

            //Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
            //.show()
            // } else {

            val intent = Intent(this@MainQuizPage, QuizQuestionsActivity2::class.java)
            // TODO (STEP 2: Pass the name through intent using the constant variable which we have created.)
            // START
            //intent.putExtra(Constants2.USER_NAME, et_name1.text.toString())
            // END
            startActivity(intent)
            //finish()

        }
        btn_start3.setOnClickListener {

            //if (et_name1.text.toString().isEmpty()) {

            //Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
            //.show()
            // } else {

            val intent = Intent(this@MainQuizPage, QuizQuestionsActivity3::class.java)
            // TODO (STEP 2: Pass the name through intent using the constant variable which we have created.)
            // START
            //intent.putExtra(Constants2.USER_NAME, et_name1.text.toString())
            // END
            startActivity(intent)
            //finish()

        }
        btn_start4.setOnClickListener {

            //if (et_name1.text.toString().isEmpty()) {

            //Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
            //.show()
            // } else {

            val intent = Intent(this@MainQuizPage, QuizQuestionsActivity4::class.java)
            // TODO (STEP 2: Pass the name through intent using the constant variable which we have created.)
            // START
            //intent.putExtra(Constants2.USER_NAME, et_name1.text.toString())
            // END
            startActivity(intent)
            //finish()

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
                val intent = Intent(this@MainQuizPage, StartPage::class.java)
                startActivity(intent)
            }

            R.id.cl_1 -> {
                val intent = Intent(this@MainQuizPage, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.pl_1 -> {
                val intent = Intent(this@MainQuizPage, PremierLeagueSet1::class.java)
                startActivity(intent)
            }
            R.id.wc_1 -> {
                val intent = Intent(this@MainQuizPage, MainWorldCup::class.java)
                startActivity(intent)
            }
            R.id.qz_1 -> {
                val intent = Intent(this@MainQuizPage, MainQuizPage::class.java)
                startActivity(intent)
            }
            R.id.onq_1 -> {
                val intent = Intent(this@MainQuizPage, OnlineQuiz::class.java)
                startActivity(intent)

            }

        }
        return super.onOptionsItemSelected(item)
    }


}