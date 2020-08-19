package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CharacterPattern3 extends AppCompatActivity {

    Button cpLogic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_pattern3);

        Intent i = getIntent();
        cpLogic3 = findViewById(R.id.cpLogic3);
        cpLogic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CharacterPattern3.this, characterLogic3.class);
                startActivity(i);

                Toast.makeText(CharacterPattern3.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}