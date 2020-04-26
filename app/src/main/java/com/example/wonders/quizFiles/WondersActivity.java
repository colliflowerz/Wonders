package com.example.wonders.quizFiles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.example.wonders.R;

//unused class
//created to initialise name but now is done in QuizTopics

public class WondersActivity extends AppCompatActivity {

    public static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        Intent intent = getIntent();
        String englishName = intent.getStringExtra("Name");
        name = englishName;


    }
}
