package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    Button btnButtonExercise;
    Button btnCalculatorExercise; // Button for the calculator exercise
    Button btnLayoutExercise;
    Button btnConnect3Exercise;
    Button btnPassingIntentsExercise;
    Button btnPassingIntentsExercise2;
    Button btnMenuExercise;
    Button btnMapsExercise;
    Button exitButton;
    AlertDialog dialog; // Declare the dialog variable here
    EditText input;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getString(R.string.display).equals(display.getText().toString()))
                    display.setText("");
            }
        });

        // Initialize the Button Exercise button and set an OnClickListener
        btnButtonExercise = (Button) findViewById(R.id.btnButtonExercise);
        btnButtonExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ButtonExercise.class);
                startActivity(intent);
            }
        });

        // Initialize the Calculator Exercise button and set an OnClickListener
        btnCalculatorExercise = (Button) findViewById(R.id.btnCalculatorExercise);
        btnCalculatorExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_calculator_exercise.class);
                startActivity(intent);
            }
        });

        // Initialize the Layout Exercise button and set an OnClickListener
        btnLayoutExercise = (Button) findViewById(R.id.btnLayoutExercise);
        btnLayoutExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LayoutExercise.class);
                startActivity(intent);
            }
        });

        btnConnect3Exercise = (Button) findViewById(R.id.btnConnect3Exercise);
        btnConnect3Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Connect3Exercise.class);
                startActivity(intent);
            }
        });

        btnPassingIntentsExercise = findViewById(R.id.btnPassingIntentsExercise);
        btnPassingIntentsExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent);
            }
        });

        btnPassingIntentsExercise2 = findViewById(R.id.btnPassingIntentsExercise2);
        btnPassingIntentsExercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PassingIntentsExercise2.class);
                startActivity(intent);
            }
        });

        btnMenuExercise = findViewById(R.id.btnMenuExercise);
        btnMenuExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuExercise.class);
                startActivity(intent);
            }
        });

        btnMapsExercise = findViewById(R.id.btnMapsExercise);
        btnMapsExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                setContentView(R.layout.activity_maps_exercise);

                Button btnGrillZone = findViewById(R.id.btnGrillZone);

                btnGrillZone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Uri gmmIntentUri = Uri.parse("geo:0,0?q=7.825890691028918, 123.4418178766062(Label)");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            //  7.825890691028918, 123.4418178766062 Grill ZOne
                            // Mount apo 6.9874700771987985, 125.27100560771241
                            startActivity(mapIntent);
                        }
                    }
                });



        // Initialize the Exit button and set an OnClickListener
        exitButton = (Button) findViewById(R.id.exit_button);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the dialog or directly exit the app
                // dialog.show(); // Uncomment if you want to show the dialog
                finish(); // Finish the current activity
            }
        });

        // Create an AlertDialog to ask the user if they want to exit
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish(); // Finish the current activity
                System.exit(0); // Exit the app
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); // Dismiss the dialog
            }
        });

        dialog = builder.create();
    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if (getString(R.string.display).equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        display.setSelection(cursorPos + 1);

    }

    public void zeroBTN(View view) {
        updateText("0");

    }
    public void oneBTN(View view) {
        updateText("1");

    }
    public void twoBTN(View view) {
        updateText("2");

    }
    public void threeBTN(View view) {
        updateText("3");

    }
    public void fourBTN(View view) {
        updateText("4");

    }
    public void fiveBTN(View view) {
        updateText("5");

    }
    public void sixBTN(View view) {
        updateText("6");

    }
    public void sevenBTN(View view) {
        updateText("7");

    }
    public void eightBTN(View view) {
        updateText("8");

    }
    public void nineBTN(View view) {
        updateText("9");

    }
    public void multiplyBTN(View view) {
        updateText("*");

    }
    public void divideBTN(View view) {
        updateText("/");

    }
    public void minusBTN(View view) {
        updateText("-");

    }
    public void plusBTN(View view) {
        updateText("+");

    }
    public void clearBTN(View view) {
        display.setText("");

    }
    public void parenthesesBTN(View view) {

    }
    public void exponentBTN(View view) {
        updateText("^");

    }
    public void plusMinusBTN(View view) {
        updateText("-");


    }
    public void decimalBTN(View view) {
        updateText(".");


    }

    public void equalsBTN(View view) {


    }
    public void backspaceBTN(View view) {


    }


}