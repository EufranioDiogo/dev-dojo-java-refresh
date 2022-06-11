package org.eufranio.javaoneforall.javacore.Zgenerics.test;

import org.eufranio.javaoneforall.javacore.Zgenerics.domain.Car;
import org.eufranio.javaoneforall.javacore.Zgenerics.service.CarRentalService;

public class GenericClassesTest01 {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.retrieveAvailableCar();

        System.out.println("Car used: ");
        carRentalService.returnRentedCar(car);
    }
}
