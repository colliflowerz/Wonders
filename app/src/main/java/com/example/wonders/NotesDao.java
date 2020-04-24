package com.example.wonders;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertOneNote (Notes note);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Notes> notes);

    @Query("SELECT * FROM Notes")
    List<Notes> getAll();

    @Delete
    void deleteNotes(Notes notes);

}
