package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Qn_6 extends AppCompatActivity {
    LinearLayout linearLayout;
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn6);
        linearLayout=findViewById(R.id.qn_6_layout);
        b1=findViewById(R.id.qn_6_b1);
        b2=findViewById(R.id.qn_6_b2);

        // add preffered color in res->values->colors-> " <color name="red">#ff0000</color> "
        // or use the default colors available
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearLayout.setBackgroundResource(R.color.red);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearLayout.setBackgroundResource(R.color.skyblue);
            }
        });
    }
}