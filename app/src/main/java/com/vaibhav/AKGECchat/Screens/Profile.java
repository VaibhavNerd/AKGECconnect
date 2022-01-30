package com.vaibhav.AKGECchat.Screens;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.vaibhav.AKGECchat.Activities.ChatActivity;
import com.vaibhav.AKGECchat.Activities.PhoneNumberActivity;
import com.vaibhav.AKGECchat.Models.User;
import com.vaibhav.AKGECchat.R;
import com.vaibhav.AKGECchat.databinding.ActivityPhoneNumberBinding;
import com.vaibhav.AKGECchat.databinding.ActivityProfileBinding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Profile extends AppCompatActivity {

    TextView fullName,email,phone;
    DatabaseReference database;
    FirebaseStorage storage;
    ActivityProfileBinding binding;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;

    String name ,PhoneNum;
    Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fAuth = FirebaseAuth.getInstance();
          fAuth.getCurrentUser();
     //   setSupportActionBar(binding.toolbar);

        database = FirebaseDatabase.getInstance().getReference();
        storage = FirebaseStorage.getInstance();

                String userid = fAuth.getUid();


                database.child("users")
                .child(userid)
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()) {
                             name = snapshot.child("name").getValue(String.class);
                            binding.profileName.setText(name);
                             PhoneNum = snapshot.child("phoneNumber").getValue(String.class);
                            binding.profilePhone.setText(PhoneNum);
                          String profileImage = snapshot.child("profileImage").getValue(String.class);
                            Glide.with(Profile.this).load(profileImage)
                                    .placeholder(R.drawable.avatar)
                                    .fitCenter()
                                    
                                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                                    .into(binding.profile);
                        } else {

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


        logout=findViewById(R.id.logout);

    }
    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), PhoneNumberActivity.class));
        finish();
    }
}