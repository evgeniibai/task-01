package com.deca.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Simple Spring Boot App: Spring Web, Spring Security, Spring JPA, Flyway, H2 Database etc.
 * @author Evgenii Bai
 * @version 1.0
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
