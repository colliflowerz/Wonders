package com.example.wonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String ARG_ITEM_ID = "item_id";
    private ArrayList<Wonder> wonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int message = intent.getIntExtra("position", 0);

        //populate detail activity here based on info from the Wonders class
        //can put youtube links or wiki links here as well





    }
}
