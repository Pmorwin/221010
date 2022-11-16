package dev.orwin.App;

import dev.orwin.entities.Book;
import dev.orwin.repos.BookRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class BookRepoTests {

    @Autowired // Spring will check the Application Context to see if there is a bean that satisfies this dependency
    // Spring Data will then create a BEAN of BookRepo for us based off of ORM mapping in our entity
    // Spring will then inject the dependency automatically. So we dont need to make a PostgresDAO, it is written for us automatically
    BookRepo bookRepo;

    @Test
    public void create_book(){
        Book book = new Book(0,"Hungy Gamer","Hungry People",0);
        Book savedBook = this.bookRepo.save(book);
        System.out.println(savedBook);
        Assertions.assertNotEquals(0,savedBook.getId());
    }

    @Test
    public void get_book(){
        Book book = this.bookRepo.findById(4).get();// The reason we have to do .get() is because find return an Optional
        System.out.println(book);
        Assertions.assertNotNull(book.getId());
    }

    @Test
    public void get_nonexistent_book(){
        //There are times when you get by id and the book does not exist
        Optional<Book> possibleBook = this.bookRepo.findById(4444);
        if (possibleBook.isPresent()){
            Book book = possibleBook.get();
            System.out.println(book);
        }
        else{
            // If no book was returned to us this will go off
            System.out.println("No Book was found");
        }
    }

    @Test
    public void get_all_books(){
        List<Book> books = this.bookRepo.findAll();
        System.out.println(books);
    }

    @Test
    public void get_books_by_title(){
        List<Book> repeatedBooks = this.bookRepo.findBooksByTitle("Hungy Gamer");
        System.out.println(repeatedBooks);
    }

    public void update_book(){
        Book replacement = new Book(9,"Little", "Tony",0);
        this.bookRepo.save(replacement); //This will overwrite the book with id 9
        // Save will make a NEW entity in your table if you set the id to 0
        // Save will REPLACE the entity in your table if the id is NOT 0
        // Spring DOES NOT HAVE A TRUE UPDATE METHOD
    }





}
