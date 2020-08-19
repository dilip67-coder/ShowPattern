package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern5 extends AppCompatActivity {

    Button npLogic5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern5);

        Intent i = getIntent();

        npLogic5= (Button)findViewById(R.id.npLogic5);
        npLogic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent i = new Intent(NumericPattern5.this, NumericLogic5.class);
               startActivity(i);

                Toast.makeText(NumericPattern5.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}