package com.example.securityproject.service;

import com.example.securityproject.models.Book;
import com.example.securityproject.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public Book createBook(Book book) {
        Book newBook = new Book();
        newBook.setId(book.getId());
        newBook.setName(book.getName());
        return bookRepository.save(newBook);
    }
}
