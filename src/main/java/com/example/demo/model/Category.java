package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Ensure the ID field is declared

    private String name;

    // Constructors
    public Category() {}

    public Category(String name) {
        this.name = name;
    }

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {  // Ensure this setter method is present
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


