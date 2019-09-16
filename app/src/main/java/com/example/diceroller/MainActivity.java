package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView diceImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImage = findViewById(R.id.dice_image);
        Button rollButton = findViewById(R.id.roll_button);

        rollButton.setText("Let's Roll");

        // Lambda only works with compatibility set to Java 8 (1.8)
        // (Source Compatibility and Target Compatibility in Project Structure - Modules), hope
        // that doesn't cause problems
        rollButton.setOnClickListener(e -> {
            rollDice();
        });
    }

    public void rollDice() {

        int randomInt = new Random().nextInt(6) + 1;
        int drawableResource;

        switch (randomInt) {
            case 1:
                drawableResource = R.drawable.dice_1;
                break;
            case 2:
                drawableResource = R.drawable.dice_2;
                break;
            case 3:
                drawableResource = R.drawable.dice_3;
                break;
            case 4:
                drawableResource = R.drawable.dice_4;
                break;
            case 5:
                drawableResource = R.drawable.dice_5;
                break;
            default:
                drawableResource = R.drawable.dice_6;
        }

        diceImage.setImageResource(drawableResource);

    }
}
