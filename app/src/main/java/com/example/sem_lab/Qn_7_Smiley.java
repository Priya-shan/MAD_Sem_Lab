package com.example.sem_lab;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Qn_7_Smiley extends AppCompatActivity {
    Paint paint=new Paint();
    Path path=new Path();
    RectF oval = new RectF();
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //No need of XML File
        demo_View1 dview=new demo_View1(this);
        setContentView(dview);
    }
    public class demo_View1 extends View {

        public demo_View1(Context context) {
            super(context);
        }

        public void onDraw(Canvas canvas){
            super.onDraw(canvas);

            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);

            paint.setColor(Color.YELLOW);
            canvas.drawCircle(360,600,250,paint);

            paint.setColor(Color.BLACK);
            canvas.drawCircle(250,530,30,paint);

            paint.setColor(Color.BLACK);
            canvas.drawCircle(470,530,30,paint);

            paint.setColor(Color.RED);
            RectF oval = new RectF(250, 530 + 530 / 8, 470, (float) (530 + 530 / 2.5));

            canvas.drawArc(oval, 10, 150, false, paint); // happy face.


        }
    }
}
