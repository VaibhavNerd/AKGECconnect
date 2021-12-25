package com.vaibhav.AKGECchat.Screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.vaibhav.AKGECchat.Activities.MainActivity;
import com.vaibhav.AKGECchat.R;

public class DashBoard extends AppCompatActivity {
    RelativeLayout myProfile,myCollege,myAcademics,myEntertainment,feedback,chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        myCollege=findViewById(R.id.myCollege);
        myProfile=findViewById(R.id.myProfile);
        myAcademics=findViewById(R.id.myAcademics);
        myEntertainment=findViewById(R.id.myEntertainment);
        feedback=findViewById(R.id.feedback);
        chat = findViewById(R.id.chat);

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Profile.class));

            }
        });
        myCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MyCollege.class));

            }
        });
        myAcademics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Section.class));

            }
        });
        myEntertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),iSangeet.class));

            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FeedBack.class));

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