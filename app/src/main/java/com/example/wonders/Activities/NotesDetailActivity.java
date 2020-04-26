package com.example.wonders.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.widget.TextView;

import com.example.wonders.Notes;
import com.example.wonders.R;

public class NotesDetailActivity extends AppCompatActivity {

    private TextView title;
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_detail);

        //Displays relevant note with its contents when clicked from notes fragment
        Intent intent = getIntent();
        int notesID = intent.getIntExtra("id", -1);

        final Notes thisNote = getNotesById(notesID);

        title = findViewById(R.id.dTitle);
        content = findViewById(R.id.dContent);
        title.setText(thisNote.getTitle());
        content.setText(thisNote.getContent());
    }

    public static Notes getNotesById(int notesID) {
        return NotesPageActivity.notesList.get(notesID);
    }
}