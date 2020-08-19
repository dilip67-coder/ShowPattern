package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CharacterPattern4 extends AppCompatActivity {

     Button cpLogic4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_pattern4);

        Intent i = getIntent();

        cpLogic4 = (Button)findViewById(R.id.cpLogic4);
        cpLogic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            
                Intent i = new Intent(CharacterPattern4.this, CharacterLogic4.class);
                startActivity(i);

                Toast.makeText(CharacterPattern4.this, "All The Best", Toast.LENGTH_SHORT).show();
            }
        });
    }
}