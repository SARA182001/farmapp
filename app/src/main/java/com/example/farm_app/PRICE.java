package com.example.farm_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PRICE extends AppCompatActivity {
Button bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);



        bb= (Button) findViewById(R.id.bb);

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ENTER = new Intent(PRICE.this,LOGIN.class);
                startActivity(ENTER);
            }
        });
    }
}