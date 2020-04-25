package com.example.wonders.quizFiles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.wonders.ListOfWonders;
import com.example.wonders.MainActivity;
import com.example.wonders.R;

public class QuizTopics extends AppCompatActivity {

    private CardView china;
    private CardView brazil;
    private CardView india;
    private CardView jordan;
    private CardView machu;
    private CardView maya;
    private CardView rome;

    private TextView chinaText;
    private TextView brazilText;
    private TextView indiaText;
    private TextView jordanText;
    private TextView machuText;
    private TextView romeText;
    private TextView chichenText;

    public static String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_topics);

        china = findViewById(R.id.card1);
        chinaText = findViewById(R.id.chinaText);
        china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizTopics.this, GreatWallQuizActivity.class);
                name= "The Great Wall of China";

                startActivity(intent);
            }
        });

        india = findViewById(R.id.card2);
        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizTopics.this, TajMahalQuizActivity.class);

                startActivity(intent);
            }
        });

       brazil = findViewById(R.id.card3);
        brazil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizTopics.this, ChristQuizActivity.class);

                startActivity(intent);
            }
        });

        jordan = findViewById(R.id.card4);
        jordan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizTopics.this, PetraQuizActivity.class);

                startActivity(intent);
            }
        });

        machu = findViewById(R.id.card5);
        machu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizTopics.this, MachuQuizActivity.class);

                startActivity(intent);
            }
        });

        maya = findViewById(R.id.card6);
        maya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizTopics.this, ChichenQuizActivity.class);

                startActivity(intent);
            }
        });

        rome = findViewById(R.id.card7);
        rome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizTopics.this, ColosseumQuizActivity.class);

                startActivity(intent);
            }
        });
    }
}
