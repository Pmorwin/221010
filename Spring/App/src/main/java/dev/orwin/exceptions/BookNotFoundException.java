package dev.orwin.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No Book Found matching that Id")
public class BookNotFoundException extends RuntimeException{
}
