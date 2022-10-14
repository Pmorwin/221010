package dev.orwin.handlers;

import io.javalin.http.Context;

import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class HelloHandler implements Handler {
    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        ctx.result("How are you doing today?");
    }
}
