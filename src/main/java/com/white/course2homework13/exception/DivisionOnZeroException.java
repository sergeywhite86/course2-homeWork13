package com.white.course2homework13.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivisionOnZeroException extends IllegalArgumentException{
    public DivisionOnZeroException() {
        super("Делить на ноль нельзя");
    }
}
