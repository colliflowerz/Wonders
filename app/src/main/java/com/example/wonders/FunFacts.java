package com.example.wonders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class FunFacts extends AppCompatActivity {

    private FactsList factsList = new FactsList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        setTitle("Fun Facts");

        //retrieving UI element IDs
        final TextView factText = (TextView) findViewById(R.id.factTextView);
        final Button factButton = (Button) findViewById(R.id.showFactButton);
        final ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        //intent from HomeLanding page
        Intent intent2 = getIntent();

        //retrieves fact once clicked
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

//reference: this code is derived from: https://github.com/treehouse/android-fun-facts-github/blob/master/app/src/main/java/com/teamtreehouse/funfacts/FunFactsActivity.java