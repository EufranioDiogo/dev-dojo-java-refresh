package org.eufranio.javaoneforall.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> veichleAvaible;

    public RentalService(List<T> veichleAvaible) {
        this.veichleAvaible = veichleAvaible;
    }

    public T retrieveAvailableVehicle() {
        System.out.println("Searching for any vehicle avaible");
        T vehicle = veichleAvaible.remove(0);

        System.out.println("Renting the vehicle: " + vehicle);
        System.out.println("Available vehicles to rent: " + this.veichleAvaible);

        return vehicle;
    }


    public void returnRentedVehicle(T vehicle) {
        System.out.println("Returning vehicle: " + vehicle);
        this.veichleAvaible.add(vehicle);
        System.out.println("Available vehicles to rent" + this.veichleAvaible);
    }
}
