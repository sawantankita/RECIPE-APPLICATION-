package com.example.madmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pasta(View view) {
        Intent i1=new Intent(getApplicationContext(),pastarec.class);
        startActivity(i1);

    }

    public void sandwich(View view) {
        Intent i1=new Intent(getApplicationContext(),sandrec.class);
        startActivity(i1);

    }

    public void poha(View view) {
        Intent i1=new Intent(getApplicationContext(),poharec.class);
        startActivity(i1);
    }

    public void dosa(View view) {
        Intent i1=new Intent(getApplicationContext(),dosarec.class);
        startActivity(i1);
    }

    public void dessert(View view) {
        Intent i1=new Intent(getApplicationContext(),dessertcol.class);
        startActivity(i1);
    }

    public void maincor(View view) {
        Intent i1=new Intent(getApplicationContext(),maincoursecol.class);
        startActivity(i1);
    }
}
