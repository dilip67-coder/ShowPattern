package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern6 extends AppCompatActivity {

     Button npLogic6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern6);

        Intent i = getIntent();

        npLogic6 = (Button)findViewById(R.id.npLogic6);
        npLogic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent i = new Intent(NumericPattern6.this, NumericLogic6.class);
            startActivity(i);

                Toast.makeText(NumericPattern6.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}