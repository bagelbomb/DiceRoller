package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.roll_button);

        rollButton.setText("Let's Roll");

        // Lambda only works with compatibility set to Java 8, hope that doesn't cause problems
        rollButton.setOnClickListener(e -> {
            rollDice();
        });
    }

    public void rollDice() {

        TextView resultText = findViewById(R.id.result_text);
        int randomInt = new Random().nextInt(6) + 1;

        resultText.setText(Integer.toString(randomInt));

    }
}
