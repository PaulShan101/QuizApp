package com.QuizApp



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnticipateOvershootInterpolator
import kotlinx.android.synthetic.main.activity_premier1.*
import kotlinx.android.synthetic.main.activity_second_constraint_set.*
import kotlinx.android.synthetic.main.activity_second_constraint_set.button4

class SecondConstraintSet3 : AppCompatActivity() {

    companion object {
        private const val TAG = "ConstraintSetTwo3"
    }

    private var showBigImage = false

    private var rootLayout : ConstraintLayout? = null

    private val constraintSetNormal = ConstraintSet()

    private val constraintSetBig = ConstraintSet()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_constraint_set3)

        button4.setOnClickListener {

            val intent = Intent(this@SecondConstraintSet3, SecondConstraintSet4::class.java)
            startActivity(intent)
        }

        buttonback.setOnClickListener {

            val intent = Intent(this@SecondConstraintSet3, SecondConstraintSet2::class.java)
            startActivity(intent)
        }


        rootLayout = findViewById(R.id.second_constraint_set)

        constraintSetNormal.clone(rootLayout!!)

        constraintSetBig.load(this@SecondConstraintSet3, R.layout.activity_second_constraint_set_end)
    }


    fun toggledMode(view : View) {

        val transition = ChangeBounds()

        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 1200

        TransitionManager.beginDelayedTransition(rootLayout!!, transition)

        showBigImage = !showBigImage

        applyConfig()
    }



    private fun applyConfig(){
        if (showBigImage){
            Log.d(TAG,"big")
            constraintSetBig.applyTo(rootLayout!!)
        }else{
            Log.d(TAG,"small")
            constraintSetNormal.applyTo(rootLayout!!)

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
                val intent = Intent(this@SecondConstraintSet3, StartPage::class.java)
                startActivity(intent)
            }

            R.id.cl_1 -> {
                val intent = Intent(this@SecondConstraintSet3, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.pl_1 -> {
                val intent = Intent(this@SecondConstraintSet3, PremierLeagueSet1::class.java)
                startActivity(intent)
            }
            R.id.wc_1 -> {
                val intent = Intent(this@SecondConstraintSet3, MainWorldCup::class.java)
                startActivity(intent)
            }
            R.id.qz_1 -> {
                val intent = Intent(this@SecondConstraintSet3, MainQuizPage::class.java)
                startActivity(intent)
            }
            R.id.onq_1 -> {
                val intent = Intent(this@SecondConstraintSet3, OnlineQuiz::class.java)
                startActivity(intent)

            }

        }
        return super.onOptionsItemSelected(item)
    }
}
