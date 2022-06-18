package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Qn_17 extends AppCompatActivity {
    TextView res;
    EditText num;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn17);
        setContentView(R.layout.activity_qn17);
        res=findViewById(R.id.qn_17_res);
        num=findViewById(R.id.qn_17_ip);
        b=findViewById(R.id.qn_17_b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count=0;
                String s=num.getText().toString();
                String[] arr= s.split(" ");
                count=arr.length;
//                for(String word:s.split(" ")){
//                    count++;
//                }
                res.setText(Integer.toString(count));
            }
        });
    }
}