package com.example.myfirstapp.presentation;

import com.arellomobile.mvp.MvpPresenter;
import com.example.myfirstapp.domain.TranslateUseCase;

public class AddActivityPresentor extends MvpPresenter<AddView> {

    private TranslateUseCase translateUseCase;

    public AddActivityPresentor(TranslateUseCase translateUseCase) {
        this.translateUseCase = translateUseCase;
    }
}
