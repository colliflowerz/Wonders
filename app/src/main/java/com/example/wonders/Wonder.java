package com.example.wonders;

import java.util.ArrayList;

public class Wonder {
    private String name;
    private String location;
    private String year;
    private String information;

    public Wonder(){

    }

    public Wonder (String name, String location, String year, String information) {

        this.name=name;
        this.location=location;
        this.year=year;
        this.information=information;
    }

    public String getName()  {
        return name;
    }
    public void setName(String name)   {
        this.name =name;
    }


    public String getLocation()   {
        return location;
    }
    public void setLocation(String location)   {
        this.location =location;
    }


    public String getYear()   {
        return year;
    }
    public void setYear(String year)   {
        this.year =year;
    }


    public String getInformation()   {
        return information;
    }
    public void setInformation(String information)  {
        this.information =information;
    }

    public static ArrayList<Wonder> getWonders(){
        ArrayList<Wonder> wonders = new ArrayList<>();

        wonders.add(new Wonder("Taj Mahal", "India", "1632", "The Taj Mahal is well known across the world for its historical value, its tale of love, and its stunning beauty. The Taj Mahal is located in the historic Indian city of Agra. It houses the tomb of Mumtaz Mahal, the wife of the Mughal Emperor Shah Jahan. It is said that the Emperor loved his wife dearly and was prompted to build the Taj Mahal after her death as a testament to his love. The construction of the Taj Mahal was completed by 1632. The construction of the temple cost the equivalent of US$827 million today. In 1983, the Taj Mahal was inscribed by the UNESCO as a World Heritage Site. Today, it attracts 7 to 8 million annual visitors each year."));
        wonders.add(new Wonder("Colosseum", "Italy", "AD 80", "Rome, Italy hosts the Colosseum, which is one of the world's new seven wonders. Sometimes called the Flavian Amphitheatre, the Colosseum is an oval-shaped amphitheater in the center of the city. Constructed from concrete and sand, it is the largest amphitheater in the world. The Colosseum's construction was initiated in AD 72 by Emperor Vespasian and was finished by AD 80 by his successor, Titus. Domitian, another emperor of the Flavian dynasty later made certain modifications to the amphitheater. The Colosseum had the capacity to host about 80,000 spectators. Mock sea battles, animal hunts, famous battle re-enactments, executions, and mythological dramas were just some of the public spectacles held at the Colosseum. Today, this wonder of the world is a popular tourist attraction and serves as the iconic symbol of Imperial Rome."));
        wonders.add(new Wonder("Chichen Itza", "Mexico", "AD 900-1200", "Chichen Itza is an archaeological site located in Mexico’s Yucatán State. It is a pre-Columbian city that was built during the Terminal Classic period by the Maya people. The historical value of the site contributes to its status as a wonder of the world. Chichen Itza is believed to have been one of the major cities of the ancient Mayan world and constructions in the city exhibit a variety of architectural styles."));
        wonders.add(new Wonder("Machu Picchu", "Peru", "1550", "The dream destination of millions of people across the world, Machu Picchu is one of the new seven wonders of the world. It is located in the Cusco Region of Peru’s Machupicchu District. According to the majority of archaeologists, the Inca emperor Pachacuti built Machu Picchu as an estate around the year 1450. The site developed as a city but was abandoned a century later during the Spanish Conquest. The site remained largely unknown to the rest of the world until its discovery by the American explorer Hiram Bingham. Machu Picchu is a great representation of the Incan way of life."));
        wonders.add(new Wonder("Christ the Redeemer", "Brazil", "1931", "One of Brazil's most iconic symbols, the Art Deco styled statue of Jesus Christ in Rio de Janeiro is one of the new seven wonders of the world. The credit of building the statue goes to Paul Landowski, a French sculptor. The Romanian sculptor, Gheorghe Leonida, was responsible for fashioning the face. Christ the Redeemer is 98 feet tall and has a 26-feet tall pedestal. Its arms stretch 92 feet wide. The 635 metric ton statue, made of soapstone and concrete, is located atop the 2,300 feet tall Corcovado mountain. The construction of the statue was initiated in 1922 and completed by 1931."));
        wonders.add(new Wonder("Petra", "Jordan", "Unclear, early as 5 BC", "Petra, a Jordanian wonder, is also listed among the new seven wonders of the world. It has immense archaeological, historical, and architectural value that makes it a jaw-dropping tourist attraction. The water conduit system and the rock-cut architecture are the two most notable features of this ancient city. Petra is also nicknamed as the “Rose City” due to the stone color from which it is carved. Petra is not only one of the new seven wonders of the world but is also a UNESCO World Heritage Site. It is also listed as one of the \"28 Places to See Before You Die” by the Smithsonian magazine."));
        wonders.add(new Wonder("Great Wall of China", "China", "7th Century BC", "The Great Wall of China, a global tourist hotspot, is known across the world for its uniqueness, great length, and historical value. It is also considered to be one of the new seven wonders of the world. The Great Wall of China is associated with thousands of years of Chinese history. A series of walls were initially built by Chinese empires and states over a period of many years, beginning as early as the 7th century BCE. These walls were then joined together to result in the Great Wall of China. UNESCO inscribed the site as a UNESCO World Heritage site in 1987."));

        return wonders;
    }



}

