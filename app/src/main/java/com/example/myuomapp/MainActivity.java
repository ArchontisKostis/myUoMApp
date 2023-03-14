package com.example.myuomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner departmentSelectSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        departmentSelectSpinner = (Spinner) findViewById(R.id.department_select_spinner);
        departmentSelectSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedDepartment = departmentSelectSpinner
                        .getSelectedItem().toString();
                if(!selectedDepartment.equals("--- ΕΠΙΛΕΞΤΕ ΤΜΗΜΑ ---")) {
                    Log.d("MyUoM App", "Selected " + selectedDepartment + " Department.");

                    Log.d("MyUoM App", "Create and Start HomeActivity.");
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("department", selectedDepartment);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Do nothing
            }
        });

        Log.i("INFO", "MainActivity created");
    }
}