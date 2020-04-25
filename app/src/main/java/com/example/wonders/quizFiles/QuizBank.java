package com.example.wonders.quizFiles;

import java.util.ArrayList;

public class QuizBank {

    //Wonders
    public static String[] wonders ={
            "The Great Wall of China",
            "Chichen Itza",
            "Colosseum",
            "Taj Mahal",
            "Machu Picchu",
            "Christ the Redeemer",
            "Petra"
    };

    //Actual questions
    public static ArrayList<String> getQuestions(String wonders) {
        ArrayList<String> questionList = new ArrayList<>();
        switch (wonders) {
            case "The Great Wall of China":
                questionList.add("The Great Wall of China was built in order to:");
                questionList.add("When did the Great Wall of China start being built?");
                questionList.add("The most well-known sections of the wall were built in the:");
                questionList.add("How long is the wall built by the Ming Dynasty");
                questionList.add("What natural defensive barriers does the Great Wall of China have?");
                break;

            case "Chichen Itza":
                questionList.add("Which state of Mexico is Chichen Itza located in?");
                questionList.add("In which period was Chichen Itza NOT a major focal point in the Northern Maya Lowlands?");
                questionList.add("In which literature is Chichen Itza likely to have been referred to as one of the mythical great cities?");
                questionList.add("What is Chichen Itza?");
                questionList.add("What culture built the Chinchen Itza");
                break;

            case "Colosseum":
                questionList.add("The Colosseum is also known as:");
                questionList.add("How many specatators can the Colosseum hold?");
                questionList.add("Under which emperor did the Colosseum start construction?");
                questionList.add("When was the Colosseum completed?");
                questionList.add("Which European Euro coin has the Colosseum depicted on it?");
                break;

            case "Taj Mahal":
                questionList.add("What colour is the Taj Mahal?");
                questionList.add("Which bank of the Yamuna river in India is the Taj Mahal located?");
                questionList.add("When was the Taj Mahal essentially completed?");
                questionList.add("How many artiseans were employed for the construction project of Taj Mahal?");
                questionList.add("How big is the complex that the Taj Mahal is located in?");
                break;

            case "Mach Picchu":
                questionList.add("Which valley in Peru is Machu Picchu situated above?");
                questionList.add("What is Machu Picchu often mistakenly referred to as?");
                questionList.add("Which one of these is NOT one of the 3 primary structures of Machu Picchu?");
                questionList.add("Machu Picchu is a:");
                questionList.add("Which century was Machu Picchu built in?");
                break;

            case "Christ the Redeemer":
                questionList.add("When was Christ the Redeemer constructed?");
                questionList.add("What does Christ the Redeemer symbolise across the world?");
                questionList.add("What mountain in Rio de Janeiro is Christ the Redeemer located at the peak of?");
                questionList.add("Which French sculptor created Christ the Redeemer?");
                questionList.add("How high is Christ the Redeemer (excluding its pedestal)?");
                break;

            case "Petra":
                questionList.add("What is Petra originally known as to its inhabitants?");
                questionList.add("When was the area around Petra inhabited?");
                questionList.add("Why was the location of Petra ideal for nomadic Arabs?");
                questionList.add("Where is Petra located?");
                questionList.add("What was Petra’s highest population in 1st century AD?");
                break;
        }

        return questionList;

    }

        //questions, options, answers

