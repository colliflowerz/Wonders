package com.example.wonders;

import java.util.ArrayList;

public class Wonder {
    private String name;
    private String location;
    private String year;
    private int image;

    public Wonder() {

    }

    public Wonder(String name, String location, String year, int image) {

        this.name = name;
        this.location = location;
        this.year = year;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public static ArrayList<Wonder> getWonders() {
        ArrayList<Wonder> wonders = new ArrayList<>();

        wonders.add(new Wonder("Taj Mahal", "India", "1632", R.drawable.taj_mahal));
        wonders.add(new Wonder("Colosseum", "Italy", "AD 80",R.drawable.colosseum));
        wonders.add(new Wonder("Chichen Itza", "Mexico", "AD 900-1200",R.drawable.chichen_itza));
        wonders.add(new Wonder("Machu Picchu", "Peru", "1550",R.drawable.machu_picchu));
        wonders.add(new Wonder("Christ the Redeemer", "Brazil", "1931",R.drawable.christ_the_redeemer));
        wonders.add(new Wonder("Petra", "Jordan", "Unclear, early as 5 BC",R.drawable.petra));
        wonders.add(new Wonder("Great Wall of China", "China", "7th Century BC",R.drawable.great_wall_of_china));

        return wonders;
    }


}

