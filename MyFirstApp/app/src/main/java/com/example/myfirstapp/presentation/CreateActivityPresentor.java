package com.example.myfirstapp.presentation;

import com.arellomobile.mvp.MvpPresenter;
import com.example.myfirstapp.domain.TranslateUseCase;

public class CreateActivityPresentor extends MvpPresenter<CreateView> {

    private TranslateUseCase translateUseCase;

    public CreateActivityPresentor(TranslateUseCase translateUseCase){
        this.translateUseCase=translateUseCase;
    }



    // public void onTranslate(String word){
    //    RecyclerItem translate =  translateUseCase.translate(word, Language.RUS);
    //     getViewState().showTranslate();
    //}
}
