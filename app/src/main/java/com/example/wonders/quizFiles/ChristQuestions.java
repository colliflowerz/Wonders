package com.example.wonders.quizFiles;

public class ChristQuestions {

    public String mQuestions[] ={
            "When was Christ the Redeemer constructed?",
            "What does Christ the Redeemer symbolise across the world?",
            "What mountain in Rio de Janeiro is Christ the Redeemer located at the peak of?",
            "Which French sculptor created Christ the Redeemer?",
            "How high is Christ the Redeemer (excluding its pedestal)?"

    };

    private String mChoices [][] ={
            {"Between 1899 and 1909", "Between 1911 and 1919", "Between 1922 and 1931", "Between 1935 and 1943"},
            {"Rebirth", "Strength", "Freedom", "Christianity"},
            {"Corcovado", "Sugarloaf", "Pedra Bonita", "Pedra da Gávea"},
            {"Auguste Rodin", "Paul Landowski", "Jean Antoine Houdon", "Heitor da Silva Costa"},
            {"30m", "11m", "26m", "50m"}


    };

    private String mCorrectAnswers [] = {
            "Between 1922 and 1931", "Christianity", "Corcovado", "Paul Landowski", "30m"
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
