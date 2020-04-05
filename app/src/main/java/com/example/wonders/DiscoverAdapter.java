package com.example.wonders;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class DiscoverAdapter extends RecyclerView.Adapter<DiscoverAdapter.DiscoverViewHolder> {
    private ArrayList<Wonder> mWonders;
    private RecyclerViewClickListener mListener;
    Context mContext;


    DiscoverAdapter(Context context, ArrayList<Wonder> wonders) {
        mWonders = wonders;
        mContext = context;
    }

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);

    }


    public static class DiscoverViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView name;
        private ImageView instagram, google, youtube;
        private RecyclerViewClickListener mListener;

        private DiscoverViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);

            name = v.findViewById(R.id.name);
            instagram = v.findViewById(R.id.instagram);
            instagram.setTag(this);
            youtube = v.findViewById(R.id.youtube);
            youtube.setTag(this);
            google = v.findViewById(R.id.google);
            google.setTag(this);



        }

        public void onClick(View v) {
            mListener.onClick(v, getAdapterPosition());

        }
    }

    @Override
    public DiscoverAdapter.DiscoverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.discover_list_row, parent, false);
        return new DiscoverViewHolder(v, mListener);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(DiscoverViewHolder holder, final int position) {

        Wonder wonder = mWonders.get(position);
        holder.name.setText(wonder.getName());
        holder.google.setTag(wonder);
        holder.google.setClickable(true);
        holder.instagram.setTag(wonder);
        holder.instagram.setClickable(true);
        holder.youtube.setClickable(true);
        holder.youtube.setTag(wonder);
        holder.youtube.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=" + mWonders.get(position).getName().replaceAll("\\s","+")));
                mContext.startActivity(browserIntent);
            }
        });


        holder.google.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + mWonders.get(position).getName()));
                mContext.startActivity(browserIntent);

            }

        });
        holder.instagram.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/explore/tags/" + mWonders.get(position).getName().replaceAll("\\s","+")));
                mContext.startActivity(browserIntent);
            }

        });

            }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mWonders.size();
    }



}

