package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern9 extends AppCompatActivity {

    Button npLogic9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern9);

        Intent i = getIntent();

        npLogic9 = (Button)findViewById(R.id.npLogic9);
        npLogic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(NumericPattern9.this, NumericLogic9.class);
                    startActivity(i);

                Toast.makeText(NumericPattern9.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}