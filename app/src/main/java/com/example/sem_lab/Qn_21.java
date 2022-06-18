package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Qn_21 extends AppCompatActivity {

    CheckBox cb1;
    CheckBox cb2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn21);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        b=findViewById(R.id.qn_21_b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> lst=new ArrayList<>();
                String[] arr=new String[2];
                if(cb1.isChecked()){
                    lst.add(cb1.getText().toString());
                }
                if(cb2.isChecked()){
                    lst.add(cb2.getText().toString());
                }

                Toast.makeText(getApplicationContext(),lst.toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}