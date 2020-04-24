package com.example.wonders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.widget.TextView;

public class NotesDetailActivity extends AppCompatActivity {

    private TextView title;
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  ActionBar actionbar = getSupportActionBar();
       // actionbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradient));
        setContentView(R.layout.activity_notes_detail);

        //displays relevant note with its contents when clicked from notes fragment
        Intent intent = getIntent();
        int notesID = intent.getIntExtra("id", -1);

        final Notes thisNote = getNotesById(notesID);

        title = findViewById(R.id.dTitle);
        content = findViewById(R.id.dContent);
        title.setText(thisNote.getTitle());
        content.setText(thisNote.getContent());
    }

    public static Notes getNotesById(int notesID) {
        return NotesPage.notesList.get(notesID);
    }
}