package dev.orwin.controllers;

import dev.orwin.entities.Book;
import dev.orwin.services.BookService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller // This stereotype annotation is saying that this class is used for defining routes for web apps
public class BookController {

    Logger logger = LogManager.getLogger(BookController.class); // Create a logger instance


    @Autowired
    BookService bookService;

    @GetMapping("/books")
    @ResponseBody // This will automatically convert the return into a JSON object
    public List<Book> getAllBooks(@RequestParam(required = false) String title){
        logger.info("Request to GET /books");


        if(title == null){
            return bookService.getAllBooks();
        }
        else{
            return bookService.getBookByTitle(title);
        }
    }

//    @GetMapping("/books")
//    @ResponseBody // This will automatically convert the return into a JSON object
//    public List<Book> getAllBooks(){
//        return bookService.getAllBooks();
//    }

    @PostMapping("/books")
    @ResponseBody
    public ResponseEntity<Book> createBook(@RequestBody Book body){ // It expects the request body to be a JSON that can be turned into a Book
        Book savedBook = this.bookService.registerBook(body);
        return new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
    }


//    @PostMapping
//    @ResponseBody
//    public Book createBook(@RequestBody Book body){ // It expects the request body to be a JSON that can be turned into a Book
//        Book savedBook = this.bookService.registerBook(body);
//        return savedBook;
//    }

    @GetMapping("/books/{id}")
    @ResponseBody
    public Book getBookById(@PathVariable String id){ // PathVariable IS A STRING
        int bookId = Integer.parseInt(id);
        return bookService.getBookById(bookId);
    }


}
