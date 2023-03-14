package com.example.myuomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button eClassBtn;
    Button studentsWebBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViews();

        eClassBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebActivity.class);
            intent.putExtra("url", "https://eclass.uom.gr/");
            startActivity(intent);
        });

        studentsWebBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebActivity.class);
            intent.putExtra("url", "https://services.uom.gr/unistudent/login.asp");
            startActivity(intent);
        });
    }

    private void findViews() {
        eClassBtn = (Button) findViewById(R.id.services_btn_1);
        studentsWebBtn = (Button) findViewById(R.id.services_btn_1);
    }
}