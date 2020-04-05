package com.example.wonders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private CardView explore;
    private CardView funfacts;
    private CardView discover;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("New Seven Wonders of the World");

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




    }

    private void LaunchListOfWonders(){
        Intent intent = new Intent(this, ListOfWonders.class);
        startActivity(intent);
    }


}
