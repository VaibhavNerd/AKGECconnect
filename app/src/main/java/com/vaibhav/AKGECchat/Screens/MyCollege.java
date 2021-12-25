package com.vaibhav.AKGECchat.Screens;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.vaibhav.AKGECchat.R;

public class MyCollege extends AppCompatActivity {
    private SliderLayout sliderLayout;
    ImageView webAkg,webAktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_college);
        sliderLayout=findViewById(R.id.slider);
        webAkg=findViewById(R.id.webAkg);
        webAktu=findViewById(R.id.webAktu);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);
        setSliderViews();

        webAkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.akgec.ac.in/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        webAktu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://aktu.ac.in/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



    }
    private void setSliderViews() {
        for(int i=0;i<5;i++){
            DefaultSliderView sliderView=new DefaultSliderView(getApplicationContext());
            switch(i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/akgec-gzb.appspot.com/o/AKG%20SLIDER%20IMAGE%2Fakg1.jpg?alt=media&token=0acff646-523c-4f47-a702-aab892198dd1");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/akgec-gzb.appspot.com/o/AKG%20SLIDER%20IMAGE%2Fakg2.jpg?alt=media&token=d8403203-3886-48aa-9bb1-c1acca34df96");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/akgec-gzb.appspot.com/o/AKG%20SLIDER%20IMAGE%2Fakg3.jpg?alt=media&token=3d4a2fe9-ad23-41c9-a604-a0755844a05d");
                    break;
                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/akgec-gzb.appspot.com/o/AKG%20SLIDER%20IMAGE%2Fakg4.jpg?alt=media&token=604cbdd4-ecd7-44f9-914d-0b2a4601d28e");
                    break;
                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/akgec-gzb.appspot.com/o/AKG%20SLIDER%20IMAGE%2Fakg5.jpg?alt=media&token=07846089-5ef7-4375-a885-2d364d3e5d43");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }
    }
}