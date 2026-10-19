package de.neuefische.springexceptionhandlingtask.model;

public class ExceptionNotFound extends RuntimeException {
    public ExceptionNotFound(String message) {
        super(message);
    }
}
