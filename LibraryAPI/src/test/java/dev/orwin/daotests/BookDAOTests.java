package dev.orwin.daotests;

import dev.orwin.entities.Book;
import dev.orwin.repositories.BookDAO;
import dev.orwin.repositories.BookDAOLocal;
import dev.orwin.repositories.BookDAOPostgres;
import dev.orwin.util.ConnectionFactory;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BookDAOTests {

    static BookDAO bookDAO = new BookDAOPostgres();

    @BeforeAll
    static void setup(){
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "drop table if exists book";
            Statement statement = connection.createStatement();
            statement.execute(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "create table book(\n" +
                    "\t id serial primary key,\n" +
                    "\t title varchar(40) not null,\n" +
                    "\t author varchar(40) not null,\n" +
                    "\t returnDate int default 0\n" +
                    ");";
            Statement statement = connection.createStatement();
            statement.execute(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    // this is kabob case, tests are written in kabob case
    @Test
    @Order(1)
    void create_book_test(){
        Book newBook = new Book(0,"Peter Pan","Robin Williams",0);
        Book savedBook = bookDAO.createBook(newBook);
        Assertions.assertNotEquals(0,savedBook.getId());
    }
    @Test
    @Order(2)
    void get_book_by_id_test(){
        Book gottenBook = bookDAO.getBookById(1);
        Assertions.assertEquals("Peter Pan",gottenBook.getTitle());
    }
    @Test
    @Order(3)
    void update_book_test(){
        //When testing update, you should either get the book and use its values or create a completely new book and use those values
        Book book = bookDAO.getBookById(1);
        //You can think of update more of a full replacement/swap and less of specific values being update
        Book bookV2 = new Book(book.getId(),book.getTitle(),"James Matthew Barrie",book.getReturnDate());
        bookDAO.updateBook(bookV2);
        Book updatedBook = bookDAO.getBookById(bookV2.getId());
        Assertions.assertEquals("James Matthew Barrie",updatedBook.getAuthor());
    }
    @Test
    @Order(4)
    void delete_book_by_id_test(){
        boolean result = bookDAO.deleteBookById(1);
        Assertions.assertTrue(result);
    }
    @AfterAll
    static void teardown(){
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "drop table if exists book";
            Statement statement = connection.createStatement();
            statement.execute(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "create table book(\n" +
                    "\t id serial primary key,\n" +
                    "\t title varchar(40) not null,\n" +
                    "\t author varchar(40) not null,\n" +
                    "\t returnDate int default 0\n" +
                    ");";
            Statement statement = connection.createStatement();
            statement.execute(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

}
