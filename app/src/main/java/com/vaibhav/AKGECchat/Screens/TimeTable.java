package com.vaibhav.AKGECchat.Screens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.vaibhav.AKGECchat.R;
import com.vaibhav.AKGECchat.databinding.ActivityProfileBinding;
import com.vaibhav.AKGECchat.databinding.ActivityTimeTableBinding;

public class TimeTable extends AppCompatActivity {

    FirebaseStorage storage;
    DatabaseReference database;
    ActivityTimeTableBinding binding;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimeTableBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
       // setContentView(R.layout.activity_time_table);

        fAuth = FirebaseAuth.getInstance();
        fAuth.getCurrentUser();
        //   setSupportActionBar(binding.toolbar);

        database = FirebaseDatabase.getInstance().getReference();
        storage = FirebaseStorage.getInstance();

        PhotoView photoView = (PhotoView)
                binding.photoView;


        database

                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()) {

                            String TimeTable = snapshot.child("TimeTable").getValue(String.class);
                            Glide.with(TimeTable.this).load(TimeTable)
                                    .placeholder(R.drawable.avatar)
                                    .fitCenter()

                                    .into(binding.photoView);
                            Log.d("myTag", TimeTable);

                        } else {

                        }




    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }

            });
    }

}