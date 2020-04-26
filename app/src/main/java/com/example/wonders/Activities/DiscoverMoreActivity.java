package com.example.wonders.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.wonders.Adapters.DiscoverAdapter;
import com.example.wonders.R;
import com.example.wonders.Wonder;

import java.util.ArrayList;


public class DiscoverMoreActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Wonder> mWonders = Wonder.getWonders();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_wonders);

        setTitle("Discover more!");

        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        DiscoverAdapter.RecyclerViewClickListener listener = new DiscoverAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {

            }
        };
        mAdapter = new DiscoverAdapter(this, Wonder.getWonders());
        mRecyclerView.setAdapter(mAdapter);



    }



}
