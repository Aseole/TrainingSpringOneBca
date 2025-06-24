package com.example.demo2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repo;

    public Book save(Book book){
        repo.save(book);
        return book;
    }
    private Long currentId = 1L;
    public List<Book> getAllBooks() {
        return repo.findAll();
    }
    public List<Book> getAll(){
        return  repo.findAll();
    }
    public void deleteBookById(Long id) {
        repo.deleteById(id);
    }
}
