package com.example.myfirstapp.presentation;

import com.arellomobile.mvp.MvpPresenter;
import com.example.myfirstapp.Language;
import com.example.myfirstapp.RecyclerItem;
import com.example.myfirstapp.domain.TranslateUseCase;

public class EditActivityPresentor extends MvpPresenter<EditView> {

    private TranslateUseCase translateUseCase;

    public EditActivityPresentor(TranslateUseCase translateUseCase){
        this.translateUseCase=translateUseCase;
    }



   // public void onTranslate(String word){
    //    RecyclerItem translate =  translateUseCase.translate(word, Language.RUS);
   //     getViewState().showTranslate();
    //}
}
