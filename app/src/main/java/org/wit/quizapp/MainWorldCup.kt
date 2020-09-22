package com.QuizApp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_mainworldcup.*
import kotlinx.android.synthetic.main.activity_onlinequiz.*

class MainWorldCup : AppCompatActivity() {



        val language = arrayOf<String>(
            "URUGUAY 1930",
            "ITALY 1934",
            "FRANCE 1938",
            "BRAZIL 1950",
            "SWITZERLAND 1954",
            "SWEDEN 1958",
            "CHILE 1962",
            "ENGLAND 1966",
            "MEXICO 1970",
            "WEST GERMANY 1974",
            "ARGENTINA 1978",
            "SPAIN 1982",
            "MEXICO 1986",
            "ITALY 1990",
            "USA 1994",
            "FRANCE 1998",
            "KOREA JAPAN 2002",
            "GERMANY 2006",
            "SOUTH AFRICA 2010",
            "BRAZIL 2014",
            "RUSSIA 2018"

        )
        val description = arrayOf<String>(
            "WINNERS - URUGUAY",
            "WINNERS - ITALY",
            "WINNERS - ITALY",
            "WINNERS - URUGUAY",
            "WINNERS - WEST GERMANY",
            "WINNERS - BRAZIL",
            "WINNERS - BRAZIL",
            "WINNERS - ENGLAND",
            "WINNERS - BRAZIL",
            "WINNERS - WEST GERMANY",
            "WINNERS - ARGENTINA",
            "WINNERS - ITALY",
            "WINNERS - ARGENTINA",
            "WINNERS - WEST GERMANY",
            "WINNERS - BRAZIL",
            "WINNERS - FRANCE",
            "WINNERS - BRAZIL",
            "WINNERS - ITALY",
            "WINNERS - SPAIN",
            "WINNERS - GERMANY",
            "WINNERS - FRANCE"
        )

        val imageId = arrayOf<Int>(
            R.drawable.ur30, R.drawable.italy1934, R.drawable.france1938,
            R.drawable.brazil1950, R.drawable.swiss1954, R.drawable.sweden1958,
            R.drawable.chile1962, R.drawable.england1966, R.drawable.mexico1970,
            R.drawable.germany1974, R.drawable.argentina1978, R.drawable.spain1982,
            R.drawable.mexico1970,  R.drawable.italy1934, R.drawable.usa1994, R.drawable.france1938,
            R.drawable.worldcup1, R.drawable.germany1974, R.drawable.rsa2010,
            R.drawable.brazil1950, R.drawable.russia2018, R.drawable.ic_flag_of_kuwait
        )

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_mainworldcup)

            val myListAdapter = MyListAdapter(this, language, description, imageId)
            listView.adapter = myListAdapter

           listView.setOnItemClickListener() { adapterView, view, position, id ->
               // val itemAtPos = adapterView.getItemAtPosition(position)
               // val itemIdAtPos = adapterView.getItemIdAtPosition(position)
                //Toast.makeText(
                    //this,
                   // "Click on item at $itemAtPos its item id $itemIdAtPos",
                   // Toast.LENGTH_LONG


                    if(position == 0){
                        //val intent = Intent(this@MainWorldCup, MainQuizPage::class.java)
                       // startActivity(intent)
                        val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1930_FIFA_World_Cup"))
                        startActivity(i)

                    }
               if(position == 1){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1934_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 2){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1938_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 3){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1950_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 4){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1954_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 5){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1958_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 6){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1962_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 7){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1966_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 8){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1970_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 9){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1974_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 10){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1978_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 11){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1982_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 12){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1986_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 13){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1990_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 14){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1994_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 15){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/1998_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 16){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/2002_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 17){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/2006_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 18){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/2010_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 19){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/2014_FIFA_World_Cup"))
                   startActivity(i)

               }
               if(position == 20){
                   val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/2018_FIFA_World_Cup"))
                   startActivity(i)

               }

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
                val intent = Intent(this@MainWorldCup, StartPage::class.java)
                startActivity(intent)
            }
            R.id.cl_1 -> {
                val intent = Intent(this@MainWorldCup, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.pl_1 -> {
                val intent = Intent(this@MainWorldCup, PremierLeagueSet1::class.java)
                startActivity(intent)
            }
            R.id.wc_1 -> {
                val intent = Intent(this@MainWorldCup, MainWorldCup::class.java)
                startActivity(intent)
            }
            R.id.qz_1 -> {
                val intent = Intent(this@MainWorldCup, MainQuizPage::class.java)
                startActivity(intent)
            }
            R.id.onq_1 -> {
                val intent = Intent(this@MainWorldCup, OnlineQuiz::class.java)
                startActivity(intent)

            }

        }
        return super.onOptionsItemSelected(item)
    }


}
