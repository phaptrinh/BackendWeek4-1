package com.example.week41.service;

import com.example.week41.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book createBook(Book book);

    Optional<Book> getBook(Long id);

    List<Book> getAllBooks();

    void deleteBook(Long id);
}
