package dev.orwin.repos;

import dev.orwin.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // This interface is for performing CRUD interactions with the database
public interface BookRepo extends JpaRepository<Book,Integer> {
    // <Entity, Datatype of primary key>

     List<Book> findBooksByTitle(String title); // We are defining an abstract method
    // Spring Data can read that method stud, and generate a queries for you that will execute it
}
