package com.example.myfirstapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.myfirstapp.Translate;

@Database(entities = {Translate.class},version = 1)
public abstract class AppDatabase  extends RoomDatabase {
    public abstract TranslateDao translateDao();
}
