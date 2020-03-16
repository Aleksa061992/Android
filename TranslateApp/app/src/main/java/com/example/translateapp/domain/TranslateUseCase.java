package com.example.translateapp.domain;

import com.example.translateapp.Language;
import com.example.translateapp.Translate;

public interface TranslateUseCase {
    public Translate translate(String word, Language langWord, Language langTranslate);
}
