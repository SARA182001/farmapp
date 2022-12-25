package com.example.farm_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LOCATION extends AppCompatActivity {
EditText d1;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        d1=(EditText) findViewById(R.id.d1);
        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stg= d1.getText().toString();
                Intent s=new Intent(Intent.ACTION_VIEW, Uri.parse(stg));
                startActivity(s);
            }
        });
    }
}