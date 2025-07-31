package com.example.Handson2Day1.dto;

import com.example.Handson2Day1.entity.Library;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookInsertRequest {
    private int id;
    private String name;
    private String author;
    private String category;
    private Library library;
}
