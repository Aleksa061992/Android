package com.example.translateapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


public class Translate {


    private int id;
    private String word;
    private String translate;

    public Translate(int id, String word, String translate) {
        this.id = id;
        this.word = word;
        this.translate = translate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}