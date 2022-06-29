package com.deca.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "fruits")
@NoArgsConstructor
@Getter
@Setter
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fruit_id")
    private Long fruitId;

    @Column(name = "fruit_name", nullable = false, unique = true, updatable = false)
    private String fruitName;

    @ManyToMany(mappedBy = "fruits")
    private List<User> users;

    @Override
    public String toString() {
        return fruitName;
    }
}
