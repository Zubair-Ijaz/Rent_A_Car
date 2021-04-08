package com.zubair.rent_a_car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView textViewUsername, textViewContact, textViewAddress, textViewCarName, textViewCarNumber, textViewRentingDate, textViewRentingTime;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        init();

        Intent intent = getIntent();
        setValues(intent);
    }

    private void setValues(Intent intent) {

        String getName = intent.getStringExtra("keyUsername");
        this.textViewUsername.setText(getName);
        String getContact = intent.getStringExtra("keyContact");
        this.textViewContact.setText(getContact);
        String getAddress = intent.getStringExtra("keyAddress");
        this.textViewAddress.setText(getAddress);
        String getCarName = intent.getStringExtra("keyCarName");
        this.textViewCarName.setText(getCarName);
        String getCarNumber = intent.getStringExtra("keyCarNumber");
        this.textViewCarNumber.setText(getCarNumber);
        String getDate = intent.getStringExtra("keyDate");
        this.textViewRentingDate.setText(getDate);
        String getTime = intent.getStringExtra("keyTime");
        this.textViewRentingTime.setText(getTime);
    }

    private void init() {
        textViewUsername = findViewById(R.id.textViewUsername);
        textViewContact = findViewById(R.id.textViewContact);
        textViewAddress = findViewById(R.id.textViewAddress);
        textViewCarName = findViewById(R.id.textViewCarName);
        textViewCarNumber = findViewById(R.id.textViewCarNumber);
        textViewRentingDate = findViewById(R.id.textViewDate);
        textViewRentingTime = findViewById(R.id.textViewTime);

        btnBack = findViewById(R.id.btnBack);
    }
}