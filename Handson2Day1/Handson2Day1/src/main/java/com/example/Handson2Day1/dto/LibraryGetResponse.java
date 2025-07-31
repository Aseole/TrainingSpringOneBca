package com.example.Handson2Day1.dto;

import com.example.Handson2Day1.entity.Library;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryGetResponse {
    private String name;
    private String author;
    private int bookListSize;
}
