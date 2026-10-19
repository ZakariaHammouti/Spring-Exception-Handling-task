/*package de.neuefische.springexceptionhandlingtask.service;

import de.neuefische.springexceptionhandlingtask.model.BrandNotAcceptable;
import de.neuefische.springexceptionhandlingtask.model.GlobalExceptionHandler;
import de.neuefische.springexceptionhandlingtask.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CarService {

    List<Car> cars = List.of(new Car(
            "1", "BMW",
                    "M3", "Black"
    ),
            new Car(
                    "2", "Porsche",
                    "911", "Yellow"
            ));

    public String getCarBrand(String brand) {
        if (!brand.equals("porsche")) {
            throw new BrandNotAcceptable("Only 'porsche' allowed");
        }
        return brand;
    }

    public String getAllCars() {
        throw new NoSuchElementException("No Cars found");
    }
}
*/