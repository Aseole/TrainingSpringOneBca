package com.example.Handson2Day1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookGetResponse {
    private String bookName;
    private String bookAuthor;
    private String libraryName;
}
