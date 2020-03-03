package com.example.myfirstapp.domain;

import com.example.myfirstapp.Translate;
import com.example.myfirstapp.UseCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MockTranslateProvider implements DataProvider<Translate>, UseCase {
    private List<Translate> data;
    private static MockTranslateProvider instance;
    private static Random random;

    private MockTranslateProvider() {
        data = new ArrayList<>();
        random = new Random();
        data.add(new Translate(random.nextInt(), "Собака", "Dog"));
        data.add(new Translate(random.nextInt(), "Мышь", "Mouse"));
        data.add(new Translate(random.nextInt(), "Лошадь", "Horse"));
        data.add(new Translate(random.nextInt(), "Корова", "Cow"));
        data.add(new Translate(random.nextInt(), "Свинья", "Pig"));
    }

    public static MockTranslateProvider instance() {
        if (instance == null) {
            instance = new MockTranslateProvider();
        }
        return instance;
    }

    @Override
    public List<Translate> getData() {
        return data;
    }

    @Override
    public List<Translate> getData(int count) {
        if (count < 0) throw new IllegalStateException("count < 0");
        List<Translate> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(data.get(random.nextInt(data.size() - 1)));
        }
        return list;
    }

    @Override
    public Translate getOneItem() {
        return new Translate(1, "Кошка", "Cat");
    }
}
