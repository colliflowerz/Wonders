package com.example.wonders;

import android.content.Context;

import androidx.room.Room;

public class SessionData {

    public static UserDatabase mUserDatabase;
    public static User currentUser = new User("collin", "collin", false, true,true,false,false,false,false,false);
    public static NotesDatabase mNotesDatabase;


    public static void createDB(Context context) {

        mUserDatabase = Room.databaseBuilder(context.getApplicationContext(),
                UserDatabase.class, "user_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();


        mNotesDatabase = Room.databaseBuilder(context.getApplicationContext(),
                NotesDatabase.class, "notes_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

    }

}
