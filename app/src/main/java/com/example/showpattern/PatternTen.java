package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternTen extends AppCompatActivity {

    Button p10Logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_ten);

        Intent i = getIntent();

        p10Logic = (Button) findViewById(R.id.p10Logic);
        p10Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PatternTen.this, ShowLogic10.class);
                startActivity(i);

                Toast.makeText(PatternTen.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}