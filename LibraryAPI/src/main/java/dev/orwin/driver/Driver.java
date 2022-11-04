package dev.orwin.driver;

import dev.orwin.controllers.BookController;
import dev.orwin.handlers.*;
import dev.orwin.repositories.BookDAO;
import dev.orwin.repositories.BookDAOLocal;
import dev.orwin.repositories.BookDAOPostgres;
import dev.orwin.services.BookService;
import dev.orwin.services.BookServiceImpl;
import io.javalin.Javalin;

public class Driver {

    // Because I am using dependency injection in my Service, I need to add my bookDAO as an argument when making a static object
    // If you make a static object of your Service, you can use this single instance throughout your application
    public static BookService bookService = new BookServiceImpl(new BookDAOPostgres());
    public static void main(String[] args) {
        Javalin app = Javalin.create(

                //config lambda - lets us specify certain configurations for our Javalin app
                config -> {
                    config.enableCorsForAllOrigins(); //lets us process HTTP requests from anywhere
                }
                //may not need to do this if you've containerized? Patrick may know lol
        );

        HelloHandler helloHandler = new HelloHandler();
//        GetBookByIdHandler getBookByIdHandler = new GetBookByIdHandler();
//        CreateBookHandler createBookHandler = new CreateBookHandler();
//        UpdateBookHandler updateBookHandler = new UpdateBookHandler();
//        DeleteBookHandler deleteBookHandler = new DeleteBookHandler();
        BookController bookController = new BookController();


        app.get("/hello", helloHandler);

        app.get("/books/{id}", bookController.getBookByIdHandler);

        app.get("/books", bookController.getAllBooks);

        app.post("/books", bookController.createBook);

        app.put("/books", bookController.updateBookHandler);

        app.delete("/books/{id}", bookController.deleteBookHandler);



        app.start();
    }
}
