package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern8 extends AppCompatActivity {

    Button npLogic8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern8);

        Intent i = getIntent();

        npLogic8 = (Button)findViewById(R.id.npLogic8);
        npLogic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(NumericPattern8.this, NumericLogic8.class);
            startActivity(i);

                Toast.makeText(NumericPattern8.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });

    }
}