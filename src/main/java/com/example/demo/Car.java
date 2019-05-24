package com.example.demo;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {

    @NotNull
    @Size(min=5)
    private String name;

    @NotNull
    @Size(min=4)
    private String year;

    @NotNull
    @Size(min=6)
    private String make;

    @NotNull
    @Size(min=3)
    private String model;

    public Car() {
    }

    public Car(@NotNull @Size(min = 5) String name, @NotNull @Size(min = 4) String year, @NotNull @Size(min = 6) String make, @NotNull @Size(min = 3) String model) {
        this.name = name;
        this.year = year;
        this.make = make;
        this.model = model;
    }

}
