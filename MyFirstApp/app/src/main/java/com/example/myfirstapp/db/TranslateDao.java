package com.example.myfirstapp.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myfirstapp.Translate;

import java.util.List;

@Dao
public interface TranslateDao {
    @Query("select * from translate")
    List<Translate> all();
    @Insert
     void insert(Translate translate);
    @Update
      void update(Translate translate);
    @Delete
      void delete(Translate translate);
}
