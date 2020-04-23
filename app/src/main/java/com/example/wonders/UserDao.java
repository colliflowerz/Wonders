package com.example.wonders;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

//https://github.com/umangburman/Room-Library-Login-Example
@Dao
public interface UserDao {

    //Inserts one user
    @Insert
    void insertOneUser(User user);

    //Grabs all users
    @Query("select * from User")
    List<User> getAllUsers();

    //Deletes all users
    @Query("delete from user")
    void deleteAllUsers();

    //Inserts a list of users into the database
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAllUsers(List<User> users);

    //Returns one user by using their username
    @Query("SELECT * FROM User WHERE username = :username")
    User returnUserByUserName (String username);


}


