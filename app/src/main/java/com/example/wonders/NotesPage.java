package com.example.wonders;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class NotesPage extends AppCompatActivity {

    private RecyclerView recyclerView;
    public static NotesAdapter notesAdapter;
    public FloatingActionButton createNote;
    public static List<Notes> notesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_page);

        recyclerView = findViewById(R.id.rv_notes);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        notesAdapter = new NotesAdapter();


        notesList = SessionData.mNotesDatabase.notesDao().getAll();
        notesAdapter.setData((ArrayList<Notes>) notesList);
        recyclerView.setAdapter(notesAdapter);

        new ItemTouchHelper(itemTouchCallback).attachToRecyclerView(recyclerView);

        createNote = (FloatingActionButton) findViewById(R.id.button);
        createNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NotesPage.this, CreateNote.class);
                startActivity(intent);
            }
        });



    }

    ItemTouchHelper.SimpleCallback itemTouchCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT | ItemTouchHelper.LEFT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
            notesList.remove(viewHolder.getAdapterPosition());
            notesAdapter.notifyDataSetChanged();
        }
    };
}
