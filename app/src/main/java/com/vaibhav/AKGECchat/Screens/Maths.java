package com.vaibhav.AKGECchat.Screens;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.vaibhav.AKGECchat.R;

;

public class Maths extends AppCompatActivity {
    RelativeLayout joinMath,pdfMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
        joinMath=findViewById(R.id.joinMath);
        pdfMath=findViewById(R.id.pdfMath);
        joinMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.akgec.ac.in/wp-content/uploads/2020/02/BINAYAK_PARASHAR_profile.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        pdfMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),DocsM.class));

            }
        });

    }

}