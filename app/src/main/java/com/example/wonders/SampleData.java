package com.example.wonders;

import java.util.ArrayList;
import java.util.List;

public class SampleData {
    public static void createSampleUsers(){
        List<User> sampleUsers = new ArrayList<>();
        sampleUsers.add(new User("collin", "collin", false, true,true,false,false,false,false,false));

        SessionData.mUserDatabase.userDao().insertAllUsers(sampleUsers);
    }
}
