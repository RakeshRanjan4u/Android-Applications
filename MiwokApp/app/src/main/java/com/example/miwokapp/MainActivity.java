package com.example.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NumbersClickListener clickListener = new NumbersClickListener();
        //Find view that shows number category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set clickListener on that view
        numbers.setOnClickListener(clickListener);
    }
}
