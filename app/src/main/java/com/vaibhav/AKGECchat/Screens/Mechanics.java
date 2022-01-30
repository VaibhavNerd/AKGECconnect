package com.vaibhav.AKGECchat.Screens;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.vaibhav.AKGECchat.R;


public class Mechanics extends AppCompatActivity {
    RelativeLayout joinMech,pdfMech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanics);
        joinMech=findViewById(R.id.joinMech);
        pdfMech=findViewById(R.id.pdfMech);
        joinMech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1zZDED1dzoCDg48uf6MMtHezSRrzBJedV/view";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        pdfMech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),DocsM2.class));

            }
        });
    }
}