package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Qn_3 extends AppCompatActivity {
    TextView res;
    EditText num1;
    EditText num2;
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn3);
        res=findViewById(R.id.res);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        b1=findViewById(R.id.add);
        b2=findViewById(R.id.sub);

        b1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               int sum=Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
               res.setText(Integer.toString(sum));
           }
        });
        b2.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               int sub=Integer.parseInt(num1.getText().toString())-Integer.parseInt(num2.getText().toString());
               res.setText(Integer.toString(sub));
           }
        });
    }
}