package com.example.wonders;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Wonder {
    private String name;
    private String location;
    private String year;
    private int image;
    //Latitude and longitude for the wonders to use in maps
    private Double latitude;
    private Double longitude;
    private String desc;

    public Wonder() {

    }

    //initialising

    public Wonder(String name, String location, String year, int image, Double latitude, Double longitude, String desc) {
        this.name = name;
        this.location = location;
        this.year = year;
        this.image = image;
        this.latitude = latitude;
        this.longitude = longitude;
        this.desc = desc;
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getDesc(){return desc;}

    public void setDesc(String desc) {this.desc=desc;}

    //adding values to the Wonder list
    public static ArrayList<Wonder> getWonders() {
        ArrayList<Wonder> wonders = new ArrayList<>();

        wonders.add(new Wonder("Taj Mahal", "India", "1632", R.drawable.taj_mahal, 27.173891, 78.042068,"The Jewel of India"));
        wonders.add(new Wonder("Colosseum", "Italy", "AD 80",R.drawable.colosseum, 41.890251, 12.492373,"The Arena of Italy"));
        wonders.add(new Wonder("Chichen Itza", "Mexico", "AD 900-1200",R.drawable.chichen_itza, 20.678392, -88.571568, "The Heart of Mexico"));
        wonders.add(new Wonder("Machu Picchu", "Peru", "1550",R.drawable.machu_picchu, -13.163068, -72.545128, "The Maze of Peru"));
        wonders.add(new Wonder("Christ the Redeemer", "Brazil", "1931",R.drawable.christ_the_redeemer, -22.95158, -43.210482,"The Force of Brazil"));
        wonders.add(new Wonder("Petra", "Jordan", "Unclear, early as 5 BC",R.drawable.petra, 30.328960, 35.444832, "The History of Jordan"));
        wonders.add(new Wonder("Great Wall of China", "China", "7th Century BC",R.drawable.great_wall_of_china, 40.431908, 116.570374, "The Strength of China"));

        return wonders;
    }


}
