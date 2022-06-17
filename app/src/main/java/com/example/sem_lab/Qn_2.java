package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class Qn_2 extends AppCompatActivity {

    TextView op;
    EditText ip;
    String ipstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn2);
        op=findViewById(R.id.op2);
        ip=findViewById(R.id.ip2);

        ipstr=ip.getText().toString();
        Log.i("testing val",ipstr);
        ip.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i("flow","entered addtextchangedlistener");
                if(!ipstr.equals("")){
                    Log.i("testing val",ipstr);
                    op.setText(ip.getText().toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}