package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Qn_1 extends AppCompatActivity {
    TextView opp;
    EditText ipp;
    String res="test";
    String n;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn1);
        ipp=findViewById(R.id.ip);
        opp=findViewById(R.id.op);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(ipp.getText().toString());
                if(n%2==0){
                    res="Number is even";
                }
                else{
                    res="Number is odd";
                }
                opp.setText(res);

            }
        });
    }

}