package com.example.paper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar a1= getSupportActionBar();
        a1.setTitle("first");

        EditText n1=findViewById(R.id.ename);
        EditText e1=findViewById(R.id.temail);
        EditText p1=findViewById(R.id.ephone);

        Button b1=findViewById(R.id.save);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = n1.getText().toString();
                String email = e1.getText().toString();
                String phone = p1.getText().toString();

                Intent i= new Intent(MainActivity.this,sa.class);
                i.putExtra("NAME",name);
                i.putExtra("EMAIL",email);
                i.putExtra("PHONE",phone);
                startActivity(i);
            }
        });
    }
}