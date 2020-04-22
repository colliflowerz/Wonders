package com.example.wonders.quizFiles;

public class TajMahalQuestions {

    public String mQuestions[] ={
            "What colour is the Taj Mahal?",
            "Which bank of the Yamuna river in India is the Taj Mahal located?",
            "When was the Taj Mahal essentially completed?",
            "How many artiseans were employed for the construction project of Taj Mahal?",
            "How big is the complex that the Taj Mahal is located in?"

    };

    private String mChoices [][] ={
            {"Yellow-green", "Ivory-white", "Blue-orange", "Pink-yellow"},
            {"North", "East", "South", "West"},
            {"1643", "2nd Century BC", "1998", "1001"},
            {"1", "2000", "20000", "543"},
            {"1 Hectares", "17 Hectares", "3 Hectares", "89 Hectares"}


    };

    private String mCorrectAnswers [] = {
            "Ivory-white", "South", "1643", "20000", "17 Hectares"
    };

    public String getQuestion (int a){
        String question = mQuestions [a];
        return question;
    }

    public String getChoice1 (int a){
        String choice = mChoices [a] [0];
        return choice;
    }

    public String getChoice2 (int a){
        String choice = mChoices [a] [1];
        return choice;
    }

    public String getChoice3 (int a){
        String choice = mChoices [a] [2];
        return choice;
    }

    public String getChoice4 (int a){
        String choice = mChoices [a] [3];
        return choice;
    }

    public String getCorrectAnswer (int a){
        String correctAnswer = mCorrectAnswers[a];
        return correctAnswer;
    }

}
