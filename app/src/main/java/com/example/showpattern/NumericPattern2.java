package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern2 extends AppCompatActivity {

     Button numericLogic2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern2);

        Intent i = getIntent();

        numericLogic2 = (Button)findViewById(R.id.numericLogic2);
        numericLogic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(NumericPattern2.this, NumericLogic2.class);
                startActivity(i);

                Toast.makeText(NumericPattern2.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}