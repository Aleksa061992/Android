package com.example.myfirstapp.presentation;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;

import com.example.myfirstapp.R;

import androidx.annotation.Nullable;

import com.arellomobile.mvp.MvpAppCompatActivity;

public class AddActivity extends MvpAppCompatActivity {

    private EditText word;
    private EditText translate;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.create);

        word = findViewById(R.id.addWord);
        translate = findViewById(R.id.addTranslate);
    }

}
