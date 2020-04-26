package com.example.wonders;

import android.app.Application;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

public class Startup extends Application {

    Dialog welcomeDialogue;
    ImageView close;
    @Override
    public void onCreate() {
        super.onCreate();

        //Creates and opens the Dialog
        welcomeDialogue = new Dialog(this);
        welcomeDialogue.setContentView(R.layout.welcome_dialog);
        close = (ImageView) welcomeDialogue.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeDialogue.dismiss();
            }
        });
        welcomeDialogue.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        welcomeDialogue.show();

    }

}