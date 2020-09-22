package com.QuizApp


import com.QuizApp.Question2
import com.QuizApp.R

object PremierLeagueQuestions {

  //PREMIER LEAGUE QUESTIONS
    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions3(): ArrayList<Question3> {
        val questionsList = ArrayList<Question3>()

        // 1
        val que1 = Question3(
            1, "Who is the Premier League's most expensive player?",
           // R.drawable.ic_flag_of_germany,
            "Virgil Van Dyk", "Paul Pogba",
            "Kai Havertz", "Kepa", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question3(
            2, "Which Austrailian has Score the Most Premier League goals?",
           // R.drawable.ic_flag_of_argentina,
            "Mark Viduka", "Tim Cahill",
            "Harry Kewell", "John Aloisi", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question3(
            3, "Lee Bowyer was sent off for fighting with which of his team mates?",
          //  R.drawable.ic_flag_of_argentina,
            "Danny Mills", "Johnathon Woodgate",
            "Kieron Dyer", "Alan Smith", 3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question3(
            4, "Who is the oldest player to score in the Premier league?",
          //  R.drawable.ic_flag_of_argentina,
            "Ryan Giggs", "Paul Scholes",
            "David Weir", "Teddy Sheringham", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question3(
            5, "Who did Dennis Bergcamp sign from to go to Arsenal?",
           // R.drawable.ic_flag_of_argentina,
            "Ac milan", "Inter",
            "PSV", "Ajax", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question3(
            6, "How many clubs did Gary Speed play for in the Premier league?",
          //  R.drawable.ic_flag_of_argentina,
            "3", "4",
            "5", "6", 2
        )

        questionsList.add(que6)

        // 7
        val que7 = Question3(
            7, "Who has the most own goal out of these players?",
          //  R.drawable.ic_flag_of_argentina,
            "Titus Bramble", "Michael Duberry",
            "Steve Watson", "Frank Sinclair", 4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question3(
            8, "What Squad Number did Dwight Yorke wear for Man Utd?",
         //   R.drawable.ic_flag_of_argentina,
            "9", "19",
            "21", "10", 2
        )

        questionsList.add(que8)

        // 9
        val que9 = Question3(
            9, "Which of these clubs did Damien Duff make the most Premier League appearances for?",
         //   R.drawable.ic_flag_of_argentina,
            "Fulham", "Chelsea",
            "Newcastle", "Leicester", 1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question3(
            10, "Who was the First non European player to make over 500 Premier league appearances?",
         //   R.drawable.ic_flag_of_argentina,
            "Tim Howard", "Brad Friedel",
            "Mark Schwarzer", "Kasey Keller", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}
