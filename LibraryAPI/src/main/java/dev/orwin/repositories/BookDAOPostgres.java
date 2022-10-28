package dev.orwin.repositories;


import dev.orwin.util.ConnectionFactory;
import dev.orwin.entities.Book;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//YOUR NAMES IN YOUR SQL DATABASE SHOULD MATCH YOUR VARIABLES IN JAVA
// It will make your life 100000% easier when using JDBC
public class BookDAOPostgres implements BookDAO{
    @Override
    public Book createBook(Book book) {
        // try with resources. This will create our connection and end the connection when the try block is over
        // or if something fails, it will end after the catch
        try(Connection connection = ConnectionFactory.getConnection()){
            // Here is the unfun thing about JDBC, you have to write SQL statements in Java
            // I recommend putting in comments the SQL command you are trying to execute
            //INSERT INTO books VALUES (DEFAULT, 'Great Gatsby', 'F. Scott Fitts Jerald', 0);
            String sql = "insert into books values(default, ?, ? , ?)";
            // The only thing in the sql String that isnt "just a string" are the question marks
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            // We use Return generated Keys, to get back the primary key of our newly created book
            //Parameters START at 1, they are not indexed at 0
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2,book.getAuthor());
            preparedStatement.setLong(3,book.getReturnDate());

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();//this returns the id that was created
            resultSet.next();//you need to move the cursor to the first valid record, or you will get a null response
            int generatedKey = resultSet.getInt("id");
            book.setId(generatedKey);
            return book;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Book getBookById(int id) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "select * from books where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            // The class PreparedStatement has a method called prepareStatement (no d) that takes in a string
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();
            rs.next();

            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setReturnDate(rs.getLong("returnDate"));

            return book;

        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }



    }

    @Override
    public List<Book> getAllBooks() {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "select * from books";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            List<Book> bookList = new ArrayList();

            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setReturnDate(rs.getLong("returnDate"));
                bookList.add(book);
            }
            return bookList;

        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Book updateBook(Book book) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "update books set title = ?, author = ?, returnDate = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2,book.getAuthor());
            preparedStatement.setLong(3,book.getReturnDate());
            preparedStatement.setInt(4,book.getId());

            preparedStatement.executeUpdate();
            return book;
        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }


    @Override
    public boolean deleteBookById(int id) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "delete from books where id =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,id);

            preparedStatement.execute();
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
