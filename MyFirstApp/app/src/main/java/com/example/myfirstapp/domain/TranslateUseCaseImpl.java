package com.example.myfirstapp.domain;

import com.example.myfirstapp.Language;
import com.example.myfirstapp.Translate;
import com.example.myfirstapp.entity.TranslateRepository;

public class TranslateUseCaseImpl implements TranslateUseCase {

    TranslateRepository repository;
    public TranslateUseCaseImpl()
    {
      //  repository = new TranslateRepositoryImpl
    }
    @Override
    public Translate translate(String word, Language langWord, Language langTranslate) {
        return null;
    }
}
