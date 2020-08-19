package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternFour extends AppCompatActivity {

    Button p4Logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_four);

        Intent i = getIntent();

        p4Logic = (Button)findViewById(R.id.p4Logic);
        p4Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(PatternFour.this, ShowLogic4.class);
                startActivity(i);

                Toast.makeText(PatternFour.this, "All THe Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}