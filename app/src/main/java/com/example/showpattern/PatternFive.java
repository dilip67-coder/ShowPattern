package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternFive extends AppCompatActivity {

     Button p5Logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_five);

        Intent i = getIntent();

        p5Logic = (Button)findViewById(R.id.p5Logic);
        p5Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(PatternFive.this, ShowLogic5.class);
                startActivity(i);

                Toast.makeText(PatternFive.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });

    }
}