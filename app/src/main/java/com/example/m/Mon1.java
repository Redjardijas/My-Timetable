package com.example.m;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class Mon1 extends AppCompatActivity {
float x1, x2, y1, y2;
int r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon1);
    }
    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                if(x1 > x2){
                    Intent im = new Intent(Mon1.this, S1.class);
                    startActivity(im);
                }
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchevent.getX();
                y2 = touchevent.getY();
                if(x1 < x2){
                    Intent i = new Intent(Mon1.this, T1.class);
                    startActivity(i);
                }
                break;
        }
        return false;

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent i2 = new Intent(Mon1.this, w1.class);
        startActivity(i2);

    }
}