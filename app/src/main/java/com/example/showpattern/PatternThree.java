package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternThree extends AppCompatActivity {
    Button p3Logic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_three);

        Intent i = getIntent();


        p3Logic = (Button)findViewById(R.id.p3Logic);
        p3Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PatternThree.this, ShowLogic3.class);
                startActivity(i);

                Toast.makeText(PatternThree.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });

    }
}