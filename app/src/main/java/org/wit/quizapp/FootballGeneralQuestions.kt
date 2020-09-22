package com.QuizApp

object FootballGeneralQuestions {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    // END

    fun getQuestions4(): ArrayList<Question4> {
        val questionsList = ArrayList<Question4>()

        //Collections.shuffle(this.TOTAL_QUESTIONS);

        // 1
        val que1 = Question4(
            1, "Who was the first Foreign manager to win the FA Cup?",
             //R.drawable.ic_flag_of_argentina,
            "Gianluca Vialli", "Ruud Gullit",
            "Arsene Wenger", "Jose Mourhino", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question4(
            2, "Which of these Players was not sent off in an FA Cup final?",
              //R.drawable.ic_flag_of_australia,
            "Chris Smalling", "John Terry",
            "Victor Moses", "Jose Antonio Reyes", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question4(
            3, "Which of these Argetinian players have played for 4 or more Premier league teams?",
             //R.drawable.ic_flag_of_brazil,
            "Carlos Tevez", "Leonardo Ulloa",
            "Freddy Di Santo", "Mauro Zarate", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question4(
            4, "What country was supposed to host the 1986 World Cup?",
            //R.drawable.ic_flag_of_belgium,
            "Colombia", "Chile",
            "Argentina", "Uruguay", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question4(
            5, "Which of these players for Jamacia has the most Premier league goals?",
            //R.drawable.ic_flag_of_fiji,
            "Robbie Earle", "Marcus Gayle",
            "Jason Euell", "Ricardo Fuller", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question4(
            6, "Which of these Austrailians have won Premier League player of the month award",
            // R.drawable.ic_flag_of_germany,
            "Tim Cahill", "Mark Schwarzer",
            "Harry Kewell", "Mark Bosnich", 2
        )

        questionsList.add(que6)

        // 7
        val que7 = Question4(
            7, "Who was the only manager to win the World Cup twice?",
           // R.drawable.ic_flag_of_denmark,
            "Mario Zagallo", "Helmut Schön",
            "Vittorio Pozzo", "Juan López Fontana", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question4(
            8, "What club was Salvatore Schillaci with when he won the golden boot in 1990 World Cup?",
           // R.drawable.ic_flag_of_india,
            "Inter Milan", "AC Milan",
            "Lazio", "Juventus", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question4(
            9, "Which of these Players named Mark has NOT scored a Premier League Hat trick?",

            "Mark Robbins", "Mark Hughes",
            "Mark Overmars", "Mark Viduka", 3
        )

        questionsList.add(que9)

        // 10
        val que10 = Question4(
            10, "Who was the first English Manager to win the Manager of the Month award?",
          //  R.drawable.ic_flag_of_kuwait,
            "Trevor Francis", "Kevin Keegan",
            "Joe Royle", "Frank Clark", 2
        )

        questionsList.add(que10)

   


        return questionsList
    }
}