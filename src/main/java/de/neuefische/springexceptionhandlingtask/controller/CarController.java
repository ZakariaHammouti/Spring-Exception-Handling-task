package de.neuefische.springexceptionhandlingtask.controller;
import de.neuefische.springexceptionhandlingtask.model.*;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @GetMapping("{brand}")
    String getCarBrand(@PathVariable String brand) {
        if (!brand.equals("porsche")) {
            throw new ExceptionBadRequest("Only porsche" +
                    " brands are supported: ");
        }
        return brand;
    }

    @GetMapping
    public String getAllCars() {
            throw new ExceptionNotFound("No Cars found");
    }

/*
    @ExceptionHandler(ExceptionBadRequest.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage handleBadRequestException(ExceptionBadRequest e) {
        return new ErrorMessage("from local");
    }*/
}
