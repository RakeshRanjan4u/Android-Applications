package com.example.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find view that shows NUMBERS category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //Set clickListener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link NumberActivity}
                Intent numberIntent =new Intent(MainActivity.this,NumbersActivity.class);
                //Start the new Activity
                startActivity(numberIntent);
            }
        } );

        //Family Member View
        TextView family=(TextView)findViewById(R.id.family);
        //Setting ClickListener On that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating new intent which will open familyActivity
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                //Starting New Activity
                startActivity(familyIntent);
            }
        });

        //Finding Colors View
        TextView colors=(TextView)findViewById(R.id.colors);
        //Setting clickListener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating new Intent which will open Colors activity
                Intent colorsIntent=new Intent(MainActivity.this,ColorsAcivity.class);
                //Starting colors activity
                startActivity(colorsIntent);
            }
        });

        //Finding Phrases View
        TextView phrases=(TextView)findViewById(R.id.phrases);
        //Setting clickListener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating new Intent which will open Phrases activity
                Intent phrasesIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                //Starting colors activity
                startActivity(phrasesIntent);
            }
        });





    }
}
