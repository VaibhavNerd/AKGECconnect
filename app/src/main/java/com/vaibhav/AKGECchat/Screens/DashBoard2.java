package com.vaibhav.AKGECchat.Screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.vaibhav.AKGECchat.Activities.MainActivity;
import com.vaibhav.AKGECchat.R;

import javax.security.auth.Subject;

public class DashBoard2 extends AppCompatActivity {

    RelativeLayout Profile, College, Academics, Entertainment,  chat, TimeTable;
    ConstraintLayout feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board2);
        College = (RelativeLayout) findViewById(R.id.college);
        Profile = (RelativeLayout) findViewById(R.id.Profile);
        Academics = (RelativeLayout) findViewById(R.id.academics);
        Entertainment = (RelativeLayout) findViewById(R.id.music);
        feedback = findViewById(R.id.feedback);
        chat = (RelativeLayout) findViewById(R.id.connect);
        TimeTable = findViewById(R.id.timeTable);

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Profile.class));

            }
        });
        College.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MyCollege.class));

            }
        });
        Academics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), subjects.class));

            }
        });
        Entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), iSangeet.class));

            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FeedBack.class));

            }
        });
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }
        });
       TimeTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TimeTable.class));

            }
        });

    }
}