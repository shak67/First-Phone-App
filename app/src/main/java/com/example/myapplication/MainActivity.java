package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button AddBTn=(Button) findViewById(R.id.AddBtn);
        AddBTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText= (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText=(EditText) findViewById(R.id.SecondNumEditText);
                TextView resultTextView= (TextView) findViewById(R.id.ResultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());

                int result= num1+num2;

                resultTextView.setText(result+"");

            }
        });
    }
}