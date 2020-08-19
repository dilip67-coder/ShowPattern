package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternTwelve extends AppCompatActivity {

    Button p12Logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_twelve);

        Intent i = getIntent();

        p12Logic = (Button)findViewById(R.id.p12Logic);
        p12Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(PatternTwelve.this, ShowLogic12.class);
                startActivity(i);

                Toast.makeText(PatternTwelve.this, "All The Best" , Toast.LENGTH_SHORT).show();

            }
        });

    }
}