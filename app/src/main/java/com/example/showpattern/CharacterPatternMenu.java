package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CharacterPatternMenu extends AppCompatActivity {

    Button Cbtn1, Cbtn2, Cbtn3, Cbtn4, Cbtn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_pattern_menu);

        Intent i = getIntent();
        
        Cbtn1 = (Button)findViewById(R.id.Cbtn1);
        Cbtn2 = (Button)findViewById(R.id.Cbtn2);
        Cbtn3 = (Button)findViewById(R.id.Cbtn3);
        Cbtn4 = (Button)findViewById(R.id.Cbtn4);
        Cbtn5 = (Button)findViewById(R.id.Cbtn5);
        
        Cbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cp1 = new Intent(CharacterPatternMenu.this, CharacterPattern1.class);
                startActivity(cp1);

                Toast.makeText(CharacterPatternMenu.this, "Right Alphabetic triangle ", Toast.LENGTH_SHORT).show();
            }
        });
        Cbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cp2 = new Intent(CharacterPatternMenu.this, CharacterPattern2.class);
                startActivity(cp2);

                Toast.makeText(CharacterPatternMenu.this, "Horizontal Alphabet/ Character Pattern", Toast.LENGTH_SHORT).show();
            }
        });
        Cbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CharacterPatternMenu.this, CharacterPattern3.class);
                startActivity(i);

                Toast.makeText(CharacterPatternMenu.this, "K Shape Character Pattern",Toast.LENGTH_SHORT).show();
            }
        });

        Cbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CharacterPatternMenu.this, CharacterPattern4.class);
                startActivity(i);
                Toast.makeText(CharacterPatternMenu.this, "Triangle Character Pattern",Toast.LENGTH_SHORT).show();
            }
        });

        Cbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CharacterPatternMenu.this, CharacterPattern5.class);
                startActivity(i);
                Toast.makeText(CharacterPatternMenu.this, "Character Diamond Pattern",Toast.LENGTH_SHORT).show();

            }
        });
        
    }
}