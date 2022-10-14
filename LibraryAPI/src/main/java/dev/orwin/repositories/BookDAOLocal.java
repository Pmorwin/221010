package dev.orwin.repositories;

import dev.orwin.entities.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// With interfaces, you MUST override all methods when implementing one into a non-abstract class
public class BookDAOLocal implements BookDAO{
    //You cannot use primitives in teh collections framework
    //This means for Maps, Lists, Arrays, and Sets, you cannot use ints or longs, ONLY Objects
    //This is where Wrappers classes come in, Wrapper classes are objects, and are kiiiiinda primitives
    // Wrapper classes are primitive-like objects, but they do effectively the same thing
    // How do I convert to wrapper classes? YOU DONT! Auto-boxing and Auto-unboxing exist in Java 8, which means, it does it automatically
    private Map<Integer,Book> bookTable = new HashMap();
    private int idCount = 1;


    @Override
    public Book createBook(Book book) {
        book.setId(idCount);
        idCount++;
        bookTable.put(book.getId(),book);
        System.out.println(bookTable.values());
        return book;
    }

    @Override
    public Book getBookById(int id) {
        return bookTable.get(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book updateBook(Book book) {
        return bookTable.put(book.getId(), book); //This overwrites that spot in the map
        // put returns the book that you replaced
    }

    @Override
    public boolean deleteBookById(int id) {
        Book book = bookTable.remove(id); //This removes method returns the object that was removed from the map
        if(book == null){
            return false;
        }
        else {
            return true;
        }
    }
}
