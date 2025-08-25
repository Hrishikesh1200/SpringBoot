package com.example.SpringWeb.Exception;
// GlobalExceptionHandler.java

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  // 👈 tells Spring this is a global exception handler
public class GlobalExceptionHandler {

    // 1️⃣ Handle ResourceNotFoundException
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFound(ResourceNotFoundException ex) {
        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),       // error message from exception
                "Resource Not Found"   // custom details
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // 2️⃣ Handle BadRequestException
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handleBadRequest(BadRequestException ex) {
        ErrorResponse error = new ErrorResponse(ex.getMessage(), "Invalid Request");
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    // 3️⃣ Handle Validation Errors (like @Valid in DTOs)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationErrors(MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        ErrorResponse error = new ErrorResponse(message, "Validation Error");
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    // 4️⃣ Handle Any Other Exception (Fallback)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex) {
        ErrorResponse error = new ErrorResponse(ex.getMessage(), "Internal Server Error");
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
