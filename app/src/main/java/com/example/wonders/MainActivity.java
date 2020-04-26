package com.example.wonders;

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

import com.example.wonders.quizFiles.QuizDatabseActivity;
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
    ImageView close, badge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Open the welcome pop-up
        openWelcomeDialog();

        //set bg
        bg1=findViewById(R.id.bg1);


        //explore button

        explore = findViewById(R.id.Card1);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ListOfWonders.class);

                startActivity(intent);

            }
        }) ;

        //fun facts button
        funfacts = findViewById(R.id.Card2);
        funfacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, FunFacts.class);
                startActivity(intent2);
            }
        });

        //discover button
        discover = findViewById(R.id.discover);
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(MainActivity.this, DiscoverList.class);

                startActivity(intent3);

            }
        }) ;

        quiz = findViewById(R.id.quiz);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, QuizTopics.class);

                startActivity(intent4);
            }
        });

       notes = findViewById(R.id.notes);
       notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent5 = new Intent(MainActivity.this, NotesPage.class);
                startActivity(intent5);
            }
        });

       badges = findViewById(R.id.badges);
       badges.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent6 = new Intent(MainActivity.this, BadgesActivity.class);
               startActivity(intent6);
           }
       });

    }

    private void LaunchListOfWonders(){
        Intent intent = new Intent(this, ListOfWonders.class);
        startActivity(intent);
    }

    private void openWelcomeDialog(){

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
