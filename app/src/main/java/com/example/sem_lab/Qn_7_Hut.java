package com.example.sem_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Qn_7_Hut extends AppCompatActivity {


    Paint paint=new Paint();
    Path path=new Path();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //No need of XML File
        demo_view dview=new demo_view(this);
        setContentView(dview);
    }
    public class demo_view extends View {

        public demo_view(Context context) {
            super(context);
        }

        public void onDraw(Canvas canvas){
            super.onDraw(canvas);

            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);

            paint.setColor(Color.RED);
            canvas.drawRect(200, 600, 500, 900, paint);

            paint.setColor(Color.BLACK);
            drawTriangle(canvas,paint,350,450,300);

            paint.setColor(Color.BLACK);
            canvas.drawRect(300, 750, 400, 900, paint);



        }
        public void drawTriangle(Canvas canvas, Paint paint, int x, int y, int width) {
            int halfWidth = width / 2;

            path.moveTo(x, y - halfWidth); // Top
            path.lineTo(x - halfWidth, y + halfWidth); // Bottom left
            path.lineTo(x + halfWidth, y + halfWidth); // Bottom right
            path.lineTo(x, y - halfWidth); // Back to Top
            path.close();

            canvas.drawPath(path, paint);
        }
    }
}