package com.example.myfirstapp.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
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
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);

        RVAdapter.OnUserClickListener onUserClickListener = new RVAdapter.OnUserClickListener() {

            public void onUserClick(Translate translate) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);
                startActivity(intent);
            }

            public void onItemSelected(Translate translate) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);
                startActivity(intent);
            }
        };


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.add_item) {
            Context context = getApplicationContext();
            CharSequence text = "Hello toast!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            Intent intent = new Intent(MainActivity.this, AddActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
