package com.example.wonders.quizFiles;


//we are not using this class anymore
//source: https://www.youtube.com/watch?v=JA9s_Fntg_4&t=1255s

public class Questions {

    //adding questions

    public String mQuestions[] ={
            "Which of these 7 New Wonders of the world is the oldest?",
            "Which of these 7 New Wonders of the world is the newest?",
            "Which of these 7 New Wonders of the world is located in Peru?",
            "Which of these 7 New Wonders of the world is located in India?",
            "Which of these 7 New Wonders of the world is located in Brazil?",
            "Which of these 7 New Wonders of the world is located in China?",
            "Which of these 7 New Wonders of the world is located in Mexico?",
            "Which of these 7 New Wonders of the world is located in Italy?",
            "Which of these 7 New Wonders of the world is located in Jordan?"
    };

    //adding options

    private String mChoices [][] ={
            {"Petra", "The Great Wall of China", "Machu Picchu", "Christ the Redeemer"},
            {"Taj Mahal", "Chichen Itza", "Machu Picchu", "Christ the Redeemer"},
            {"the Great Wall of China", "Machu Picchu", "Colosseum", "Petra"},
            {"Petra", "Taj Mahal", "Machu Picchu", "Christ the Redeemer"},
            {"Taj Mahal", "Chichen Itza", "Machu Picchu", "Christ the Redeemer"},
            {"Petra", "The Great Wall of China", "Machu Picchu", "Chinchen Itza"},
            {"Colosseum", "Chinchen Itza", "Machu Picchu", "Christ the Redeemer"},
            {"Petra", "The Great Wall of China", "Colosseum", "Taj Mahal"},
            {"Taj Mahal", "Chichen Itza", "Petra", "Christ the Redeemer"}

    };

    //answers

    private String mCorrectAnswers [] = {
            "Petra", "Christ the Redeemer", "Machu Picchu", "Taj Mahal", "Christ the Redeemer", "The Great Wall of China", "Chinchen Itza", "Colosseum", "Petra"
    };

    //methods

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










