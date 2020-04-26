package com.example.wonders;

import java.util.Random;

public class FactsList {


    // this array stores all the facts that are in the "fun fact" functionality of the app
    String[] factsList = {
            "Many of the sites in Chichen Itza are known for their unusual sounds. If you clap once from one end of the Ball Court, it produces nine echoes in the middle of the court!",
            "The term Chichen Itza means ‘the mouth at the well of Itza’.",
            "More than 1,000, 000 laborers were recruited for the construction of the Great Wall of China.",
            "Glutinous rice flour was used as mortar to build the Great Wall of China. Processed rice flour served as a reliable adhesive.",
            "To combat the fact that Peru is extremely earthquake-prone, every building built in Machu Picchu was made earthquake-resistant by the Incas!",
            "A Bollywood film called “Robot” was one of the few films that has been granted permission to film at Machu Picchu. The result was a crane damaging a part of the site, causing an uproar!",
            "Natural disasters and vandalism destroyed approximately two-thirds of the Colosseum. But it was the 847 AD and 1231 AD earthquakes that did the most damage that you can see today.",
            "The Colosseum had 36 trap doors for special effects, as well as many underground passages and rooms to hold wild animals and gladiators before games began.",
            "The materials that were used to build Taj Mahal were transported to the construction site by a whopping 1,000 elephants.",
            "India has a major problem with air pollution due to heavy traffic, so in order to protect the Taj Mahal from the harmful effects of pollution, there can be no cars and buses closer than 500 meters away from the entrance. ",
            "Approximately only 15% of Petra has been explored by archaeologists, which therefore means that there is still plenty to be revealed.",
            "The Mummy Returns, Indiana Jones and the Last Crusade are the most noteworthy movies that were filmed at Petra.",
            "Due to Christ the Redeemer’s mountaintop position, it’s prone to lightning strikes and gets hit around three to six times a year.",
            "The original design of Christ the Redeemer was different to what we see today. It was intended for Christ to be holding a globe in one hand and a cross in the other, rather than two open arms."};

    //getter to retrieve these facts
    public String getFact() {
        String fact = "";

        //this randomises the facts
        Random randomGenerator = new Random();
        //randomising the facts so they aren't in order
        int randomNumber = randomGenerator.nextInt(factsList.length);
        fact = factsList[randomNumber];
        return fact;
    }
}

//reference: this code is derived from the fun facts app: https://github.com/treehouse/android-fun-facts-github/blob/master/app/src/main/java/com/teamtreehouse/funfacts/FactBook.java
