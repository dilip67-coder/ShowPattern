package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CharacterPattern2 extends AppCompatActivity {


    Button cpLogic2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_pattern2);

        Intent i = getIntent();

        cpLogic2 = (Button)findViewById(R.id.cpLogic2);
        cpLogic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(CharacterPattern2.this, CharacterLogic2.class);
                    startActivity(i);

                Toast.makeText(CharacterPattern2.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });

    }
}