package com.example.wonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.se.omapi.Session;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginScreen extends AppCompatActivity {
    Button button;

    //  https://www.journaldev.com/14748/android-textinputlayout-example
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


        // NOTE FOR COLLIN - HAVE TO CHANGE THE IF CODE BELOW COS TOO MUCH COPYRIGHT

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = SessionData.mUserDatabase.userDao().returnUserByUserName(username.getEditText().getText().toString());

                if (username.getEditText().getText().toString().equals("")) {
                    // Missing Username Field
                    Toast.makeText(getApplicationContext(), "Please fill out the username field", Toast.LENGTH_LONG).show();
                } else if (password.getEditText().getText().toString().equals("")) {
                    // Missing Password Field
                    Toast.makeText(getApplicationContext(), "Please fill out the password field", Toast.LENGTH_LONG).show();
                } else if (user == null) {
                    // Username not found
                    Toast.makeText(getApplicationContext(), "User does not exist!", Toast.LENGTH_LONG).show();
                } else if (password.getEditText().getText().toString().equals(user.getPassword().toString())) {
                    startActivity(new Intent(LoginScreen.this, MainActivity.class));
                    // Login successful, creating user
                    SessionData.currentUser = user;
                    Toast.makeText(getApplicationContext(), "Your details are correct!", Toast.LENGTH_LONG).show();
                } else {
                    // Incorrect credentials
                    Toast.makeText(getApplicationContext(), "Your details are incorrect!", Toast.LENGTH_LONG).show();

                }
            }
        });

        rego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreen.this, RegistrationPage.class);
                startActivity(intent);
            }
        });

    }
}
