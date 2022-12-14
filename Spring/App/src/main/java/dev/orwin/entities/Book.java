package dev.orwin.entities;

// Spring Data is an ORM. Object Relational Mapper
// It can take my classes in Java and relate them to specific tables in the database
// This relationship is defined through annotations
// Spring is VERY HEAVILY annotation driven

import javax.persistence.*;
import java.util.Objects;

@Entity // This is a class designed to be saved in the database
@Table(name = "books") // This is the table in database that the class will map to
public class Book {

    @Id // This is for the field that is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// This tells Spring that the value in this field is auto-generated by the database
    @Column(name = "id")// This is the name of the column in the database
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "return_date") //Spring automatically transforms lower-case camel case into snake case
    private double return_date; //We cannot use lower-case camel case. Spring is VERY OPINIONATED, it doesn't like this





    public Book() {
    }

    public Book(int id, String title, String author, double returnDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.return_date = returnDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", returnDate=" + return_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Double.compare(book.return_date, return_date) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, return_date);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getReturn_date() {
        return return_date;
    }
}
