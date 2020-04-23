package com.example.wonders;

import android.content.Context;

import androidx.room.Room;

public class SessionData {

    public static UserDatabase mUserDatabase;
    public static User currentUser = new User("collin", "collin", "collin", "zhang");


    public static void createDB(Context context) {

        mUserDatabase = Room.databaseBuilder(context.getApplicationContext(),
                UserDatabase.class, "user_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

    }
}
