package com.example.wonders.Data;

import android.content.Context;

import androidx.room.Room;

import com.example.wonders.Databases.NotesDatabase;
import com.example.wonders.User;
import com.example.wonders.Databases.UserDatabase;

public class SessionData {

    public static UserDatabase mUserDatabase;
    public static User currentUser = new User("collin", "collin", true, true,true,true,true,true,true,true);
    public static NotesDatabase mNotesDatabase;


    public static void createDB(Context context) {

        //Builds user database
        mUserDatabase = Room.databaseBuilder(context.getApplicationContext(),
                UserDatabase.class, "user_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

        //Builds notees database
        mNotesDatabase = Room.databaseBuilder(context.getApplicationContext(),
                NotesDatabase.class, "notes_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

    }

}
