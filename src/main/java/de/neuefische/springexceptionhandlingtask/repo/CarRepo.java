package de.neuefische.springexceptionhandlingtask.repo;

import de.neuefische.springexceptionhandlingtask.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends MongoRepository<Car, String> {
}
