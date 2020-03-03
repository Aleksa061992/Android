package com.example.myfirstapp.domain;

import com.example.myfirstapp.Language;
import com.example.myfirstapp.Translate;

public interface TranslateUseCase {
    public Translate translate(String word, Language langWord, Language langTranslate);

}
