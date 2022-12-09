package edu.ifms.tads6.dsd_web_spring_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ArithmeticException extends RuntimeException {
    public ArithmeticException(String message) {
        super(message);
    }   
}