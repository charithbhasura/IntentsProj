package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button btn;
    String myString = "Sending Data";
    protected EditText editText_1, editText_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById((R.id.button));
        editText_1 = findViewById(R.id.editTextNumber1);
        editText_2 = findViewById(R.id.editTextNumber2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number_1 = editText_1.getText().toString();
                String number_2 = editText_2.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("Num1", number_1);
                intent.putExtra("Num2", number_2);

                Toast toast = Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG);
                toast.show();
                startActivity(intent);

            }
        });
    }

}