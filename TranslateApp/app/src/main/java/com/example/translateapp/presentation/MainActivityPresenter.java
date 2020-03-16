package com.example.translateapp.presentation;

import com.arellomobile.mvp.MvpPresenter;
import com.example.translateapp.Language;

import com.example.translateapp.Translate;
import com.example.translateapp.domain.TranslateUseCase;

public class MainActivityPresenter extends MvpPresenter<MainView> {

    private TranslateUseCase translateUseCase;

    public MainActivityPresenter(TranslateUseCase translateUseCase) {
        this.translateUseCase = translateUseCase;
    }


    public void onTranslate(String word) {
        Translate translate = translateUseCase.translate(word, Language.RUS, Language.ENG);
        getViewState().showTranslate();
    }
}

