package com.example.nategandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    TextView texte2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= findViewById(R.id.bottom);
        texte2= findViewById(R.id.nateg);

        /*btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }

         */
        };

    public void FromXml(View view) {

        Intent myintent = new Intent(MainActivity.this , Second.class);
        MainActivity.this.startActivity(myintent);
    }
}