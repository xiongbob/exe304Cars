package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    CarRepository repository;

    @Override
    public void run(String...strings) throws Exception{
        Car car = new Car("Ford","2011","Ford","12843054");
        repository.save(car);

        car = new Car("Canry","2017","Toyato","LE1298978");
        repository.save(car);

        car = new Car("Linkan","2008","Ford","Lux9839q2849");
        repository.save(car);

    }

}
