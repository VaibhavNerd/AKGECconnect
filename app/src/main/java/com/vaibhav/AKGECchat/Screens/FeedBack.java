package com.vaibhav.AKGECchat.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.vaibhav.AKGECchat.R;
import com.vaibhav.AKGECchat.databinding.ActivityFeedBackBinding;

public class FeedBack extends AppCompatActivity {
     ActivityFeedBackBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_feed_back);
        binding= ActivityFeedBackBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


          binding.buttSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=binding.editSubject.getText().toString();
                String b=binding.editFeedBack.getText().toString();

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_EMAIL,
                        new String[] { "vaibhav2012093@akgec.ac.in"});
                i.putExtra(Intent.EXTRA_SUBJECT,s);
                i.putExtra(Intent.EXTRA_TEXT, b);
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));

                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(FeedBack.this,
                            "There are no email clients installed.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}