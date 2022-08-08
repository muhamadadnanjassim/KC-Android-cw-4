package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Calculator
        CardView C1 = findViewById(R.id.C1);
        TextView T1 = findViewById(R.id.T1);

    //Total and استاذ محمد الهاشمي
        TextView T2 = findViewById(R.id.T2);
        TextView T3 = findViewById(R.id.T3);
        TextView T4 = findViewById(R.id.T4);

    //Plaintext
        CardView C2 = findViewById(R.id.C2);
        EditText PT1 = findViewById(R.id.PT1);

        CardView C3 = findViewById(R.id.C3);
        EditText PT2 = findViewById(R.id.PT2);

        //quick calculate
        Button B5 = findViewById(R.id.B5);

    //+-...
        Button B1 = findViewById(R.id.B1);
        Button B2 = findViewById(R.id.B2);
        Button B3 = findViewById(R.id.B3);
        Button B4 = findViewById(R.id.B4);


        //Math equation
        //+
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(PT1.getText().toString());
                int num2 = Integer.parseInt(PT2.getText().toString());

                int  result = num1 + num2;

        T4.setText(String.valueOf(result));
            }
        });

        //-
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(PT1.getText().toString());
                int num2 = Integer.parseInt(PT2.getText().toString());

                int  result = num1 - num2;

        T4.setText(String.valueOf(result));
            }
        });

        //*
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(PT1.getText().toString());
                int num2 = Integer.parseInt(PT2.getText().toString());

                int  result = num1 * num2;

        T4.setText(String.valueOf(result));
            }
        });

        //\
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int num1 = Integer.parseInt(PT1.getText().toString());
                 int num2 = Integer.parseInt(PT2.getText().toString());

                 int  result = num1 / num2;

        T4.setText(String.valueOf(result));
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int num1 = Integer.parseInt(PT1.getText().toString());
                 int num2 = Integer.parseInt(PT2.getText().toString());

                 int  result = num1 + num2;

        T4.setText(String.valueOf(result));
            }
        });
    }
}