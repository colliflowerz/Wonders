package com.example.wonders.quizFiles;

public class ColosseumQuestions {
    public String mQuestions[] ={
            "The Colosseum is also known as:",
            "How many specatators can the Colosseum hold?",
            "Under which emperor did the Colosseum start construction?",
            "When was the Colosseum completed?",
            "Which European Euro coin has the Colosseum depicted on it?"

    };

    private String mChoices [][] ={
            {"Flastica Emprioma", "Romica Atrium", "Flavian Ampitheatre", "Globe Theatre"},
            {"10000", "30000", "40000", "80000"},
            {"Caesar", "Vespasian", "Augustus", "Nero"},
            {"AD 80", "9th Century BC", "AD 20", "3rd Century BC"},
            {"Quater", "5 Cents", "10 Cents", "1 Euro"}


    };

    private String mCorrectAnswers [] = {
            "Flavian Ampitheatre", "80000", "Vespasian", "AD 80", "5 Cents"
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
