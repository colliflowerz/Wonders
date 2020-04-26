package com.example.wonders.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.wonders.R;
import com.example.wonders.Data.SampleData;
import com.example.wonders.Data.SessionData;
import com.example.wonders.User;
import com.google.android.material.textfield.TextInputLayout;

public class LoginScreenActivity extends AppCompatActivity {
    Button button;

    //  https://www.journaldev.com/14748/android-textinputlayout-example
    // This was used to learn how to use TextInputLayout
    public TextInputLayout username;
    public TextInputLayout password;
    public Button login;
    public Button rego;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);


        SessionData.createDB(this);

        SampleData.createSampleUsers();

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.loginBtn);
        rego = findViewById(R.id.regoBtn);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = SessionData.mUserDatabase.userDao().returnUserByUserName(username.getEditText().getText().toString());

                if (username.getEditText().getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please fill out the username field", Toast.LENGTH_LONG).show();
                } else if (password.getEditText().getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please fill out the password field", Toast.LENGTH_LONG).show();
                } else if (user == null) {
                    Toast.makeText(getApplicationContext(), "User does not exist!", Toast.LENGTH_LONG).show();
                } else if (password.getEditText().getText().toString().equals(user.getPassword().toString())) {
                    startActivity(new Intent(LoginScreenActivity.this, MainActivity.class));
                    SessionData.currentUser = user;
                    Toast.makeText(getApplicationContext(), "Your details are correct!", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Your details are incorrect!", Toast.LENGTH_LONG).show();
                }
            }
        });

        rego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreenActivity.this, RegistrationPageActivity.class);
                startActivity(intent);
            }
        });

    }
}
