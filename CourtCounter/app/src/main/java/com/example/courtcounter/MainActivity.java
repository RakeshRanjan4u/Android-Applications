package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Team A utility
    private  int pointTableA=0;

    protected void add3PointA(View view){
        pointTableA+=3;
        displayA();
    }
    protected void add2PointA(View view){
        pointTableA+=2;
        displayA();
    }
    protected void freeThrowA(View view){
        pointTableA+=1;
        displayA();
    }
    protected void displayA(){
        TextView t=(TextView) findViewById(R.id.pointA);
        String message="" + pointTableA;
        t.setText(message);
    }

    //Team B Utility
    private  int pointTableB=0;

    protected void add3PointB(View view){
        pointTableB+=3;
        displayB();
    }
    protected void add2PointB(View view){
        pointTableB+=2;
        displayB();
    }
    protected void freeThrowB(View view){
        pointTableB+=1;
        displayB();
    }
    protected void displayB(){
        TextView t=(TextView) findViewById(R.id.pointB);
        String message=""+pointTableB;
        t.setText(message);
    }

    //Reset Method
    protected void resetAll(View view){
        pointTableA=0;
        pointTableB=0;
        displayA();
        displayB();
    }



}
