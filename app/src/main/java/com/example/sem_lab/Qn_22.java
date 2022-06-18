package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextClock;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Qn_22 extends AppCompatActivity {
    TextClock curtime;
    TimePicker clk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn22);

        curtime=findViewById(R.id.currtime);
        clk=findViewById(R.id.alarmclock);



       // Log.i("testing--",syshr);
       // Log.i("testing--",sysmin);

        final Ringtone r=RingtoneManager.getRingtone(getApplicationContext(),
                RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel=new NotificationChannel("my notify","my notify",
                    NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        Timer t=new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Calendar calendar=Calendar.getInstance();
                String syshr=Integer.toString(calendar.get(Calendar.HOUR));
                String sysmin=Integer.toString(calendar.get(Calendar.MINUTE));
                String currentTime = syshr+":"+sysmin;
                //Log.i("testing--",syshr);
                //Log.i("testing--",sysmin);
                if(currentTime.equals(AlarmTime())) {
                    r.play();

                    NotificationCompat.Builder builder =
                            new NotificationCompat.Builder(Qn_22.this, "my notify");

                    builder.setContentTitle("Alarm !");
                    builder.setContentText("Wake Up Man !");
                    builder.setSmallIcon(R.drawable.pp);
                    builder.setAutoCancel(false);

                    NotificationManagerCompat managerCompat = NotificationManagerCompat.from(Qn_22.this);
                    managerCompat.notify(1, builder.build());
                }
                else{
                    r.stop();
                }
            }
        },0,1000);

    }
    public String AlarmTime(){
        int hr=clk.getCurrentHour();
        int min=clk.getCurrentMinute();
        return hr+":"+min;
    }
}