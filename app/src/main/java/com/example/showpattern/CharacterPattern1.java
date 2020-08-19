package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CharacterPattern1 extends AppCompatActivity {

    Button cpLogic1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_pattern1);

        Intent i = getIntent();

        cpLogic1 = (Button)findViewById(R.id.cpLogic1);
        cpLogic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CharacterPattern1.this, CharacterLogic1.class);
                startActivity(i);

                Toast.makeText(CharacterPattern1.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}