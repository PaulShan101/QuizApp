package com.QuizApp
//Author Paul Shanahan
//21/09/2020
//Version 1.0
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random


object ChampionsLeagueQuestions {

    //CHAMPIONS LEAGUE QUESTIONS
    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    //const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()


        //Collections.shuffle(this.TOTAL_QUESTIONS);

        // 1
        val que1 = Question(
            1, "Which Italian club has won the most Champions Leagues?",

            "Juventus", "Ac Milan",
            "Inter Milan", "Sampadoria", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which Manager has lost 3 Champions league finals?",

            "Carlo Ancelotti", "Alex Ferguson",
            "Marcelo Lippi", "Hector Cuper", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Who is the oldest player to score in the Champions league?",

            "Ryan Giggs", "Francesco Totti",
            "Paul Scholes", "Klass Van Huntelar", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What player has recieved the most Yellow cards in Champions League history?",

            "Sergio Ramos", "Sergio Busquets",
            "Clarence Seedorf", "Paul Scholes", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Who was the 1st English Player to score in a Champions League Final?",

            "Steve Macmanaman", "Teddy Sheringham",
            "Sol Campbell", "Frank Lampard", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which Player has lost the most Champions league finals?",

            "Gary Neville", "Zinedine Zidane",
            "Patrice Evra", "John Carew", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Who was the only Goalkeeper to be sent off in a final?",

            "Gigi Buffon", "Edwin Van de Sar",
            "Iker Casilas", "Jens Lehmann", 4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "1st player to make 100 champions League appearances?",

            "allesandro Del Piero", "Xavi",
            "Raul", "Iker Casilas", 3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Which team has lost the most finals?",

            "Ac Milan", "Bayern Munich",
            "Manchester United", "Juventus", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Which Player has played for 7 clubs in the Champions league?",

            "Hernan Crespo", "Clarence Seedorf",
            "Zlatan Ibrahimovic", "Fillipo Inzaghi", 3
        )

        questionsList.add(que10)

        val que11 = Question(
            11, "Juventus and what other team have lost 2 consectitive finals?",

            "Manchester United", "Valencia",
            "Bayern Munich", "Inter Milan", 2
        )

        questionsList.add(que11)

        val que12 = Question(
            12, "Only Player to reach a Champions League Quarter Final with 4 different clubs",

            "Clarence Seedorf", "Zlatan Ibrahimovic",
            "Michael Ballack", "Samuel Eto'o", 3
        )


        questionsList.add(que12)

        val que13 = Question(
            13, "Which Spanish Player has the most Champions League Hat tricks?",

            "Roberto Soldado", "Raul",
            "David Villa", "Fernando Morientes", 1
        )

        questionsList.add(que13)

        val que14 = Question(
            14, "Only Uruguyan to Score a Champions league Hat trick?",

            "Luis Suarez", "Diego Forlan",
            "Gus Poyet", "Walter Pandiani", 4
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "Where was the 2008 final between Man Utd and Chelsea held?",

            "Moscow", "Milan",
            "Barcelona", "Vienna", 1
        )

        questionsList.add(que15)

        return questionsList

    }
}