        public static ArrayList<QuizOptions> getOptions(String wonders) {
            ArrayList<QuizOptions> options = new ArrayList<>();

            //switch by wonders

            switch (wonders) {
                case "The Great Wall of China":
                   QuizOptions chinaQ1;
                   QuizOptions chinaQ2;
                   QuizOptions chinaQ3;
                   QuizOptions chinaQ4;
                   QuizOptions chinaQ5;

                   //adding questions, options and answers to arraylist

                    options.add(chinaQ1 = new QuizOptions("The Great Wall of China was built in order to:", "Defeat the huns", "Protect and consolidate Chinese territories", "Create a path between China and Japan", "All of the above", 2));
                    options.add(chinaQ2 = new QuizOptions("When did the Great Wall of China start being built?", "2nd Century BC", "5th Century BC", "6th Century BC", "7th Century BC",4));
                    options.add(chinaQ3 = new QuizOptions("The most well-known sections of the wall were built in the:", "Qing Dynasty", "Sing Dynasty", "Ming Dynasty", "Ting Dynasty", 3));
                    options.add(chinaQ4= new QuizOptions("How long is the wall built by the Ming Dynasty", "8850km", "100km", "800m", "8850m",1));
                    options.add(chinaQ5= new QuizOptions("What natural defensive barriers does the Great Wall of China have?", "Oceans and Mountains", "Hills and Rivers", "Desert", "Ocean", 2));
                    break;

                case "Chichen Itza":
                    QuizOptions chichenQ1;
                    QuizOptions chichenQ2;
                    QuizOptions chichenQ3;
                    QuizOptions chichenQ4;
                    QuizOptions chichenQ5;

                    options.add(chichenQ1=new QuizOptions("Which state of Mexico is Chichen Itza located in?", "Campeche", "Yucatan", "Tabasco", "Quintana Roo",2));
                    options.add(chichenQ2 = new QuizOptions("In which period was Chichen Itza NOT a major focal point in the Northern Maya Lowlands?", "Late Classic (AD 600 - 900)", "Terminal Classic (AD 800 - 900)", "Post Classic (AD 900 - 1200)", "Colonial (1521–1821)",4));
                    options.add(chichenQ3 = new QuizOptions("In which literature is Chichen Itza likely to have been referred to as one of the mythical great cities?", "Mesoamerican literature", "Aztec literature", "Romantic literature", "Modernist literature",1));
                    options.add(chichenQ4 = new QuizOptions("What is Chichen Itza?", "A tower", "An archaeological site", "An amphitheatre", "A statue",2));
                    options.add(chichenQ5 = new QuizOptions("What culture built the Chinchen Itza", "Mayan Civilisation", "Incan Civilisation", "Indo-European Civilisation", "Anglo-Saxon Civilisation",1));
                    break;

                case "Colosseum":
                    QuizOptions colosseumQ1;
                    QuizOptions colosseumQ2;
                    QuizOptions colosseumQ3;
                    QuizOptions colosseumQ4;
                    QuizOptions colosseumQ5;

                    options.add(colosseumQ1 = new QuizOptions("The Colosseum is also known as:", "Flastica Emprioma", "Romica Atrium", "Flavian Ampitheatre", "Globe Theatre",3));
                    options.add(colosseumQ2 = new QuizOptions("How many specatators can the Colosseum hold?", "10000", "30000", "40000", "80000",4));
                    options.add(colosseumQ3 = new QuizOptions( "Under which emperor did the Colosseum start construction?", "Caesar", "Vespasian", "Augustus", "Nero",2));
                    options.add(colosseumQ4 = new QuizOptions("When was the Colosseum completed?", "AD 80", "9th Century BC", "AD 20", "3rd Century BC",1));
                    options.add(colosseumQ5 = new QuizOptions("Which European Euro coin has the Colosseum depicted on it?", "Quater", "5 Cents", "10 Cents", "1 Euro",2));
                    break;

                case "Christ the Redeemer":
                    QuizOptions christQ1;
                    QuizOptions christQ2;
                    QuizOptions christQ3;
                    QuizOptions christQ4;
                    QuizOptions christQ5;

                    options.add(christQ1= new QuizOptions("When was Christ the Redeemer constructed?", "Between 1899 and 1909", "Between 1911 and 1919", "Between 1922 and 1931", "Between 1935 and 1943",3));
                    options.add(christQ2 = new QuizOptions("What does Christ the Redeemer symbolise across the world?", "Rebirth", "Strength", "Freedom", "Christianity", 4));
                    options.add(christQ3 = new QuizOptions("What mountain in Rio de Janeiro is Christ the Redeemer located at the peak of?", "Corcovado", "Sugarloaf", "Pedra Bonita", "Pedra da Gávea", 1));
                    options.add(christQ4 = new QuizOptions("Which French sculptor created Christ the Redeemer?", "Auguste Rodin", "Paul Landowski", "Jean Antoine Houdon", "Heitor da Silva Costa",2));
                    options.add(christQ5 = new QuizOptions("How high is Christ the Redeemer (excluding its pedestal)?", "30m", "11m", "26m", "50m",1));
                    break;

                case "Taj Mahal":
                    QuizOptions tajQ1;
                    QuizOptions tajQ2;
                    QuizOptions tajQ3;
                    QuizOptions tajQ4;
                    QuizOptions tajQ5;

                    options.add(tajQ1 = new QuizOptions("What colour is the Taj Mahal?", "Yellow-green", "Ivory-white", "Blue-orange", "Pink-yellow",2));
                    options.add(tajQ2 = new QuizOptions("Which bank of the Yamuna river in India is the Taj Mahal located?", "North", "East", "South", "West",3));
                    options.add(tajQ3 = new QuizOptions("When was the Taj Mahal essentially completed?", "1643", "2nd Century BC", "1998", "1001",1));
                    options.add(tajQ4 = new QuizOptions("How many artiseans were employed for the construction project of Taj Mahal?", "1", "2000", "20000", "543", 3));
                    options.add(tajQ5 = new QuizOptions("How big is the complex that the Taj Mahal is located in?", "1 Hectares", "17 Hectares", "3 Hectares", "89 Hectares", 2));
                    break;

                case "Machu Picchu":
                    QuizOptions machuQ1;
                    QuizOptions machuQ2;
                    QuizOptions machuQ3;
                    QuizOptions machuQ4;
                    QuizOptions machuQ5;

                    options.add(machuQ1 = new QuizOptions("Which valley in Peru is Machu Picchu situated above?","Sacred Valley", "Mantaro Valley", "Old Valley", "Paraíba Valley",1));
                    options.add(machuQ2 = new QuizOptions( "What is Machu Picchu often mistakenly referred to as?", "Old Mountain of Alpacas", "Lost City of the Incas", "New Valley of Life", "Green Village of Light", 2));
                    options.add(machuQ3 = new QuizOptions("Which one of these is NOT one of the 3 primary structures of Machu Picchu?", "Intihuatana", "Temple of Sun", "Room of the Three Windows", "Quechua", 4));
                    options.add(machuQ4 = new QuizOptions("Machu Picchu is a:", "Citadel", "Valley", "Mountain Range", "Statue", 1));
                    options.add(machuQ5 = new QuizOptions( "Which century was Machu Picchu built in?", "13th Century", "11th Century", "15th Century", "16th Century", 3));
                    break;

                case "Petra":
                    QuizOptions petraQ1;
                    QuizOptions petraQ2;
                    QuizOptions petraQ3;
                    QuizOptions petraQ4;
                    QuizOptions petraQ5;

                    options.add(petraQ1 = new QuizOptions("What is Petra originally known as to its inhabitants?", "Raqmu", "Khazneh", "Ma’an", "Damascus",1));
                    options.add(petraQ2 = new QuizOptions("When was the area around Petra inhabited?", "3000BC", "4000BC", "6000BC", "7000BC",4));
                    options.add(petraQ3 = new QuizOptions("Why was the location of Petra ideal for nomadic Arabs?", "Proximity to water sources", "Proximity to trade routes", "Proximity to major cities", "Proximity to fertile soil", 2));
                    options.add(petraQ4 = new QuizOptions("Where is Petra located?", "Northern Jordan", "Southern Jordan", "Western Jordan", " Eastern Jordan", 2));
                    options.add(petraQ5 = new QuizOptions("What was Petra’s highest population in 1st century AD?", "20000", "30000", "40000", "50000", 1));
                    break;



            }

            return options;

        }
    }








