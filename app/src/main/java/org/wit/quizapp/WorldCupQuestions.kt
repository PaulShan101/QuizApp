package com.QuizApp


import com.QuizApp.Question2
import com.QuizApp.R

object WorldCupQuestions {

   //WORLD CUP QUESTIONS
    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions2(): ArrayList<Question2> {
        val questionsList2 = ArrayList<Question2>()

        // 1
        val que1 = Question2(
            1, "Which Country has finished Runners up the most times?",
            //R.drawable.ic_flag_of_argentina,
            "Argentina", "Germany",
            "Brazil", "Italy", 2
        )

        questionsList2.add(que1)

        // 2
        val que2 = Question2(
            2, "England and which other nation have a 100% record in a World Cup final?",
            //R.drawable.ic_flag_of_argentina,
            "Spain", "Italy",
            "Germany", "Argentina", 1
        )

        questionsList2.add(que2)

        // 3
        val que3 = Question2(
            3, "Where was the 1962 World cup Held?",
            //R.drawable.ic_flag_of_argentina,
            "Uruguay", "Brazil",
            "Chile", "Mexico", 3
        )

        questionsList2.add(que3)

        // 4
        val que4 = Question2(
            4, "Who is the all Time Top scorer for Spain at the World Cup?",
           // R.drawable.ic_flag_of_argentina,
            "Raul", "David Villa",
            "Fernando Torres", "Pedro", 2
        )

        questionsList2.add(que4)

        // 5
        val que5 = Question2(
            5, "Who was England manager at the 1998 World Cup?",
           // R.drawable.ic_flag_of_argentina,
            "Terry Venebals", "Graham Taylor",
            "Kevin Keegan", "Glenn Hoddle", 4
        )

        questionsList2.add(que5)

        // 6
        val que6 = Question2(
            6, "Who was in Goal For Italy in the 94 World Cup",
          //  R.drawable.ic_flag_of_argentina,
            "Gianluca Pagliuca", "Walter Zenga",
            "Angelo Peruzzi", "Gigi Buffon", 1
        )

        questionsList2.add(que6)

        // 7
        val que7 = Question2(
            7, "Oleg Salenko Scored 5 goals in a World cup Game for Which Nation?",
           // R.drawable.ic_flag_of_argentina,
            "Russia", "Ukraine",
            "Bulgaria", "Serbia", 1
        )

        questionsList2.add(que7)

        // 8
        val que8 = Question2(
            8, "Which Country has  lost the most World Cup Knock-out games?",
           // R.drawable.ic_flag_of_argentina,
            "France", "Mexico",
            "Germany", "Spain", 2
        )

        questionsList2.add(que8)

        // 9
        val que9 = Question2(
            9, "How many World Cups have been won by the host nation?",
           // R.drawable.ic_flag_of_argentina,
            "4", "5",
            "6", "7", 3
        )

        questionsList2.add(que9)

        // 10
        val que10 = Question2(
            10, "Where Was the 1982 World Cup Held?",
           // R.drawable.ic_flag_of_argentina,
            "Italy", "Mexico",
            "Spain", "Brazil", 3
        )

        questionsList2.add(que10)

        val que11 = Question2(
            11, "Who Scored the first Golden goal in the World Cup?",
           // R.drawable.holland98,
            "Zinedine Zidane", "Laurent Blanc",
            "Emmanuel Petit", "Youri Djorkaeff", 2
        )

        questionsList2.add(que11)

        val que12 = Question2(
            12, "Which of these Cities DID NOT host a World Cup final?",
           // R.drawable.holland98,
            "Pasadena", "Rio",
            "Beijing", "Johanesburg", 3
        )

        questionsList2.add(que12)

        val que13 = Question2(
            13, "What team Knocked out co-hosts Japan in 2002?",
           // R.drawable.holland98,
            "Sweden", "Turkey",
            "Italy", "Belgium", 2
        )

        questionsList2.add(que13)

        val que14 = Question2(
            14, "Who Scored an Own goal in the 2018 World Cup final?",
          //  R.drawable.holland98,
            "Dejan Lovern", "Mario Mandžukić",
            "Domagoj Vida", "Mateo Kovačić", 2
        )

        questionsList2.add(que14)

        val que15 = Question2(
            15, "Who was the only host nation not to qualify into the 2nd round?",
           // R.drawable.holland98,
            "Sweden", "Chile",
            "South Africa", "Usa", 3
        )

        questionsList2.add(que15)


        return questionsList2
    }
}