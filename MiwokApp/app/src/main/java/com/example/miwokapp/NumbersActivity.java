package com.example.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Declaring array of Words
        ArrayList <Word> words =new ArrayList<Word>();

        words.add(new Word("One","Ek"));
        words.add(new Word("Two","Do"));
        words.add(new Word("Three","Teen"));
        words.add(new Word("Four","Chaar"));
        words.add(new Word("Five","Paanch"));
        words.add(new Word("Six","Chhe"));
        words.add(new Word("Seven","Saat"));
        words.add(new Word("Eight","Aath"));
        words.add(new Word("Nine","Nau"));
        words.add(new Word("Ten","Das"));

        WordAdapter adapter=new WordAdapter(this,words);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
