package de.neuefische.springexceptionhandlingtask.model;

import de.neuefische.springexceptionhandlingtask.model.ErrorMessage;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //getAll
    @ExceptionHandler(ExceptionNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage handleNotAcceptableException(ExceptionNotFound e) {
        return new ErrorMessage(e.getMessage());
    }

    //getOne
    @ExceptionHandler(ExceptionBadRequest.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage handleBadRequestException(ExceptionBadRequest e) {
        return new ErrorMessage(e.getMessage());
    }

    //Internal Server error
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage handleRunTimeException(Exception e) {
        return new ErrorMessage(e.getMessage());
    }


}

