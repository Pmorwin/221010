package dev.orwin.driver;

import dev.orwin.controllers.BookController;
import dev.orwin.handlers.*;
import dev.orwin.repositories.BookDAO;
import dev.orwin.repositories.BookDAOLocal;
import io.javalin.Javalin;

public class Driver {

    public static BookDAO bookDAO = new BookDAOLocal();
    public static void main(String[] args) {
        Javalin app = Javalin.create();

        HelloHandler helloHandler = new HelloHandler();
//        GetBookByIdHandler getBookByIdHandler = new GetBookByIdHandler();
//        CreateBookHandler createBookHandler = new CreateBookHandler();
//        UpdateBookHandler updateBookHandler = new UpdateBookHandler();
//        DeleteBookHandler deleteBookHandler = new DeleteBookHandler();
        BookController bookController = new BookController();


        app.get("/hello", helloHandler);

        app.get("/books/{id}", bookController.getBookByIdHandler);

        app.post("/books", bookController.createBook);

        app.put("/books", bookController.updateBookHandler);

        app.delete("/books/{id}", bookController.deleteBookHandler);



        app.start();
    }
}
