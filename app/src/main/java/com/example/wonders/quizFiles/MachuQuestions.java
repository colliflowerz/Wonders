package com.example.wonders.quizFiles;

public class MachuQuestions {

    public String mQuestions[] ={
            "Which valley in Peru is Machu Picchu situated above?",
            "What is Machu Picchu often mistakenly referred to as?",
            "Which one of these is NOT one of the 3 primary structures of Machu Picchu?",
            "Machu Picchu is a:",
            "Which century was Machu Picchu built in?"

    };

    private String mChoices [][] ={
            {"Sacred Valley", "Mantaro Valley", "Old Valley", "Paraíba Valley"},
            {"Old Mountain of Alpacas", "Lost City of the Incas", "New Valley of Life", "Green Village of Light"},
            {"Intihuatana", "Temple of Sun", "Room of the Three Windows", "Quechua"},
            {"Citadel", "Valley", "Mountain Range", "Statue"},
            {"13th Century", "11th Century", "15th Century", "16th Century"}


    };

    private String mCorrectAnswers [] = {
            "Sacred Valley", "Lost City of the Incas", "Quechua", "Citadel", "15th Century"
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
