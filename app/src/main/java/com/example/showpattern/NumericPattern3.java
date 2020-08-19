package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern3 extends AppCompatActivity {

    Button npLogic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern3);

        Intent i = getIntent();

        npLogic3 = (Button)findViewById(R.id.npLogic3);
        npLogic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(NumericPattern3.this, NumericLogic3.class);
                startActivity(i);

                Toast.makeText(NumericPattern3.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}