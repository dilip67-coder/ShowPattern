package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPatternMenu extends AppCompatActivity {

    Button nbtn1, nbtn2, nbtn3, nbtn4, nbtn5, nbtn6, nbtn7, nbtn8, nbtn9, nbtn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern_menu);

        Intent i = getIntent();
        
        nbtn1 = (Button)findViewById(R.id.Nbtn1);
        nbtn2 = (Button)findViewById(R.id.Nbtn2);
        nbtn3 = (Button)findViewById(R.id.Nbtn3);
        nbtn4 = (Button)findViewById(R.id.Nbtn4);
        nbtn5 = (Button)findViewById(R.id.Nbtn5);
        nbtn6 = (Button)findViewById(R.id.Nbtn6);
        nbtn7 = (Button)findViewById(R.id.Nbtn7);
        nbtn8 = (Button)findViewById(R.id.Nbtn8);
        nbtn9 = (Button)findViewById(R.id.Nbtn9);
        nbtn10 = (Button)findViewById(R.id.Nbtn10);
        
        nbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent np1 = new Intent(NumericPatternMenu.this, NumericPattern1.class);
                startActivity(np1);

                Toast.makeText(NumericPatternMenu.this, "Simple Number Program", Toast.LENGTH_SHORT).show();
            }
        });
        nbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent np2 = new Intent(NumericPatternMenu.this, NumericPattern2.class);
                startActivity(np2);

                Toast.makeText(NumericPatternMenu.this, "Serial Number Pattern", Toast.LENGTH_SHORT).show();
            }
        });
        nbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent np3 = new Intent(NumericPatternMenu.this, NumericPattern3.class);
                startActivity(np3);

                Toast.makeText(NumericPatternMenu.this, "Pascal’s Triangle Program", Toast.LENGTH_SHORT).show();
            }
        });
        nbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent np4 = new Intent(NumericPatternMenu.this, NumericPattern4.class);
                startActivity(np4);

                Toast.makeText(NumericPatternMenu.this, "Diamond Pattern Program", Toast.LENGTH_SHORT).show();
            }
        });
        
        nbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent np5 = new Intent(NumericPatternMenu.this, NumericPattern5.class);
                startActivity(np5);

                Toast.makeText(NumericPatternMenu.this, "Horizontal Number Pattern", Toast.LENGTH_SHORT).show();
            }
        });

        nbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent np6 = new Intent(NumericPatternMenu.this, NumericPattern6.class);
                startActivity(np6);

                Toast.makeText(NumericPatternMenu.this, "Descending order Pattern", Toast.LENGTH_SHORT).show();
            }
        });
        nbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent np7 = new Intent(NumericPatternMenu.this, NumericPattern7.class);
                startActivity(np7);

                Toast.makeText(NumericPatternMenu.this, "Right Triangle Numeric Pattern", Toast.LENGTH_SHORT).show();
            }
        });
        nbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent np8 = new Intent(NumericPatternMenu.this, NumericPattern8.class);
                startActivity(np8);

                Toast.makeText(NumericPatternMenu.this, "Binary Number Pattern", Toast.LENGTH_SHORT).show();
                
            }
        });
        nbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent np9 = new Intent(NumericPatternMenu.this, NumericPattern9.class);
                startActivity(np9);

                Toast.makeText(NumericPatternMenu.this, "Zeros/ones triangle Pattern Programs", Toast.LENGTH_SHORT).show();
            }
        });
        nbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent np10 = new Intent(NumericPatternMenu.this, NumericPattern10.class);
                startActivity(np10);

                Toast.makeText(NumericPatternMenu.this, "Diamond Numeric Pattern", Toast.LENGTH_SHORT).show();
            }
        });
        
        
    }
}