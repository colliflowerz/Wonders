package com.example.wonders.quizFiles;

public class PetraQuestions {
    public String mQuestions[] ={
            "What is Petra originally known as to its inhabitants?",
            "When was the area around Petra inhabited?",
            "Why was the location of Petra ideal for nomadic Arabs?",
            "Where is Petra located?",
            "What was Petra’s highest population in 1st century AD?"

    };

    private String mChoices [][] ={
            {"Raqmu", "Khazneh", "Ma’an", "Damascus"},
            {"3000BC", "4000BC", "6000BC", "7000BC"},
            {"Proximity to water sources", "Proximity to trade routes", "Proximity to major cities", "Proximity to fertile soil"},
            {"Northern Jordan", "Southern Jordan", "Western Jordan", " Eastern Jordan"},
            {"20000", "30000", "40000", "50000"}


    };

    private String mCorrectAnswers [] = {
            "Raqmu", "7000BC", "Proximity to trade routes", "Southern Jordan", "20000"
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
