package org.eufranio.javaoneforall.javacore.Ycollections.test;

import org.eufranio.javaoneforall.javacore.Ycollections.domain.Car;

import java.util.*;
import java.util.stream.Collectors;

class CarComparatorByModel implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}

public class CarSort {
    public static void main(String[] args) {
        List<Car> listOfCars = new ArrayList<>();

        listOfCars.addAll(Arrays.asList(
                new Car(5, "M8", "BMW", 1_000_000),
                new Car(3, "SE10", "Mercedes", 2_000_000),
                new Car(2, "Alto", "Porsche", 3_000_000),
                new Car(1, "Alto 800", "Suzuki", 4_000_000)
        ));

        System.out.println("-----------------------------");
        listOfCars.stream().map(car -> {
            System.out.println(car);
            return null;
        }).collect(Collectors.toList());

        System.out.println("-----------------------------");
        Collections.sort(listOfCars);

        listOfCars.stream().map(car -> {
            System.out.println(car);
            return null;
        }).collect(Collectors.toList());

        System.out.println("-----------------------------");
        listOfCars.sort(new CarComparatorByModel());

        listOfCars.stream().map(car -> {
            System.out.println(car);
            return null;
        }).collect(Collectors.toList());


    }
}
