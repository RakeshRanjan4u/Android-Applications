package com.example.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Declaring array of Words
        ArrayList<Word> words =new ArrayList<Word>();

        words.add(new Word("Mango","Aam"));
        words.add(new Word("Papaya","Papita"));
        words.add(new Word("Banana","Kela"));
        words.add(new Word("Jack Fruit","Kathal"));
        words.add(new Word("Apple","Seb"));
        words.add(new Word("Orange","Nrangi"));
        words.add(new Word("Grapes","Angoor"));
        words.add(new Word("Lemon","Nimboo"));
        words.add(new Word("Guava","Amrood"));
        words.add(new Word("Watermelon","Kharbuj"));

        WordAdapter adapter=new WordAdapter(this,words);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
