package dev.orwin.controllers;

import com.google.gson.Gson;
import dev.orwin.driver.Driver;
import dev.orwin.entities.Book;
import io.javalin.http.Handler;

import java.util.List;

public class BookController {
    // These controllers and using what is called Lambdas
    public Handler createBook = (ctx) ->{
        String json = ctx.body();
        Gson gson = new Gson();
        Book book = gson.fromJson(json, Book.class);
        Book registeredBook = Driver.bookService.createBook(book);
        String bookJson = gson.toJson(registeredBook);
        ctx.status(201); //This is a status code that will tell us how things went
        ctx.result(bookJson);
    };

    public Handler getBookByIdHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));//This will take what value was in the {id} and turn it into an int for us to use
        Book book = Driver.bookService.getBookById(id);
        Gson gson = new Gson();
        String json = gson.toJson(book);
        ctx.result(json);
    };

    public Handler getAllBooks = (ctx) ->{
      List<Book> books = Driver.bookService.getAllBooks();
      Gson gson = new Gson();
      String json = gson.toJson(books);
      ctx.result(json);
    };

    public Handler updateBookHandler = (ctx) ->{
        String bookJSON = ctx.body();
        Gson gson = new Gson();
        Book book = gson.fromJson(bookJSON, Book.class);
        Book updateBook = Driver.bookService.updateBook(book);
        String json = gson.toJson(updateBook);
        ctx.result(json);
    };


    public Handler deleteBookHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));
        boolean result = Driver.bookService.deleteBookById(id);
        if(result){
            ctx.status(204);
        }
        else{
            ctx.status(400);
            ctx.result("Could not process your delete request");
        }
    };

}
