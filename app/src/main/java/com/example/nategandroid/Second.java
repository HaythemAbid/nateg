package com.example.nategandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Second extends AppCompatActivity {
    private ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        photo= findViewById(R.id.imageView);
        photo.setImageResource(R.drawable.download);


    }
}