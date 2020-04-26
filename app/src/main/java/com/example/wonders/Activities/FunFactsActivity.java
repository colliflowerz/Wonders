package com.example.wonders.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.wonders.Data.FunFactsData;
import com.example.wonders.R;

/*
 Source:https://github.com/treehouse/android-fun-facts-github/blob/master/app/src/main/java/com/teamtreehouse/funfacts/FunFactsActivity.java
 Year: 2015
 Author: Ben Deitch
 */

public class FunFactsActivity extends AppCompatActivity {

    private FunFactsData factsList = new FunFactsData();
    Animation animation;
    TextView factText;
    private ImageView backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        backArrow = findViewById(R.id.backArrow);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FunFactsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        setTitle("Fun Facts");

        //Retrieving UI element IDs
        factText = (TextView) findViewById(R.id.factTextView);
        final Button factButton = (Button) findViewById(R.id.showFactButton);

        //Retrieves fact once clicked
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factsList.getFact();
                factText.setText(fact);
            }
        };
        factButton.setOnClickListener(listener);
    }

}

