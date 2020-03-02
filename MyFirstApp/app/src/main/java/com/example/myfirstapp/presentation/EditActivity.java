package com.example.myfirstapp.presentation;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.myfirstapp.R;

import com.arellomobile.mvp.MvpAppCompatActivity;

public class EditActivity extends MvpAppCompatActivity {

   private EditText word;
   private EditText translate;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.edit);

        word  = findViewById(R.id.editWord);
        translate = findViewById(R.id.translateEdit);

        //  welcomeText = findViewById(R.id.textView);//инициализируем view
        // welcomeText.setText(R.string.welcome_text);
        //  finish(); //завершаем работу активити
        //  String app_name = getResources().getString(R.string.app_name);
        //  Intent intent = new Intent(this.)
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
