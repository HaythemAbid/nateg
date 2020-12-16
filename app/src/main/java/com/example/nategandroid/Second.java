package com.example.nategandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Second extends AppCompatActivity {
    private ImageView photo;
    Button btn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        photo= findViewById(R.id.imageView);
        photo.setImageResource(R.drawable.download);
        btn2= findViewById(R.id.button);


    }
    public void tonext(View view) {

        Intent myintent2 = new Intent(Second.this , third.class);
        Second.this.startActivity(myintent2);
    }
}