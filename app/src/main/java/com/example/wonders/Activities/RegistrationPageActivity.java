package com.example.wonders.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.wonders.R;
import com.example.wonders.Data.SessionData;
import com.example.wonders.User;
import com.google.android.material.textfield.TextInputLayout;

public class RegistrationPageActivity extends AppCompatActivity {

    public static TextInputLayout regUsername;
    public TextInputLayout regPassword;
    public TextInputLayout regPasswordConfirm;
    public Button regBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        SessionData.createDB(this.getApplicationContext());

        regUsername = findViewById(R.id.regUsername);
        regPassword = findViewById(R.id.regPassword);
        regPasswordConfirm = findViewById(R.id.regPasswordConfirm);
        regBtn = findViewById(R.id.regBtn);

        //Upon clicking the register button, it will check whether a user has entered a username, password and if the password is correct
        //Else it will return with an error
        //If successful, user will be registered into the database
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernameDoesntExist()) {
                    if (regUsername.getEditText().getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Username field empty!", Toast.LENGTH_SHORT).show();
                    } else if (regPassword.getEditText().getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Password Field empty!", Toast.LENGTH_SHORT).show();
                    } else if (regPassword.getEditText().getText().toString().equals(regPasswordConfirm.getEditText().getText().toString()) == false) {
                        Toast.makeText(getApplicationContext(), "Password does not match!", Toast.LENGTH_SHORT).show();
                    } else {
        // To ensure that the user has not attained any badges as they register, badge status is set to false
                        User user = new User(regUsername.getEditText().getText().toString(), regPasswordConfirm.getEditText().getText().toString(), false, false, false, false, false, false, false, false);
                        SessionData.mUserDatabase.userDao().insertOneUser(user);
                        Toast.makeText(getApplicationContext(), "Registration Successful!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), LoginScreenActivity.class);
                        startActivity(intent);
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Username already exists!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    //Check if the username already exists in the database
    public static Boolean usernameDoesntExist() {
        if (SessionData.mUserDatabase.userDao().returnUserByUserName(regUsername.getEditText().getText().toString()) != null) {
            return false;
        }
        return true;
    }
}
