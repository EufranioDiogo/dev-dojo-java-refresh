package org.eufranio.javaoneforall.javacore.Zgenerics.service;

import org.eufranio.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private List<Car> carsAvailable = new ArrayList<>(List.of(
            new Car("BMW"),
            new Car("Audi")
    ));

    public Car retrieveAvailableCar() {
        System.out.println("Searching for any car avaible");
        Car car = carsAvailable.remove(0);

        System.out.println("Renting the car: " + car);
        System.out.println("Available cars to rent: " + this.carsAvailable);

        return car;
    }


    public void returnRentedCar(Car car) {
        System.out.println("Returning car: " + car);
        this.carsAvailable.add(car);
        System.out.println("Available cars to rent" + this.carsAvailable);
    }
}
