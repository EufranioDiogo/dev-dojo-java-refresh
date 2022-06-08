package org.eufranio.javaoneforall.javacore.Ycollections.test;

import org.eufranio.javaoneforall.javacore.Ycollections.domain.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();

        carSet.add(new Car(1, "X5", "BMW", 20_000, 0));
        carSet.add(new Car(2, "M8", "BMW", 35_000, 2));
        carSet.add(new Car(3, "Land Cruiser", "Toyota", 17_500, 3));
        carSet.add(new Car(4, "Avensa", "Toyota", 13_000, 0));
        carSet.add(new Car(6, "Alto", "Suzuki", 5_000, 1));

        for (Car car :
                carSet) {
            System.out.println(car);
        }
    }
}
