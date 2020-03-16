package com.example.translateapp.domain;

import java.util.List;

public interface DataProvider <Data> {

    List<Data> getData();

    List<Data> getData(int count);

    Data getOneItem();
}
