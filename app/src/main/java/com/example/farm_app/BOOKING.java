package com.example.farm_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BOOKING extends AppCompatActivity {
EditText E1,E2,E3,E4,E5;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);


        E1 = (EditText) findViewById(R.id.E1);
        E2 = (EditText) findViewById(R.id.E2);
        E3 = (EditText) findViewById(R.id.E3);
        E4 = (EditText) findViewById(R.id.E4);
        E5 = (EditText) findViewById(R.id.E5);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);

        clearData();
    }


    public void clearData(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    if (E1.getText().toString().isEmpty()|| E2.getText().toString().isEmpty()|| E3.getText().toString().isEmpty()
                            || E4.getText().toString().isEmpty()|| E5.getText().toString().isEmpty()){
                        Toast.makeText(BOOKING.this, "Sum Data is not add", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(BOOKING.this, "booking successful", Toast.LENGTH_SHORT).show();
                        E1.setText("");
                        E2.setText("");
                        E3.setText("");
                        E4.setText("");
                        E5.setText("");
                    }
                }
            });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ENTER = new Intent(BOOKING.this,LOGIN.class);
                startActivity(ENTER);
            }
        });



    }

    }
