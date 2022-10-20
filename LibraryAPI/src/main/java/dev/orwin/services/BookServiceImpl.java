package dev.orwin.services;


import dev.orwin.entities.Book;
import dev.orwin.exceptions.InvalidAuthorException;
import dev.orwin.repositories.BookDAO;
import dev.orwin.repositories.BookDAOLocal;

import java.util.List;

public class BookServiceImpl implements BookService {

    //BookDAO is the parent class of BookDAOLocal, so when making an object of any child of BookDAO, you can have BookDAO on the right
    // and then you specify the specific child you want on the left. This is JUST to save time in the future when changing to a different DAO
    //private BookDAO bookDAO = new BookDAOLocal();
    // ^^^ This is perfectly valid inregards to replacing Dependency Injection


    //We are going to use Dependency injection to create a bookDAO with crud operations
    // This will build an instance of the service with the dependency in the constructor
    // This makes using our DAO much easier
    private BookDAO bookDAO;

    public BookServiceImpl(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }



    @Override
    public Book createBook(Book book) {
        //Lets write business rules to validate our code (Buisness Logic)
        if(book.getTitle().length() == 0){
            throw new RuntimeException("Book's title cannot be empty");
        }
        if(book.getAuthor().length() == 0){
            throw new InvalidAuthorException("Book's authors cannot be empty");
        }
        Book savedBook = this.bookDAO.createBook(book);
        return savedBook;
    }

    @Override
    public Book getBookById(int id) {
        //we COULD do this
        // Book book = this.bookDAO.getBookById(id);
        // return book;
        //  ^  v The upper 2 lines vs the lower 1 line do the same thing and are both valid
        return this.bookDAO.getBookById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookDAO.getAllBooks();
    }

    @Override
    public Book updateBook(Book book) {
        if(book.getTitle().length() == 0){
            throw new RuntimeException("Book's title cannot be empty");
        }
        if(book.getAuthor().length() == 0){
            throw new RuntimeException("Book's authors cannot be empty");
        }
        return this.bookDAO.updateBook(book);
    }

    @Override
    public boolean deleteBookById(int id) {
        return this.bookDAO.deleteBookById(id);
    }
}
