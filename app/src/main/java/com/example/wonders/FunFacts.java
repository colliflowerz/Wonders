package com.example.wonders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class FunFacts extends AppCompatActivity {

    private FactsList factsList = new FactsList();
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

                Intent intent = new Intent (FunFacts.this, MainActivity.class);

                startActivity(intent);

            }
        });

        setTitle("Fun Facts");

        //retrieving UI element IDs

        factText = (TextView) findViewById(R.id.factTextView);
        //final TextView factText = (TextView) findViewById(R.id.factTextView);
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
                //rotateAnimation();

            }
        };
        factButton.setOnClickListener(listener);
    }
  /*   private void rotateAnimation() {
        animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        factText.startAnimation(animation);
    } */
}

//reference: this code is derived from: https://github.com/treehouse/android-fun-facts-github/blob/master/app/src/main/java/com/teamtreehouse/funfacts/FunFactsActivity.java