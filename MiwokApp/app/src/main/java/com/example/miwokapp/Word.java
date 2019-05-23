package com.example.miwokapp;

public class Word {
    //Default translation for the word
    private String mDefaultTranslation;
    //Miwok Translation of word
    private String mMiwokTranslation;

    //Constructor for default initialisation
    public Word(String defaultTranslation,String miwokTranslation){
       mMiwokTranslation= miwokTranslation;
       mDefaultTranslation=defaultTranslation;
    }

    /*
     *Get the Default Translation
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    /*
     *Get the Miwok Translation
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
