package com.example.projekt_silownia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_poziom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poziom);
    }

    public void cwiczenie_start(View view)
    {

        Intent intent = new Intent(this, Activity_cwiczenie.class);
        startActivity(intent);

    }





}