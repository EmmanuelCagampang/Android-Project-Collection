package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class Connect3Exercise extends AppCompatActivity {

    private static final int BOARD_SIZE = 5;
    private int[][] board; // 0: Empty, 1: Player 1, 2: Player 2
    private boolean player1Turn = true;
    private TextView turnIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect3_exercise);

        // Initialize the board
        board = new int[BOARD_SIZE][BOARD_SIZE];
        turnIndicator = findViewById(R.id.turnIndicator);

        // Set up button click listeners for each cell
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                final int currentRow = row; // Create a copy of row
                final int currentCol = col; // Create a copy of col
                Button cellButton = findViewById(getResources().getIdentifier("button_" + currentRow + "_" + currentCol, "id", getPackageName()));
                cellButton.setOnClickListener(view -> onCellClick(currentRow, currentCol));
            }
        }


        updateTurnIndicator();
    }



    private void onCellClick(int row, int col) {
        if (board[row][col] == 0) {
            board[row][col] = player1Turn ? 1 : 2;
            // Update UI (set background color or image for the button)
            updateCellUI(row, col);
            // Check for a win
            if (checkForWin(row, col)) {
                String winner = player1Turn ? "Player 1" : "Player 2";
                Toast.makeText(this, winner + " wins!", Toast.LENGTH_SHORT).show();
                // Disable further clicks
                disableAllCells();
            } else {
                player1Turn = !player1Turn;
                updateTurnIndicator();
            }
        } else {
            Toast.makeText(this, "Cell already occupied!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean checkForWin(int row, int col) {

        return false;
    }

    private void updateTurnIndicator() {
        String currentPlayer = player1Turn ? "Player 1" : "Player 2";
        if (turnIndicator != null) {
            turnIndicator.setText(getString(R.string.turn_indicator, currentPlayer));
        }
    }

    private void updateCellUI(int row, int col) {

    }

    private void disableAllCells() {

    }


    public void onResetClick(View view) {

        resetBoard();
    }
}