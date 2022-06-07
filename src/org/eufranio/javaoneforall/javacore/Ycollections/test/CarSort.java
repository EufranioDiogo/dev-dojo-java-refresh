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

        Car car1 = new Car(5, "M8", "BMW", 1_000_000);
        Car car2 = new Car(3, "SE10", "Mercedes", 2_000_000);
        Car car3 = new Car(2, "Alto", "Porsche", 3_000_000);
        Car car4 = new Car(1, "Alto 800", "Suzuki", 4_000_000);

        listOfCars.addAll(Arrays.asList(
                car1,
                car2,
                car3,
                car4
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

        Collections.sort(listOfCars);
        System.out.println("\nLocate car3");
        int resultIndex = Collections.binarySearch(listOfCars, car3);

        System.out.println("Result Index: " + resultIndex);

        System.out.println("\nLocate car M8 - BMW - By Title");
        CarComparatorByModel carComparatorByModel = new CarComparatorByModel();

        Collections.sort(listOfCars, carComparatorByModel);

        int resultIndex2 = Collections.binarySearch(listOfCars, car1, carComparatorByModel);

        System.out.println("Result Index: " + resultIndex2);


    }
}
