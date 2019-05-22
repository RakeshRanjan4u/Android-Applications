package com.example.practiceset1;

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

   int healthLevel=0;
    //Display Methods
    protected void increment(View view){
        healthLevel+=1;
        String message="You answered Yes! \nYour Current Health Level is:"+healthLevel;
        TextView t=(TextView)findViewById(R.id.display_text_view);
        t.setText(message);
    }
    protected void noChange(View view){
        String message="You answered Sometimes! \nYour Current Health Level is:"+healthLevel;
        TextView t=(TextView)findViewById(R.id.display_text_view);
        t.setText(message);
    }
    protected void decrement(View view){
        healthLevel-=1;
        String message="You answered No! \nYour Current Health Level is:"+healthLevel;
        TextView t=(TextView)findViewById(R.id.display_text_view);
        t.setText(message);
    }

}
