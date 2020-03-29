package com.example.wonders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    public static final String ARG_ITEM_ID = "item_id";
    private ArrayList<Wonder> wonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int message = intent.getIntExtra("position", 0);


        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = new InformationFragment();
        Bundle args = new Bundle();
        args.putInt(MainActivity.EXTRA_MESSAGE, position);
        fragment.setArguments(args);
        transaction.replace(R.id.scrollView, fragment);
        transaction.commit();
        //populate detail activity here based on info from the Wonders class
        //can put youtube links or wiki links here as well or whatever





    }
}
