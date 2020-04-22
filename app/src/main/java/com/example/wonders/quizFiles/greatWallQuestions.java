package com.example.wonders.quizFiles;

public class greatWallQuestions {
    public String mQuestions[] ={
            "The Great Wall of China was built in order to:",
            "When did the Great Wall of China start being built?",
            "The most well-known sections of the wall were built in the:",
            "How long is the wall built by the Ming Dynasty",
            "What natural defensive barriers does the Great Wall of China?"

    };

    private String mChoices [][] ={
            {"Defeat the huns", "Protect and consolidate Chinese territories", "Create a path between China and Japan", "All of the above"},
            {"2nd Century BC", "5th Century BC", "6th Century BC", "7th Century BC"},
            {"Qing Dynasty", "Sing Dynasty", "Ming Dynasty", "Ting Dynasty"},
            {"8850km", "100km", "800m", "8850m"},
            {"Oceans and Mountains", "Hills and Rivers", "Desert", "Ocean"}


    };

    private String mCorrectAnswers [] = {
            "Protect and consolidate Chinese territories", "7th Century BC", "Ming Dynasty", "8850km", "Hills and Rivers"
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


