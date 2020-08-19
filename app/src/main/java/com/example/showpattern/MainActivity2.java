package com.example.showpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);
        b10=(Button)findViewById(R.id.btn10);
        b11=(Button)findViewById(R.id.btn11);
        b12=(Button)findViewById(R.id.btn12);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(MainActivity2.this, patternOne.class);

                startActivity(i1);

                Toast.makeText(MainActivity2.this, "Simple Triangle", Toast.LENGTH_SHORT).show();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(MainActivity2.this, PatternTwo.class);
                startActivity(i2);

                Toast.makeText(MainActivity2.this, "Downward Triangle", Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity2.this, PatternThree.class);
                startActivity(i3);

                Toast.makeText(MainActivity2.this, "Left Triangle", Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(MainActivity2.this, PatternFour.class);
                startActivity(i4);

                Toast.makeText(MainActivity2.this, "PRight Triangle", Toast.LENGTH_SHORT).show();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(MainActivity2.this, PatternFive.class);
                startActivity(i5);

                Toast.makeText(MainActivity2.this, "Full Diamond Patter", Toast.LENGTH_SHORT).show();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i6 = new Intent(MainActivity2.this, PatternSix.class);
                startActivity(i6);

                Toast.makeText(MainActivity2.this, "LeftUpward triangle", Toast.LENGTH_SHORT).show();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i7 = new Intent(MainActivity2.this, PatternSeven.class);
                startActivity(i7);

                Toast.makeText(MainActivity2.this, "7th Triangle", Toast.LENGTH_SHORT).show();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i8 = new Intent(MainActivity2.this, PatternEight.class);
                startActivity(i8);

                Toast.makeText(MainActivity2.this, "Right down Mirror Star Pattern", Toast.LENGTH_SHORT).show();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i9 = new Intent(MainActivity2.this, PatternNine.class);
                startActivity(i9);

                Toast.makeText(MainActivity2.this, "Right Pascal’s Triangle", Toast.LENGTH_SHORT).show();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i10 = new Intent(MainActivity2.this, PatternTen.class);
                startActivity(i10);

                Toast.makeText(MainActivity2.this, "Left Triangle Pascal’s", Toast.LENGTH_SHORT).show();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i11 = new Intent(MainActivity2.this, PatternEleven.class);
                startActivity(i11);

                Toast.makeText(MainActivity2.this, "Sandglass Star Pattern", Toast.LENGTH_SHORT).show();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i12 = new Intent(MainActivity2.this, PatternTwelve.class);
                startActivity(i12);

                Toast.makeText(MainActivity2.this, "Diamond Star Pattern", Toast.LENGTH_SHORT).show();
            }
        });
    }
}