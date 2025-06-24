package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")

public class BookController {
    @Autowired
    private BookService service;
    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }
    @PostMapping("/create")
    public Book createBook(@RequestBody Book book) {
        return service.save(book);
    }
    @PostMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        service.deleteBookById(id);
        return "Buku dengan ID " + id + " berhasil dihapus.";
    }
}

