package com.example.myfirstapp.domain;

import com.example.myfirstapp.Language;
import com.example.myfirstapp.RecyclerItem;

public interface TranslateUseCase {
    public RecyclerItem translate (String  word, Language lang);
}
