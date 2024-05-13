package com.example.androidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.DialogInterface;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;


public class MenuExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choice_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mItemChange) {
            Toast.makeText(this,"Edit Object Item is clicked", Toast.LENGTH_SHORT).show();
        } else if(item.getItemId() == R.id.mItemReset) {
            Toast.makeText(this, "Reset Object Item is clicked")

    }
}