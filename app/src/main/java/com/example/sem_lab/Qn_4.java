package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Qn_4 extends AppCompatActivity {

    EditText num;
    TextView res;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn4);
        num=findViewById(R.id.qn4_n);
        res=findViewById(R.id.qn_4_res);
        b=findViewById(R.id.qn_4_b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(num.getText().toString());
                int prod=1;
                for(int i=1;i<=n;i++){
                    prod*=i;
                }
                res.setText(Integer.toString(prod));
            }
        });

    }
}