package com.example.translateapp;

import android.app.Application;

import androidx.room.Room;

import com.example.translateapp.db.AppDatabase;

public class App extends Application {
    private static App instance;
    private AppDatabase appDatabase;

    public AppDatabase appDatabase() {
        return this.appDatabase;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appDatabase = Room.databaseBuilder(this, AppDatabase.class, "database").build();
    }
}
