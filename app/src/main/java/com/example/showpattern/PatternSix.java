package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternSix extends AppCompatActivity {

     Button p6Logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_six);

        Intent i = getIntent();

        p6Logic = (Button)findViewById(R.id.p6Logic);
        p6Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PatternSix.this, ShowLogic6.class);
                startActivity(i);

                Toast.makeText(PatternSix.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}