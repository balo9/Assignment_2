package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editTextTextPersonName;
Button clickButton;
TextView textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName=(EditText)findViewById(R.id.editTextTextPersonName);
        clickButton = (Button)findViewById(R.id.clickButton);
        textName=(TextView)findViewById(R.id.textName);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                String name= editTextTextPersonName.getText().toString();
                textName.setText("Hi "+name);
            }

        });
    }
}