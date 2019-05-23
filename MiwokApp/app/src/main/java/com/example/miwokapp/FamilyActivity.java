package com.example.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Declaring array of Words
        ArrayList<Word> words =new ArrayList<Word>();

        words.add(new Word("Father","Papa"));
        words.add(new Word("Mother","Maa"));
        words.add(new Word("Brother","Bhai"));
        words.add(new Word("Sister","Behan"));
        words.add(new Word("Uncle","chacha"));
        words.add(new Word("Aunty","chachi"));
        words.add(new Word("Grand Father","DadaJi"));
        words.add(new Word("Grand Mother","DadiJi"));
        words.add(new Word("Neice","Bhatiji"));
        words.add(new Word("Nephew","Bhatija"));

        WordAdapter adapter=new WordAdapter(this,words);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
