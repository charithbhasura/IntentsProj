package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView num_1,num_2, ans;
    String String_1, String_2;
    int Number_1, Number_2,Number_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num_1 = (TextView) findViewById(R.id.editTextNumber3);
        num_2 = (TextView) findViewById(R.id.editTextNumber4);
        ans = (TextView) findViewById(R.id.txtans);

        num_1.setText(getIntent().getStringExtra("Num1"));
        num_2.setText(getIntent().getStringExtra("Num2"));

        String_1 = num_1.getText().toString();
        String_2 = num_2.getText().toString();

        Number_1 = Integer.parseInt(String_1);
        Number_2 = Integer.parseInt(String_2);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_3 = Number_1 + Number_2;
                ans.setText(Number_1 + " + " +Number_2+" = "+ Number_3);
        }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Number_1>Number_2){
                    Number_3 = Number_1 - Number_2;
                    ans.setText(Number_1 + " - " +Number_2+" = "+ Number_3);
                }else{
                    Number_3 = Number_2 - Number_1;
                    ans.setText(Number_2 + " - " +Number_1+" = "+ Number_3);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_3 = Number_1 / Number_2;
                ans.setText(Number_1 + " / " +Number_2+" = "+ Number_3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_3 = Number_1 * Number_2;
                ans.setText(Number_1 + " * " +Number_2+" = "+ Number_3);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}