package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MapsExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        String mapsUrl = getIntent().getStringExtra("geo:0,0?q=7.825890691028918, 123.4418178766062(Label)");
    }
}