package com.example.madmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dessertcol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessertcol);
    }

    public void breakfast(View view) {
        Intent i1=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i1);

    }

    public void pancake(View view) {
        Intent i1=new Intent(getApplicationContext(),pancakerec.class);
        startActivity(i1);
    }

    public void donut(View view) {
        Intent i1=new Intent(getApplicationContext(),donutrec.class);
        startActivity(i1);
    }

    public void gulab(View view) {
        Intent i1=new Intent(getApplicationContext(),gulabrec.class);
        startActivity(i1);
    }

    public void kheer(View view) {
        Intent i1=new Intent(getApplicationContext(),kheerrec.class);
        startActivity(i1);
    }

    public void maincor(View view) {
        Intent i1=new Intent(getApplicationContext(),maincoursecol.class);
        startActivity(i1);

    }
}
