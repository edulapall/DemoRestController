package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    public ResponseEntity<StudentNotFound> handleException(Exception exception) {
        StudentNotFound error = new StudentNotFound();
        error.setMessage("The requested resource was not found. "+ exception.getMessage());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler

    public ResponseEntity<StudentNotFound> handleException(NumberFormatException exception) {
        StudentNotFound error = new StudentNotFound();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage("The requested resource was not found. " +exception.getMessage());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }
}
