package com.example.translateapp.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.translateapp.entity.Translate;

import java.util.List;

public interface TranslateDao {

    List<Translate> all();

    void insert(Translate translate);

    void update(Translate translate);

    void delete(Translate translate);
}
