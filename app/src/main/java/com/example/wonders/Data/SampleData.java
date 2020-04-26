package com.example.wonders.Data;

import com.example.wonders.User;

import java.util.ArrayList;
import java.util.List;

public class SampleData {
    public static void createSampleUsers(){
        List<User> sampleUsers = new ArrayList<>();
        sampleUsers.add(new User("collin", "collin", true, true,true,true,true,true,true,true));

        SessionData.mUserDatabase.userDao().insertAllUsers(sampleUsers);
    }
}
