package com.example.Handson2Day1.repository;

import com.example.Handson2Day1.entity.Book;
import com.example.Handson2Day1.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query("Select * from Book b WHERE b.bookName = :bookName")
    Book findByName (@Param("bookName") String bookName);
}
