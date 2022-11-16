package dev.orwin.services;

import dev.orwin.entities.Book;

import java.util.List;

public interface BookService {

    Book registerBook(Book book);

    Book getBookById(int id);

    List<Book> getAllBooks();

    List<Book> getBookByTitle(String title);


}
