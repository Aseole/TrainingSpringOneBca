package com.example.Handson2Day1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String libraryName;
    private String libraryAddress;
    private String phoneNumber;
    private String email;

    @OneToMany(mappedBy = "library", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Book> bookList;
}
