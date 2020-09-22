package com.QuizApp


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result3)

        // TODO (STEP 6: Hide the status bar and get the details from intent and set it to the UI. And also add a click event to the finish button.)
        // START
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //val userName = intent.getStringExtra(ChampionsLeagueQuestions.USER_NAME)
       // tv_name.text = userName

        val totalQuestions = intent.getIntExtra(ChampionsLeagueQuestions.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(ChampionsLeagueQuestions.CORRECT_ANSWERS, 0)

        if(correctAnswers >= 7){
            pass.text = "EXCELLENT"
            // tv_congratulations
            // iv_trophy
        }else
        {
            pass.text = "TRY AGAIN"
        }


        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."

        btn_finish.setOnClickListener {
            startActivity(Intent(this@ResultActivity3, StartPage::class.java))
        }
        // END
    }
}
