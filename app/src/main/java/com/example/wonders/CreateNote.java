package com.example.wonders;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CreateNote extends AppCompatActivity {

    public EditText noteTitle;
    public EditText noteContent;
    public FloatingActionButton add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionbar = getSupportActionBar();
       // actionbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradient));
        setContentView(R.layout.activity_create_note);

        noteTitle = findViewById(R.id.title);
        noteContent = findViewById(R.id.content);

        add = findViewById(R.id.addNote);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //gets you the contents of edit text
                String nTitle = noteTitle.getText().toString();
                String nContent = noteContent.getText().toString();
                int nId = 0;
                if (NotesPage.notesList.isEmpty()){
                    nId = 0;
                }
                else {
                    nId = NotesPage.notesList.get(NotesPage.notesList.size() - 1).getId() + 1;
                }

                //creating note object to insert into database
                Notes object = new Notes(nId, nTitle, nContent);
                NotesPage.notesList.add(object);
                Toast.makeText(CreateNote.this, "Note created!", Toast.LENGTH_SHORT).show();

                //adds note to database and ends activity
                SessionData.mNotesDatabase.notesDao().insertOneNote(object);
                NotesPage.notesAdapter.notifyDataSetChanged();
                finish();
            }

        });
    }
}