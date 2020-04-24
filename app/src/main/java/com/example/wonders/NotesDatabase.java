package com.example.wonders;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {Notes.class}, version = 1, exportSchema = false)
public abstract class NotesDatabase extends RoomDatabase {
    public abstract NotesDao notesDao();
}
