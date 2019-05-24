package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/*
public class CarRepository {
    CarRepository repository;
}
*/

public interface CarRepository extends CrudRepository<Car, Long> {
}
