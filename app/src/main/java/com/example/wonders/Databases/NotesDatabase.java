package com.example.wonders.Databases;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.wonders.DAOs.NotesDao;
import com.example.wonders.Notes;


@Database(entities = {Notes.class}, version = 1, exportSchema = false)
public abstract class NotesDatabase extends RoomDatabase {
    public abstract NotesDao notesDao();
}
