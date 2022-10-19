package dev.orwin.handlers;

import com.google.gson.Gson;
import dev.orwin.driver.Driver;
import dev.orwin.entities.Book;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class GetBookByIdHandler implements Handler {
    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        int id = Integer.parseInt(ctx.pathParam("id"));//This will take what value was in the {id} and turn it into an int for us to use
        Book book = Driver.bookService.getBookById(id);
        Gson gson = new Gson();
        String json = gson.toJson(book);
        ctx.result(json);
    }
}
