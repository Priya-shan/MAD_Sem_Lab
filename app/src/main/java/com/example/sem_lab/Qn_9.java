package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Qn_9 extends AppCompatActivity {
Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn9);
        sp=findViewById(R.id.spinner);
        String[] arr={"India","Japan","China"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arr);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
    }
}