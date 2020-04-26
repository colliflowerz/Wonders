package com.example.wonders.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.wonders.Notes;
import com.example.wonders.R;
import com.example.wonders.Data.SessionData;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CreateNoteActivity extends AppCompatActivity {

    public EditText noteTitle;
    public EditText noteContent;
    public FloatingActionButton add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActionBar actionbar = getSupportActionBar();
       // actionbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradient));
        setContentView(R.layout.activity_create_note);

        noteTitle = findViewById(R.id.title);
        noteContent = findViewById(R.id.content);

        add = findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //gets you the contents of edit text
                String nTitle = noteTitle.getText().toString();
                String nContent = noteContent.getText().toString();
                int nId = 0;
                if (NotesPageActivity.notesList.isEmpty()){
                    nId = 0;
                }
                else {
                    nId = NotesPageActivity.notesList.get(NotesPageActivity.notesList.size() - 1).getId() + 1;
                }

                //creating note object to insert into database
                Notes object = new Notes(nId, nTitle, nContent);
                NotesPageActivity.notesList.add(object);

                Toast.makeText(CreateNoteActivity.this, "Note created!", Toast.LENGTH_SHORT).show();

                //adds note to database and ends activity
                SessionData.mNotesDatabase.notesDao().insertOneNote(object);
                NotesPageActivity.notesAdapter.notifyDataSetChanged();
                finish();
            }

        });
    }
}