package com.deca.example.service;

import com.deca.example.model.Fruit;

import java.util.List;

public interface FruitService {
    Fruit findFruitByUin(String fruitUin);

    List<Fruit> findAllFruits();

    Fruit saveFruit(Fruit fruit);

    void deleteFruit(String fruitUin);
}
