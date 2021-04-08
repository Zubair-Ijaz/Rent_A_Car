package com.zubair.rent_a_car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    Button btnSave, btnCancel;
    EditText editTextUsername, editTextContact, editTextAddress, editTextCarName, editTextCarNumber, editTextRentingDate, editTextRentingTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        init();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username,contact, address, carName, carNumber, rentingDate, rentingTime;
                username = editTextUsername.getText().toString().trim();
                contact = editTextContact.getText().toString().trim();
                address = editTextAddress.getText().toString().trim();
                carName = editTextCarName.getText().toString().trim();
                carNumber = editTextCarNumber.getText().toString().trim();
                rentingDate = editTextRentingDate.getText().toString().trim();
                rentingTime = editTextRentingTime.getText().toString().trim();
                Intent intent = new Intent(RegistrationActivity.this, com.zubair.rent_a_car.ViewActivity.class);
                intent.putExtra("keyUsername", username);
                intent.putExtra("keyContact", contact);
                intent.putExtra("keyAddress", address);
                intent.putExtra("keyCarName", carName);
                intent.putExtra("keyCarNumber", carNumber);
                intent.putExtra("keyDate", rentingDate);
                intent.putExtra("keyTime", rentingTime);
                startActivity(intent);
                finish();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, com.zubair.rent_a_car.MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void init() {
        editTextUsername = findViewById(R.id.editTextName);
        editTextContact = findViewById(R.id.editTextContact);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextCarName = findViewById(R.id.editTextCarName);
        editTextCarNumber = findViewById(R.id.editTextCarNumber);
        editTextRentingDate = findViewById(R.id.editTextDate);
        editTextRentingTime = findViewById(R.id.editTextTime);

        btnSave = findViewById(R.id.btnSave);
        btnCancel = findViewById(R.id.btnCancel);
    }
}