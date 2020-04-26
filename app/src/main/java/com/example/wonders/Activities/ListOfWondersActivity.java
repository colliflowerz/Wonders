package com.example.wonders.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.wonders.R;
import com.example.wonders.Wonder;
import com.example.wonders.Adapters.WondersAdapter;


public class ListOfWondersActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "hello there";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_wonders);

        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        WondersAdapter.RecyclerViewClickListener listener = new WondersAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                launchDetailActivity(position);
            }
        };
        mAdapter = new WondersAdapter(Wonder.getWonders(), listener);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void launchDetailActivity(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, position);
        startActivity(intent);
    }
}
