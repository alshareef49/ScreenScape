package com.screenscape.utility;

import com.screenscape.exception.InvalidMovieException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LoggingControllerAdvice {
    @ExceptionHandler(InvalidMovieException.class)
    public ResponseEntity<String> handleMovieException(InvalidMovieException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
