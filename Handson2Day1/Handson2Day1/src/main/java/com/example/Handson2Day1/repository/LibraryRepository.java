package com.example.Handson2Day1.repository;

import com.example.Handson2Day1.entity.Library;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Integer> {

    boolean existsByPhoneNumber(String phoneNumber);

    boolean existsByEmail(String email);

    @Query("Select * from Library l WHERE l.libraryName = :libraryName")
    Library findByName (@Param("libraryName") String libraryName);

//    @Query(value = "Select full_name from Customer c WHERE c.email = :email", nativeQuery = true)
//    Customer findByEmail (@Param("email") String email);
}
