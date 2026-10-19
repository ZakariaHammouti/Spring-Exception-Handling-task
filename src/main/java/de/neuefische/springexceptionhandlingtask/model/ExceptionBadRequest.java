package de.neuefische.springexceptionhandlingtask.model;

public class ExceptionBadRequest extends RuntimeException {
    public ExceptionBadRequest(String message) {
        super(message);
    }
}
