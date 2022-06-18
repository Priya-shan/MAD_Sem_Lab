package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Qn_24 extends AppCompatActivity {
    EditText to;
    EditText subj;
    EditText msg;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn24);
        to=findViewById(R.id.to);
        subj=findViewById(R.id.subj);
        msg=findViewById(R.id.msg);
        b=findViewById(R.id.qn_24_b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tostr=to.getText().toString();
                String[] toarr=tostr.split(",");

                String subjstr=subj.getText().toString();
                String msgstr=msg.getText().toString();

                Intent i=new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL,toarr);
                i.putExtra(Intent.EXTRA_SUBJECT,subjstr);
                i.putExtra(Intent.EXTRA_TEXT,msgstr);

                i.setType("message/rfc822");
                startActivity(Intent.createChooser(i,"Choose service"));
            }
        });

    }
}