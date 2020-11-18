package com.example.m;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class Fr1 extends AppCompatActivity {
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr1);
    }
    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                if(x1 > x2){
                Intent im = new Intent(Fr1.this, F1.class);
                startActivity(im);
            }
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchevent.getX();
                y2 = touchevent.getY();
                if(x1 < x2){
                    Intent i = new Intent(Fr1.this, S1.class);
                    startActivity(i);
                }

                break;

        }
        return false;

    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent i2 = new Intent(Fr1.this, w1.class);
        startActivity(i2);
    }
}