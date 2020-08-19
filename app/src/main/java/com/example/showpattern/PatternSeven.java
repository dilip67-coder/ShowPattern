package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternSeven extends AppCompatActivity {

    Button p7Logic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_seven);

        Intent i = getIntent();

        p7Logic = (Button)findViewById(R.id.p7Logic);
        p7Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(PatternSeven.this, ShowLogic7.class);
                startActivity(i);

                Toast.makeText(PatternSeven.this, "All The Best", Toast.LENGTH_SHORT).show();

            }
        });

    }
}