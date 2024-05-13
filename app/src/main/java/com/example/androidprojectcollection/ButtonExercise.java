package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ButtonExercise extends AppCompatActivity {

    Button buttonDisplayToast;
    Button buttonChangeButtonBg;
    Button buttonChangeBg;
    Button buttonInvisible;
    Button buttonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        buttonDisplayToast = (Button) findViewById(R.id.button4);
        buttonDisplayToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "This is my Toast BRUH!.", Toast.LENGTH_LONG).show();
            }
        });

        buttonChangeButtonBg = (Button) findViewById(R.id.button6);
        buttonChangeButtonBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonChangeButtonBg.setBackgroundColor(Color.parseColor("#40E0D0"));
            }
        });

        buttonChangeBg = (Button) findViewById(R.id.button11);
        ConstraintLayout bg1;
        bg1 = (ConstraintLayout) findViewById(R.id.bg1);
        buttonChangeBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bg1.setBackgroundColor(Color.parseColor("#DFFF00"));
            }
        });

        buttonInvisible = (Button) findViewById(R.id.button13);
        buttonInvisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonInvisible.setVisibility(View.INVISIBLE);
            }
        });

        buttonFinish = (Button) findViewById(R.id.button12);
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}