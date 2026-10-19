package de.neuefische.springexceptionhandlingtask.model;

public class SpeciesNotAcceptable extends RuntimeException {
    public SpeciesNotAcceptable(String message) {
        super(message);
    }
}
