package com.example.hpehack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!username.getText().toString().trim().equals("")
                && !password.getText().toString().trim().equals("")){
                    Intent com = new Intent(Login.this, Route.class);
                    startActivity(com);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please enter your username and password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
