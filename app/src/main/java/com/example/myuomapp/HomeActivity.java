package com.example.myuomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button eClassBtn;
    Button studentsWebBtn;
    Button eudoxusBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViews();

        eClassBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebActivity.class);
            intent.putExtra("url", getString(R.string.e_classroom_url));
            startActivity(intent);
        });

        studentsWebBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebActivity.class);
            intent.putExtra("url", getString(R.string.students_portal_url));
            startActivity(intent);
        });

        eudoxusBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebActivity.class);
            intent.putExtra("url", getString(R.string.eudoxus_url));
            startActivity(intent);
        });
    }

    private void findViews() {
        studentsWebBtn = (Button) findViewById(R.id.services_btn_1);
        eClassBtn = (Button) findViewById(R.id.services_btn_2);
        eudoxusBtn = (Button) findViewById(R.id.services_btn_3);
    }
}