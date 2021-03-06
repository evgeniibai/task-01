package com.deca.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
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
    private Integer fruitId;

    @Column(name = "uin", nullable = false, unique = true, updatable = false)
    private String uin;
    @Column(name = "fruit_name", nullable = false, unique = true, updatable = false)
    private String fruitName;

    @ManyToMany(mappedBy = "fruits")
    private List<User> users;

    @Override
    public String toString() {
        return uin + ": " +
                fruitName;
    }
}
