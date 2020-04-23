package com.example.wonders;

import java.util.ArrayList;
import java.util.List;

public class SampleData {
    public static void createSampleUsers(){
        List<User> sampleUsers = new ArrayList<>();
        sampleUsers.add(new User("collin", "collin", "Collin", "Zhang"));

        SessionData.mUserDatabase.userDao().insertAllUsers(sampleUsers);
    }
}
