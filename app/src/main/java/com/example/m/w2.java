package com.example.m;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class w2 extends AppCompatActivity {
    Button bt;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w2);
        bt = findViewById(R.id.bt);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMon1();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openT1();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWed1();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openF1();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFr1();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openS1();
            }
        });

    }
    public void openMon1() {
        Intent s = new Intent(this, Mon1.class);
        startActivity(s);
    }
    public void openT1() {
        Intent st = new Intent(this, T1.class);
        startActivity(st);
    }
    public void openWed1() {
        Intent str = new Intent(this, Wed1.class);
        startActivity(str);
    }
    public void openF1() {
        Intent sta = new Intent(this, F1.class);
        startActivity(sta);
    }
    public void  openFr1() {
        Intent star = new Intent(this,  Fr1.class);
        startActivity(star);
    }
    public void openS1() {
        Intent start = new Intent(this, S1.class);
        startActivity(start);
    }
}