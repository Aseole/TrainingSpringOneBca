package com.example.Handson2Day1.controller;


import com.example.Handson2Day1.dto.BookGetResponse;
import com.example.Handson2Day1.dto.BookInsertRequest;
import com.example.Handson2Day1.dto.LibraryGetResponse;
import com.example.Handson2Day1.dto.LibraryInsertRequest;
import com.example.Handson2Day1.entity.Book;
import com.example.Handson2Day1.entity.Library;
import com.example.Handson2Day1.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libarary")
@RequiredArgsConstructor
public class LibraryController {

    private final LibraryService libraryService;

    @PostMapping
    public ResponseEntity<Library> insertLibrary(@RequestBody LibraryInsertRequest request){
        Library response = libraryService.insertLibrary(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Book> insertBook(@RequestBody BookInsertRequest request){
        Book response = libraryService.insertBook(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get-library-data/library_name/{library_name}")
    public LibraryGetResponse getLibraryData(@PathVariable("library_name") String library_name){
        return libraryService.getLibraryDatabyName(library_name);

    }

    @GetMapping("/get-book-data/book_name/{book_name}")
    public BookGetResponse getBookResponse(@PathVariable("book_name") String book_name){
        return libraryService.getBookDatabyName(book_name);
    }
}
