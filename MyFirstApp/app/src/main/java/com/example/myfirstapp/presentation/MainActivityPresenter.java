package com.example.myfirstapp.presentation;

import com.arellomobile.mvp.MvpPresenter;
import com.example.myfirstapp.Language;
import com.example.myfirstapp.Translate;
import com.example.myfirstapp.domain.TranslateUseCase;


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
