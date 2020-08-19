package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CharacterPattern5 extends AppCompatActivity {

    Button cpLogic5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_pattern5);

        Intent i = getIntent();

            cpLogic5 = (Button)findViewById(R.id.cpLogic5);
            cpLogic5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(CharacterPattern5.this, CharacterLogic5.class);
                    startActivity(i);

                    Toast.makeText(CharacterPattern5.this, "All The Best", Toast.LENGTH_SHORT).show();
                }
            });
    }
}