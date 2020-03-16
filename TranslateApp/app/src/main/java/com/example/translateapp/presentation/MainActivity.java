package com.example.translateapp.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.example.translateapp.R;

public class MainActivity extends MvpAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
