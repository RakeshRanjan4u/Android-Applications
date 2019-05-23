package com.example.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Declaring array of Words
        ArrayList<Word> words =new ArrayList<Word>();

        words.add(new Word("RED","LAAL"));
        words.add(new Word("BLACK","KALA"));
        words.add(new Word("WHITE","UJLA"));
        words.add(new Word("YELLOW","PILA"));
        words.add(new Word("GREEN","HARA"));
        words.add(new Word("VIOLET","BAIGNI"));
        words.add(new Word("PINK","PINK"));
        words.add(new Word("BLUE","NILA"));
        words.add(new Word("ORANGE","NARANGI"));
        words.add(new Word("GREY","BHURA"));

        WordAdapter adapter=new WordAdapter(this,words);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
