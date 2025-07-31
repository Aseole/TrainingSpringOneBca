package com.example.Handson2Day1.service;

import com.example.Handson2Day1.dto.BookGetResponse;
import com.example.Handson2Day1.dto.BookInsertRequest;
import com.example.Handson2Day1.dto.LibraryGetResponse;
import com.example.Handson2Day1.dto.LibraryInsertRequest;
import com.example.Handson2Day1.entity.Book;
import com.example.Handson2Day1.entity.Library;
import com.example.Handson2Day1.repository.BookRepository;
import com.example.Handson2Day1.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LibraryService {

    private final LibraryRepository libraryRepository;
    private final ModelMapper modelMapper;
    private final BookRepository bookRepository;

    @Transactional
    public Library insertLibrary(LibraryInsertRequest request){
        Library library = new Library();
        library.setLibraryAddress(request.getLibraryAddress());
        library.setLibraryName(request.getLibraryName());
        library.setEmail(request.getLibraryAddress());
        library.setBookList(request.getBookList());
        libraryRepository.save(library);
        return libraryRepository.findByName(request.getLibraryName());
    }

    public LibraryGetResponse getLibraryDatabyName(String name) {
        Library libraryData = libraryRepository.findByName(name);
        return new LibraryGetResponse(libraryData.getLibraryName(),libraryData.getLibraryAddress(),libraryData.getBookList().size());
    }

    @Transactional
    public Book insertBook(BookInsertRequest request){
        Book book = new Book();
        book.setLibrary(request.getLibrary());
        book.setName(request.getName());
        book.setAuthor(request.getAuthor());
        book.setCategory(request.getCategory());
        bookRepository.save(book);
        return bookRepository.findByName(request.getName());
    }

    public BookGetResponse getBookDatabyName(String name) {
        Book bookData = bookRepository.findByName(name);
        return new BookGetResponse(bookData.getName(),bookData.getAuthor(),bookData.getLibrary().getLibraryName());
    }

}
