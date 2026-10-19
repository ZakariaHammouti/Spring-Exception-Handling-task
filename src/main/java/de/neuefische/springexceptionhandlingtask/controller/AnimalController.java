/*package de.neuefische.springexceptionhandlingtask.controller;

import de.neuefische.springexceptionhandlingtask.model.ErrorMessage;
import de.neuefische.springexceptionhandlingtask.model.GlobalExceptionHandler;
import de.neuefische.springexceptionhandlingtask.model.SpeciesNotAcceptable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @GetMapping("{species}")
    String getAnimalSpecies(@PathVariable String species) {
        if (!species.equals("dog")) {
            throw new SpeciesNotAcceptable("Only 'dog' is allowed");
        }
        return species;
    }

    @GetMapping
    String getAllAnimals() {
        throw new GlobalExceptionHandler("No Animals found");
    }

    //local
    @ExceptionHandler(SpeciesNotAcceptable.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage handleGlobalNotAcceptableException(SpeciesNotAcceptable e) {
        return new ErrorMessage(e.getMessage());
    }

    //global
    @ExceptionHandler(GlobalExceptionHandler.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage handleGlobalNotAcceptableException(GlobalExceptionHandler e) {
        return new ErrorMessage(e.getMessage());
    }

}
*/