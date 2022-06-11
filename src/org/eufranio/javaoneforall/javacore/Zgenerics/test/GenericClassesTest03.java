package org.eufranio.javaoneforall.javacore.Zgenerics.test;

import org.eufranio.javaoneforall.javacore.Zgenerics.domain.Car;
import org.eufranio.javaoneforall.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest03 {
    public static void main(String[] args) {
        RentalService<Car> carRentalService = new RentalService<>(
                new ArrayList<>(List.of(
                        new Car("BMW"),
                        new Car("Toyota"),
                        new Car("Mercedes")
                ))
        );

        carRentalService.retrieveAvailableVehicle();
        carRentalService.retrieveAvailableVehicle();
        carRentalService.retrieveAvailableVehicle();
    }
}
