package dev.orwin.handlers;

import com.google.gson.Gson;
import dev.orwin.driver.Driver;
import dev.orwin.entities.Book;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class CreateBookHandler implements Handler {
    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        String json = ctx.body();
        Gson gson = new Gson();
        Book book = gson.fromJson(json, Book.class);
        Book registeredBook = Driver.bookService.createBook(book);
        String bookJson = gson.toJson(registeredBook);
        ctx.status(201); //This is a status code that will tell us how things went
        ctx.result(bookJson);
    }
}
