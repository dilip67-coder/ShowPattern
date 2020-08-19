package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern1 extends AppCompatActivity {

    Button nPatternLogic1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern1);

        Intent i = getIntent();

        nPatternLogic1 = (Button)findViewById(R.id.NpatternLogic1);
        nPatternLogic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(NumericPattern1.this, NumericLogic1.class);
                startActivity(i);

                Toast.makeText(NumericPattern1.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}