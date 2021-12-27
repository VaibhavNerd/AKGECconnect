package com.vaibhav.AKGECchat.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.ImageView;

import com.vaibhav.AKGECchat.R;
import com.vaibhav.AKGECchat.databinding.ActivitySubjectsBinding;

public class subjects extends AppCompatActivity {

  ActivitySubjectsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubjectsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

         binding.coaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Maths.class));

            }
        });
        binding.cssView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Physics.class));

            }
        });
        binding.dataStView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Mechanics.class));

            }
        });
        binding.disView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Ai.class));

            }
        });
        binding.electiveView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Electrical.class));

            }
        });
        binding.techView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SoftSkill.class));

            }
        });
    }
}