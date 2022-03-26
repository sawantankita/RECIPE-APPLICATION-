package com.example.madmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class maincoursecol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincoursecol);
    }

    public void breakfast(View view) {
        Intent i1=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i1);
    }

    public void dessert(View view) {
        Intent i1=new Intent(getApplicationContext(),dessertcol.class);
        startActivity(i1);
    }

    public void roll(View view) {
        Intent i1=new Intent(getApplicationContext(),rollrec.class);
        startActivity(i1);
    }

    public void butchick(View view) {
        Intent i1=new Intent(getApplicationContext(),butchicrec.class);
        startActivity(i1);
    }

    public void paneer(View view) {
        Intent i1=new Intent(getApplicationContext(),paneerrec.class);
        startActivity(i1);
    }

    public void dall(View view) {
        Intent i1=new Intent(getApplicationContext(),dalrec.class);
        startActivity(i1);
    }
}
