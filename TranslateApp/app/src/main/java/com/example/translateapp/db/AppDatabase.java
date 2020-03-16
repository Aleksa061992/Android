package com.example.translateapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.translateapp.entity.Translate;


public abstract class AppDatabase   extends RoomDatabase {
    public abstract TranslateDao translateDao();
}
