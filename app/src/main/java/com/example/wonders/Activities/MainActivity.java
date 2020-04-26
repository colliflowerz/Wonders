package com.example.wonders.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.wonders.R;
import com.example.wonders.quizFiles.QuizTopics;

public class MainActivity extends AppCompatActivity {

    private CardView explore;
    private CardView funfacts;
    private CardView discover;
    private CardView quiz;
    private CardView notes;
    private CardView badges;
    private ScrollView bg1;
    Dialog welcomeDialogue;
    ImageView close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set bg
        bg1 = findViewById(R.id.bg1);

        //Explore button to access the explore activity
        explore = findViewById(R.id.Card1);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListOfWondersActivity.class);
                startActivity(intent);
            }
        });

        //Fun facts button
        funfacts = findViewById(R.id.Card2);
        funfacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, FunFactsActivity.class);
                startActivity(intent2);
            }
        });

        //Discover button
        discover = findViewById(R.id.discover);
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, DiscoverMoreActivity.class);
                startActivity(intent3);
            }
        });

        //Quiz button
        quiz = findViewById(R.id.quiz);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, QuizTopics.class);
                startActivity(intent4);
            }
        });

        //Notes button
        notes = findViewById(R.id.notes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivity.this, NotesPageActivity.class);
                startActivity(intent5);
            }
        });

        //Badges button
        badges = findViewById(R.id.badges);
        badges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MainActivity.this, BadgesActivity.class);
                startActivity(intent6);
            }
        });

        //Check if first time going onto page and launch dialogue
        // Source: http://www.andreabaccega.com/blog/2012/04/12/android-how-to-execute-some-code-only-on-first-time-the-application-is-launched/
        // Year: 2012
        // Author:  Andrea Baccega
        boolean firstrun = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("firstrun", true);
        if (firstrun) {
            openWelcomeDialog();
            getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                    .edit()
                    .putBoolean("firstrun", false)
                    .commit();
        }
    }

    //Creates a Dialog, sets an xml layout and shows the dialog
    private void openWelcomeDialog() {
        welcomeDialogue = new Dialog(this);
        welcomeDialogue.setContentView(R.layout.welcome_dialog);
        close = (ImageView) welcomeDialogue.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeDialogue.dismiss();
            }
        });
        welcomeDialogue.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        welcomeDialogue.show();
    }
}
