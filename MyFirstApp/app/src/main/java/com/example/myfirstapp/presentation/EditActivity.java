package com.example.myfirstapp.presentation;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.example.myfirstapp.R;

public class EditActivity extends MvpAppCompatActivity {

    private EditText word;
    private EditText translate;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.edit);

        word = findViewById(R.id.editWord);
        translate = findViewById(R.id.editTranslate);

    }
}
