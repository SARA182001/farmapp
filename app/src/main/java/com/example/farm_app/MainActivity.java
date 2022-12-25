package com.example.farm_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText us, ps;

    Button log, REGISTER;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        us = (EditText) findViewById(R.id.un1);
        ps = (EditText) findViewById(R.id.ps1);
        log = (Button) findViewById(R.id.Log);
        REGISTER=(Button) findViewById(R.id.REGISTER);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (us.getText().toString().isEmpty()|| ps.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Sum Data is not add", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();
                    Intent ENTER = new Intent(MainActivity.this,LOGIN.class);
                    startActivity(ENTER);
                }

            }
        });
        REGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ENTER = new Intent(MainActivity.this, REGISTER.class);
                startActivity(ENTER);
            }
        });
    }
}