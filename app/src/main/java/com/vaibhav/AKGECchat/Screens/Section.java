package com.vaibhav.AKGECchat.Screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.vaibhav.AKGECchat.R;


public class Section extends AppCompatActivity {
    RelativeLayout mySection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);
        mySection=findViewById(R.id.mySection);
        mySection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),subjects.class));
            }
        });
    }
}