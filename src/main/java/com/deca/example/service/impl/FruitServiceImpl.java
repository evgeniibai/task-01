package com.deca.example.service.impl;

import com.deca.example.model.Fruit;
import com.deca.example.repository.FruitRepository;
import com.deca.example.service.FruitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    @Override
    public Fruit findFruitByUin(String fruitUin) {
        return null;
    }

    @Override
    public List<Fruit> findAllFruits() {
        return null;
    }

    @Override
    public Fruit saveFruit(Fruit fruit) {
        return null;
    }

    @Override
    public void deleteFruit(String fruitUin) {

    }
}
