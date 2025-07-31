package com.example.Handson2Day1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String author;
    private String category;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "library_id")
    @JsonIgnore
    private Library library;
}
