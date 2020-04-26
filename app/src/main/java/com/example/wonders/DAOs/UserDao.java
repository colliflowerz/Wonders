package com.example.wonders.DAOs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.wonders.User;

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

    @Query("UPDATE User SET badge1 = 1 WHERE username = :username")
    void updateBadge1 (String username);

    @Query("UPDATE User SET badge2 = 1 WHERE username = :username")
    void updateBadge2 (String username);

    @Query("UPDATE User SET badge3 = 1 WHERE username = :username")
    void updateBadge3 (String username);

    @Query("UPDATE User SET badge4 = 1 WHERE username = :username")
    void updateBadge4 (String username);

    @Query("UPDATE User SET badge5 = 1 WHERE username = :username")
    void updateBadge5 (String username);

    @Query("UPDATE User SET badge6 = 1 WHERE username = :username")
    void updateBadge6 (String username);

    @Query("UPDATE User SET badge7 = 1 WHERE username = :username")
    void updateBadge7 (String username);

    @Query("UPDATE User SET badge8 = 1 WHERE username = :username")
    void updateBadge8 (String username);


}


