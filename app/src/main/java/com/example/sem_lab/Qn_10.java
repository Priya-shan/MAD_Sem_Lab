package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Qn_10 extends AppCompatActivity {
    TextView res;
    EditText num;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn10);
        res=findViewById(R.id.qn_10_res);
        num=findViewById(R.id.qn_10_ip);
        b=findViewById(R.id.qn_10_b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(num.getText().toString());
                int flag=0;
                for(int i=2;i<n/2;i++){
                    if(n%i==0){
                        flag++;
                        break;
                    }
                }
                if(flag==0){
                    res.setText("prime number");
                }
                else{
                    res.setText("not a prime number");
                }
            }
        });

    }
}