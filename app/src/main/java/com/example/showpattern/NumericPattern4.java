package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern4 extends AppCompatActivity {

    Button npLogic4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern4);

        Intent i = getIntent();

        npLogic4 = (Button)findViewById(R.id.npLogic4);
        npLogic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(NumericPattern4.this, NumericLogic4.class);
                startActivity(i);

                Toast.makeText(NumericPattern4.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}