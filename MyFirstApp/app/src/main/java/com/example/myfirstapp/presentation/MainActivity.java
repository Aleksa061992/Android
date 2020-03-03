package com.example.myfirstapp.presentation;

import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.example.myfirstapp.R;
import com.example.myfirstapp.Translate;
import com.example.myfirstapp.presentation.render.RVAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends MvpAppCompatActivity {

    private List<Translate> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        listItems = new ArrayList<Translate>();
        listItems.add(new Translate(1, "Кошка", "Cat"));
        listItems.add(new Translate(2, "Собака", "Dog"));
        listItems.add(new Translate(3, "Мышь", "Mouse"));
        listItems.add(new Translate(4, "Лошадь", "Horse"));
        listItems.add(new Translate(5, "Корова", "Cow"));
        listItems.add(new Translate(6, "Свинья", "Pig"));

        RecyclerView rv = findViewById(R.id.RecyclerView);
        RVAdapter adapter = new RVAdapter(listItems);
        rv.setAdapter(adapter);
    }

}
