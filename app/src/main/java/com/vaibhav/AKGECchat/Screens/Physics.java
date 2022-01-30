package com.vaibhav.AKGECchat.Screens;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.vaibhav.AKGECchat.R;


public class Physics extends AppCompatActivity {
    RelativeLayout joinPhysics,pdfPhy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        joinPhysics=findViewById(R.id.joinPhysics);
        pdfPhy=findViewById(R.id.pdfPhy);
        joinPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1r1oyRK-whYgmDul8oz-aiF-2KHgKeHbe/view";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        pdfPhy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),DocsP.class));

            }
        });
    }
}