package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Qn_19 extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn19);
        b1=findViewById(R.id.qn_19_b1);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel notificationChannel=
                    new NotificationChannel("my notification","my notification",
                            NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(notificationChannel);

        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder=
                        new NotificationCompat.Builder(Qn_19.this,"my notification");
                builder.setContentTitle("ShanMart");
                builder.setContentText("Greetings from Shan Mart");
                builder.setSmallIcon(R.drawable.pp);
                builder.setAutoCancel(false);
                NotificationManagerCompat managerCompat=NotificationManagerCompat.from(Qn_19.this);
                managerCompat.notify(1,builder.build());

            }
        });
    }
}