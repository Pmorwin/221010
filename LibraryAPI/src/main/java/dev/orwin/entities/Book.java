package dev.orwin.entities;

import java.util.Objects;

public class Book {
    private int id; //If you dont give a value it defaults to the default value, for ints that is 0
    private String title; //For strings the default value is "" (an empty string)
    private String author;
    private long returnDate; //We will cheat and combine this with "isCheckedOut" by making 0 == isNotCheckedOut
    private Status status; //this can now ONLY be 1 of 3 values (PENDING, APPROVED, DENIED)
    // You DO NOT HAVE to use Enums, but I think they are cool, and you should give them a shot
    // Not much changes with these, except for in the DAO, instead of JUST being able to do
    // book.getStatus(), you need to do book.getStatus().name()
    // and with get requests, instead of being able to do rs.getString("status")
    // You need to do book.valueOf(rs.get(String("status"))




    // Everything below here is what is called Boiler plate code
    // Which is another way of saying the code is so simple, the IDE can create it for you



    //If I create a no-args book, it is empty and a perfect model to insert values into
    public Book() {//no-args constructor
    }

    //All-args constructor
    public Book(int id, String title, String author, long returnDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", returnDate=" + returnDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && returnDate == book.returnDate && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, returnDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(long returnDate) {
        this.returnDate = returnDate;
    }
}
