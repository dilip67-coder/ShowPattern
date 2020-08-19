package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternTwo extends AppCompatActivity {

    Button p2Logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_two);

        Intent i = getIntent();

        p2Logic = (Button)findViewById(R.id.p2Logic);
        p2Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(PatternTwo.this, "All The Best", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(PatternTwo.this, ShowLogic2.class);
                startActivity(intent);
            }
        });
    }
}