package org.eufranio.javaoneforall.javacore.Jfinalmodifier.test;

import org.eufranio.javaoneforall.javacore.Jfinalmodifier.domain.Buyer;
import org.eufranio.javaoneforall.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car("BMW", new Buyer("Eufránio Diogo"));

        System.out.println(car);
        System.out.println(Car.SPEED_LIMIT);
        car.getBUYER().setName("Creuma Kuzola");
        System.out.println(car);

    }
}
