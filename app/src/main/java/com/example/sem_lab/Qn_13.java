package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Qn_13 extends AppCompatActivity {
    TextView res;
    EditText num;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn13);
        res=findViewById(R.id.qn_13_res);
        num=findViewById(R.id.qn_13_ip);
        b=findViewById(R.id.qn_13_b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(num.getText().toString());
                int prod=1;
                for(int i=n;i>0;i--){
                    prod*=i;
                }
                res.setText(Integer.toString(prod));
            }
        });
    }
}