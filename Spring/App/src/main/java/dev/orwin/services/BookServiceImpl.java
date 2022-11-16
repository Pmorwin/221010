package dev.orwin.services;

import dev.orwin.entities.Book;
import dev.orwin.exceptions.BookNotFoundException;
import dev.orwin.repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // This tell Spring boot that this class is a service within your application
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepo bookRepo;

    @Override
    public Book registerBook(Book book) {
        Book savedBook = this.bookRepo.save(book);
        return savedBook;
    }

    @Override
    public Book getBookById(int id) {
        Optional<Book> possibleBook = this.bookRepo.findById(id);
        if(possibleBook.isPresent()){
            return possibleBook.get();
        }
        else{
            throw new BookNotFoundException(); // If this exception is not caught and a controller method throws it,
            // then the status code associated with the exception is returned
        }
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = this.bookRepo.findAll();
        return books;
    }

    @Override
    public List<Book> getBookByTitle(String title) {
        return this.bookRepo.findBooksByTitle(title);
    }
}
