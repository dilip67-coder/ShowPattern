package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PatternNine extends AppCompatActivity {

    Button p9Logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_nine);

        Intent i = getIntent();

        p9Logic = (Button)findViewById(R.id.p9Logic);
        p9Logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(PatternNine.this, ShowLogic9.class);
                startActivity(i);

                Toast.makeText(PatternNine.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}