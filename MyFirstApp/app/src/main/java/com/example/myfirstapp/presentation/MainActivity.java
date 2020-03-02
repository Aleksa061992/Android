package com.example.myfirstapp.presentation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.example.myfirstapp.R;
import com.example.myfirstapp.RecyclerItem;
import com.example.myfirstapp.presentation.render.RVAdapter;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends MvpAppCompatActivity {

    private List<RecyclerItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        listItems = new ArrayList<RecyclerItem>();

        listItems.add(new RecyclerItem("Кошка", "Cat " ));
        listItems.add(new RecyclerItem("Собака", "Dog " ));
        listItems.add(new RecyclerItem("Мышь", "Mouse " ));
        listItems.add(new RecyclerItem("Лошадь", "Horse " ));
        listItems.add(new RecyclerItem("Корова", "Cow " ));
        listItems.add(new RecyclerItem("Свинья", "Pig " ));

        RecyclerView rv = findViewById(R.id.RecyclerView);
        RVAdapter adapter = new RVAdapter(listItems);
        rv.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

    }

    @Override
    protected void onStart()
    {
        super.onStart();
    }


    @Override
    protected void onResume()
    {
        super.onResume();
    }



    @Override
    protected void onPause()
    {
        super.onPause();
    }



    @Override
    protected void onStop()
    {
        super.onStop();
    }



    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }


}
