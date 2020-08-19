package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternEight extends AppCompatActivity {

    Button p8Logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_eight);

        Intent i = getIntent();

        p8Logic = (Button)findViewById(R.id.p8Logic);
        p8Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(PatternEight.this, ShowLogic8.class);
                startActivity(i);

                Toast.makeText(PatternEight.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}