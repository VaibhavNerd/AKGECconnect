package com.vaibhav.AKGECchat.Screens;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.vaibhav.AKGECchat.R;

public class Ai extends AppCompatActivity {
    RelativeLayout joinAi,pdfAi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        joinAi=findViewById(R.id.joinAi);
        pdfAi=findViewById(R.id.pdfAi);
        joinAi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.akgec.ac.in/wp-content/uploads/2021/11/RAGHURAJ-SINGH.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        pdfAi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),DocsA.class));

            }
        });
    }
}