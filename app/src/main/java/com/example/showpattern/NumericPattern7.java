package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern7 extends AppCompatActivity {

    Button npLogic7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern7);

        Intent i = getIntent();

        npLogic7 = (Button)findViewById(R.id.npLogic7);
        npLogic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(NumericPattern7.this, NumericLogic7.class);
                startActivity(i);

                Toast.makeText(NumericPattern7.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}