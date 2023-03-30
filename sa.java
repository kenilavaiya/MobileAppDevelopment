package com.example.paper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa);

        ActionBar a1=getSupportActionBar();
        a1.setTitle("second");

        Intent i=getIntent();
        String name=i.getStringExtra("NAME");
        String email=i.getStringExtra("EMAIL");
        String phone=i.getStringExtra("PHONE");

        TextView t=findViewById(R.id.re);
         t.setText("Name: "+name+"\nEmail: "+email+"\nPhone: "+phone);
    }
}