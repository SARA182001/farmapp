package com.example.farm_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class REGISTER extends AppCompatActivity {
    EditText q1,q2,q3;
    EditText q4;
    Button logg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        q1 = (EditText) findViewById(R.id.q1);
        q2 = (EditText) findViewById(R.id.q2);
        q3 = (EditText) findViewById(R.id.q3);
        q4 =(EditText) findViewById(R.id.q4);
        logg = (Button) findViewById(R.id.b2);

        logg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (q1.getText().toString().isEmpty()||q2.getText().toString().isEmpty()||q3.getText().toString().isEmpty()||q4.getText().toString().isEmpty())
                {
                    Toast.makeText(REGISTER.this, "Sum Data is not add", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(REGISTER.this, "WELCOME", Toast.LENGTH_SHORT).show();
                    Intent ENTER = new Intent(REGISTER.this,LOGIN.class);
                    startActivity(ENTER);
                }

            }
        });
    }
}