package com.example.wonders;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

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


        int position = intent.getIntExtra(ListOfWonders.EXTRA_MESSAGE, 0);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = new InformationFragment();
        Bundle args = new Bundle();
        args.putInt(ListOfWonders.EXTRA_MESSAGE, position);
        fragment.setArguments(args);
        transaction.replace(R.id.scrollView, fragment);
        transaction.commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch(item.getItemId()){
                        case R.id.nav_info:
                            selectedFragment = new InformationFragment();
                            break;
                        case R.id.nav_map:
                            selectedFragment = new MapsFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };
}
