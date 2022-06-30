package com.deca.example.repository;

import com.deca.example.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {
    Fruit findByUin(String fruitUin);

    Fruit findByFruitName(String fruitName);

    void deleteByUin(String fruitUin);

    void deleteByFruitName(String fruitName);
}
