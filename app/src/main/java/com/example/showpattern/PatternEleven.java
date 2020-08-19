package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternEleven extends AppCompatActivity {

     Button p11Logic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_eleven);

        Intent i = getIntent();

        p11Logic =(Button)findViewById(R.id.p11Logic);
        p11Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(PatternEleven.this, ShowLogic11.class);
                startActivity(i);

                Toast.makeText(PatternEleven.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}