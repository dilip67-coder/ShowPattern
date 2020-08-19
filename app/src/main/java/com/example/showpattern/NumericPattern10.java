package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumericPattern10 extends AppCompatActivity {


        Button npLogic10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_pattern10);


        Intent i = getIntent();

        npLogic10 = (Button)findViewById(R.id.npLogic10);
        npLogic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(NumericPattern10.this, NumericLogic10.class);
                startActivity(i);

                Toast.makeText(NumericPattern10.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}