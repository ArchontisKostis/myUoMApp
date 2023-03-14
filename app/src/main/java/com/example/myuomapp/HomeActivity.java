package com.example.myuomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button eClassBtn;
    Button studentsWebBtn;
    Button eudoxusBtn;
    Button universityWebsiteBtn;
    Button studentCareBtn;
    Button graduationBtn;
    Button libraryBtn;
    Button newsBtn;
    Button developerTeamBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find UI Components
        findViews();

        // Set listeners to the buttons
        setButtonOnClickListener(eClassBtn, getString(R.string.e_classroom_url));
        setButtonOnClickListener(studentsWebBtn, getString(R.string.students_portal_url));
        setButtonOnClickListener(eudoxusBtn, getString(R.string.eudoxus_url));
        setButtonOnClickListener(universityWebsiteBtn, getString(R.string.university_website_url));
        setButtonOnClickListener(studentCareBtn, getString(R.string.student_care_url));
        setButtonOnClickListener(graduationBtn, getString(R.string.graduation_url));
        setButtonOnClickListener(libraryBtn, getString(R.string.library_url));
        setButtonOnClickListener(newsBtn, getString(R.string.university_news_url));
        setButtonOnClickListener(developerTeamBtn, getString(R.string.developer_team_url));
    }

    private void findViews() {
        studentsWebBtn = (Button) findViewById(R.id.services_btn_1);
        eClassBtn = (Button) findViewById(R.id.services_btn_2);
        eudoxusBtn = (Button) findViewById(R.id.services_btn_3);

        universityWebsiteBtn = (Button) findViewById(R.id.uni_services_btn_1);
        studentCareBtn = (Button) findViewById(R.id.uni_services_btn_2);
        graduationBtn = (Button) findViewById(R.id.uni_services_btn_3);
        libraryBtn = (Button) findViewById(R.id.uni_services_btn_4);
        newsBtn = (Button) findViewById(R.id.uni_services_btn_5);

        developerTeamBtn = (Button) findViewById(R.id.more_btn_1);
    }

    private void setButtonOnClickListener(Button btn, String url){
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebActivity.class);
            intent.putExtra("url", url);
            startActivity(intent);
        });
    }
}