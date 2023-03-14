package com.example.myuomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        loginButton = (Button) findViewById(R.id.login_btn);
//        loginButton.setOnClickListener(view -> {
//            Log.w("INFO", "Fake production sign in (MainActivity)");
//            Intent intent = new Intent(this, HomeActivity.class);
//            Log.i("INFO", "Start HomeActivity");
//            startActivity(intent);
//        });

        Log.i("INFO", "MainActivity created");
    }
}