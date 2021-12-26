package com.vaibhav.AKGECchat.Screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.vaibhav.AKGECchat.Activities.MainActivity;
import com.vaibhav.AKGECchat.R;

public class DashBoard2 extends AppCompatActivity {

    RelativeLayout Profile, College, Academics, Entertainment,  chat;
    ConstraintLayout feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board2);
        College = (RelativeLayout) findViewById(R.id.College);
        Profile = (RelativeLayout) findViewById(R.id.Profile);
        Academics = (RelativeLayout) findViewById(R.id.Academics);
        Entertainment = (RelativeLayout) findViewById(R.id.Entertainment);
        feedback = findViewById(R.id.feedback);
        chat = (RelativeLayout) findViewById(R.id.Connect);

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
                startActivity(new Intent(getApplicationContext(), Section.class));

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
    }
}