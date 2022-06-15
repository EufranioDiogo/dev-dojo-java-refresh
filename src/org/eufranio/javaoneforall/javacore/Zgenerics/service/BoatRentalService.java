package org.eufranio.javaoneforall.javacore.Zgenerics.service;

import org.eufranio.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private final List<Boat> boatsAvailable = new ArrayList<>(List.of(
            new Boat("V1"),
            new Boat("BT-70")
    ));

    public Boat retrieveAvailableBoat() {
        System.out.println("Searching for any boat avaible");
        Boat boat = boatsAvailable.remove(0);

        System.out.println("Renting the boat: " + boat);
        System.out.println("Available boats to rent: " + this.boatsAvailable);

        return boat;
    }


    public void returnRentedBoat(Boat boat) {
        System.out.println("Returning boat: " + boat);
        this.boatsAvailable.add(boat);
        System.out.println("Available boats to rent" + this.boatsAvailable);
    }
}
