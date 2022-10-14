package dev.orwin.driver;

import dev.orwin.handlers.*;
import dev.orwin.repositories.BookDAO;
import dev.orwin.repositories.BookDAOLocal;
import io.javalin.Javalin;

public class Driver {

    public static BookDAO bookDAO = new BookDAOLocal();
    public static void main(String[] args) {
        Javalin app = Javalin.create();

        HelloHandler helloHandler = new HelloHandler();
        GetBookByIdHandler getBookByIdHandler = new GetBookByIdHandler();
        CreateBookHandler createBookHandler = new CreateBookHandler();
        UpdateBookHandler updateBookHandler = new UpdateBookHandler();
        DeleteBookHandler deleteBookHandler = new DeleteBookHandler();

        app.get("/hello", helloHandler);

        app.get("/books/{id}", getBookByIdHandler);

        app.post("/books", createBookHandler);

        app.put("/books", updateBookHandler);

        app.delete("/books/{id}", deleteBookHandler);



        app.start();
    }
}
