package com.example.wonders;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {

    public static ArrayList<Notes> notesToAdapt;

    public void setData(ArrayList<Notes> notesToAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.notesToAdapt = notesToAdapt;
    }

    public static class NotesViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView title;

        public NotesViewHolder(View v) {
            super(v);
            view = v;
            title = v.findViewById(R.id.cardTitle);

        }
    }

    @NonNull
    @Override
    public NotesAdapter.NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.note_row, parent, false);

        // Then create an instance of your custom ViewHolder with the View you got from inflating
        // the layout.
        NotesViewHolder notesViewHolder = new NotesViewHolder(view);
        return notesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter.NotesViewHolder holder, int position) {
        final Notes notesAtPosition = notesToAdapt.get(position);
        //holder.nameTextView.setText(catsAtPosition.getName());
        holder.title.setText(notesAtPosition.getTitle());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, NotesDetailActivity.class);
                intent.putExtra("id", notesAtPosition.getId());
                context.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return notesToAdapt.size();
    }
}