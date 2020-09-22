package com.QuizApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mainfragment.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_mainfragment)

        val homeFragment = HomeFragment()
        val goalsFragment = GoalsFragment()
        val historyFragment = HistoryFragment()
        val playersFragment = PlayersFragment()
        val appFragment = AppFragment()

        makeCurrentFragment(homeFragment)

        button_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.Home-> makeCurrentFragment(homeFragment)
                R.id.goals -> makeCurrentFragment(goalsFragment)
                R.id.history -> makeCurrentFragment(historyFragment)
                R.id.app -> makeCurrentFragment(appFragment)
                R.id.players -> makeCurrentFragment(playersFragment)
            }
            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }




        // To hide the status bar.
       // window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

/*        *//*  act1.setOnClickListener {

            val intent = Intent(this@MainActivity, SecondConstraintSet::class.java)
            startActivity(intent)

*//*



        btn_start.setOnClickListener {

           // if (et_name.text.toString().isEmpty()) {

                // Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
                // .show()
           // } else {

                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)

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

                val intent = Intent(this@MainActivity, QuizQuestionsActivity2::class.java)
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

            val intent = Intent(this@MainActivity, QuizQuestionsActivity3::class.java)
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

            val intent = Intent(this@MainActivity, QuizQuestionsActivity4::class.java)
            // TODO (STEP 2: Pass the name through intent using the constant variable which we have created.)
            // START
            //intent.putExtra(Constants2.USER_NAME, et_name1.text.toString())
            // END
            startActivity(intent)
            //finish()

        }*/


    }



