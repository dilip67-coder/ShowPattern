package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button startButton, numericButton, characterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton= (Button)findViewById(R.id.StarButton);
        numericButton = (Button)findViewById(R.id.NumbericButton);
        characterButton = (Button)findViewById(R.id.CharacterButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent star = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(star);

                Toast.makeText(MainActivity.this, "Star Patterns", Toast.LENGTH_SHORT).show();
            }
        });

        numericButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        Intent numeric = new Intent(MainActivity.this, NumericPatternMenu.class);
        startActivity(numeric);

                Toast.makeText(MainActivity.this, "Numeric Patterns", Toast.LENGTH_SHORT).show();
            }
        });

        characterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent character = new  Intent(MainActivity.this, CharacterPatternMenu.class);
                startActivity(character);

                Toast.makeText(MainActivity.this, "Alphabet/ Character Patterns", Toast.LENGTH_SHORT).show();
            }
        });

    }
}