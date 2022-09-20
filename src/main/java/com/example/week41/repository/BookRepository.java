package com.example.week41.repository;

import com.example.week41.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Override
    void deleteById(Long id);
}
