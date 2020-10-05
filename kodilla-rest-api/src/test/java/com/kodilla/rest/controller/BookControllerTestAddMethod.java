package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BookControllerTestAddMethod {

    @Test
    public void shouldAddBook(BookDto bookDto) {
        //given

        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<BookDto>();
        booksList.add(new BookDto("Title 3", "Author 3"));
        booksList.add(new BookDto("Title 4", "Author 4"));
        Mockito.when(bookServiceMock.addBook()).thenReturn(booksList);

        //when

        List<BookDto> result = bookController.addBook(bookDto);

        //then
        assertThat(result).hasSize(2);

    }
}