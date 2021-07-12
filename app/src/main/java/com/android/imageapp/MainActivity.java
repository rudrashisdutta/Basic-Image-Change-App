package com.android.imageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    Button img1;
    Button img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=(ImageView)findViewById(R.id.imageView);
        img1=(Button)findViewById(R.id.image1);
        img2=(Button)findViewById(R.id.image2);
        img1.setOnClickListener(view -> image.setImageResource(R.drawable.github));
        img2.setOnClickListener(view -> image.setImageResource(R.drawable.peach));
    }
}