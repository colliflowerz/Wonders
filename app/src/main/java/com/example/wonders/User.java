package com.example.wonders;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    @NonNull
    //initialising sections within db
    private String username;
    private String password;
    //If a user completes a quiz, it will change the status of the badges to true
    private boolean badge1;
    private boolean badge2;
    private boolean badge3;
    private boolean badge4;
    private boolean badge5;
    private boolean badge6;
    private boolean badge7;

    //Constructor
    public User(@NonNull String username, String password, boolean badge1, boolean badge2, boolean badge3, boolean badge4, boolean badge5, boolean badge6, boolean badge7, boolean badge8) {
        this.username = username;
        this.password = password;
        this.badge1 = badge1;
        this.badge2 = badge2;
        this.badge3 = badge3;
        this.badge4 = badge4;
        this.badge5 = badge5;
        this.badge6 = badge6;
        this.badge7 = badge7;
        this.badge8 = badge8;
    }

    //Getters and setters
    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBadge1() {
        return badge1;
    }

    public void setBadge1(boolean badge1) {
        this.badge1 = badge1;
    }

    public boolean isBadge2() {
        return badge2;
    }

    public void setBadge2(boolean badge2) {
        this.badge2 = badge2;
    }

    public boolean isBadge3() {
        return badge3;
    }

    public void setBadge3(boolean badge3) {
        this.badge3 = badge3;
    }

    public boolean isBadge4() {
        return badge4;
    }

    public void setBadge4(boolean badge4) {
        this.badge4 = badge4;
    }

    public boolean isBadge5() {
        return badge5;
    }

    public void setBadge5(boolean badge5) {
        this.badge5 = badge5;
    }

    public boolean isBadge6() {
        return badge6;
    }

    public void setBadge6(boolean badge6) {
        this.badge6 = badge6;
    }

    public boolean isBadge7() {
        return badge7;
    }

    public void setBadge7(boolean badge7) {
        this.badge7 = badge7;
    }

    public boolean isBadge8() {
        return badge8;
    }

    public void setBadge8(boolean badge8) {
        this.badge8 = badge8;
    }

    private boolean badge8;


}