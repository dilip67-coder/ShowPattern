package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class patternOne extends AppCompatActivity {
    Button p1Logic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_one);

        Intent i = getIntent();
        p1Logic = (Button)findViewById(R.id.p1Logic);
        p1Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(patternOne.this, "All The Best", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(patternOne.this, ShowLogic1.class);
                    startActivity(i);

            }
        });
    }
}