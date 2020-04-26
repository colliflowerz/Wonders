package com.example.wonders.Databases;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.wonders.DAOs.UserDao;
import com.example.wonders.User;

@Database(entities = {User.class}, version = 2, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
