package com.zubair.rent_a_car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextUsername, editTextEmail, editTextPassword;
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()){
                    String username, email, password;
                    username = editTextUsername.getText().toString().trim();
                    email = editTextEmail.getText().toString().trim();
                    password = editTextPassword.getText().toString();

                    Intent intent = new Intent(MainActivity.this, com.zubair.rent_a_car.RegistrationActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private boolean checkValidation() {
        boolean flag = true;
        if (editTextUsername.getText().toString().isEmpty()){
            editTextUsername.setError("Username can't be empty.");
            flag = false;
        }
        if (editTextEmail.getText().toString().isEmpty()){
            editTextEmail.setError("Email can't be empty.");
            flag = false;
        }
        if (editTextPassword.getText().toString().isEmpty()){
            editTextPassword.setError("Password can't be empty.");
            flag = false;
        }
        return flag;
    }

    private void init() {
        editTextUsername = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEMail);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);
    }
}