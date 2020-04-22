package com.example.wonders.quizFiles;

public class ChichenQuestions {

    public String mQuestions[] ={
            "Which state of Mexico is Chichen Itza located in?",
            "In which period was Chichen Itza NOT a major focal point in the Northern Maya Lowlands?",
            "In which literature is Chichen Itza likely to have been referred to as one of the mythical great cities?",
            "What is Chichen Itza?",
            "What culture built the Chinchen Itza"

    };

    private String mChoices [][] ={
            {"Campeche", "Yucatan", "Tabasco", "Quintana Roo\n"},
            {"Late Classic (AD 600 - 900)", "Terminal Classic (AD 800 - 900)", "Post Classic (AD 900 - 1200)", "Colonial (1521–1821)"},
            {"Mesoamerican literature", "Aztec literature", "Romantic literature", "Modernist literature"},
            {"A tower", "An archaeological site", "An amphitheatre", "A statue"},
            {"Mayan Civilisation", "Incan Civilisation", "Indo-European Civilisation", "Anglo-Saxon Civilisation"}


    };

    private String mCorrectAnswers [] = {
            "Yucatan", "Colonial (1521–1821)", "Mesoamerican literature", "An archaeological site", "Mayan Civilisations"
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
