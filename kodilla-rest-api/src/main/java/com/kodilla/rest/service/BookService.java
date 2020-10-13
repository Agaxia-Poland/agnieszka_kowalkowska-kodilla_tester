package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

@PostMapping
    public void addBook (BookDto bookDto) {
        books.add(bookDto);
    }

    public void removeBook (Object o) {books.remove(o); }
}