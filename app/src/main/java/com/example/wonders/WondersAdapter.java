package com.example.wonders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class WondersAdapter extends RecyclerView.Adapter<WondersAdapter.WondersViewHolder> {
    private MainActivity mParentActivity;
    private ArrayList<Wonder> mWonders;

    public interface OnClickListener {
        void onClick(View view, int position);

    }


    public WondersAdapter(MainActivity parent, ArrayList<Wonder> wonders) {
        mParentActivity = parent;
        mWonders = wonders;
    }

    public static class WondersViewHolder extends RecyclerView.ViewHolder {
        public TextView name, year, location;
        public ImageView image;

        public WondersViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.name);
            year = v.findViewById(R.id.year);
            location = v.findViewById(R.id.location);
            image = v.findViewById(R.id.image);
        }

        public void onClick(View v) {

            int position = getLayoutPosition();
            Intent intent = new Intent(v.getContext(), DetailActivity.class);
            intent.putExtra("position", position);
            v.getContext().startActivity(intent);

        }
    }

    @Override
    public WondersAdapter.WondersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.wonders_list_row, parent, false);
        return new WondersViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(WondersViewHolder holder, int position) {
        Wonder wonder = mWonders.get(position);
        holder.name.setText(wonder.getName());
        holder.year.setText(String.valueOf(wonder.getYear()));
        holder.location.setText(wonder.getLocation());
        holder.itemView.setTag(wonder);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mWonders.size();
    }

}




