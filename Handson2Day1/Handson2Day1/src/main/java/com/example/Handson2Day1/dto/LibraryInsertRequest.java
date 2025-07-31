package com.example.Handson2Day1.dto;

import com.example.Handson2Day1.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryInsertRequest {
    private String libraryName;
    private String libraryAddress;
    private String phoneNumber;
    private String email;
    private List<Book> bookList;
}
