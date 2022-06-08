package org.eufranio.javaoneforall.javacore.Ycollections.test;

import org.eufranio.javaoneforall.javacore.Ycollections.domain.Car;
import org.eufranio.javaoneforall.javacore.Ycollections.domain.Smartphone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneComparableBySerialNumber implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getSerialNumber().compareToIgnoreCase(o2.getSerialNumber());
    }
}

class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        // the classes in NavigableSet must implements comparable
        NavigableSet<Smartphone> smartphonesSet = new TreeSet<>(new SmartphoneComparableBySerialNumber());

        smartphonesSet.add(new Smartphone("1234", "S-1", "Mercedes"));
        smartphonesSet.add(new Smartphone("1334", "S-2", "Mercedes"));
        smartphonesSet.add(new Smartphone("1564", "S-3", "Mercedes"));
        smartphonesSet.add(new Smartphone("1234", "S-5", "Mercedes Plus"));

        System.out.println(smartphonesSet);

        NavigableSet<Car> carSet = new TreeSet<>(new CarPriceComparator());

        Car car1 = new Car(5, "M8", "BMW", 1_000_000);
        Car car2 = new Car(3, "SE10", "Mercedes", 2_000_000);
        Car car3 = new Car(2, "Alto", "Porsche", 3_000_000);
        Car car4 = new Car(1, "Alto 800", "Suzuki", 4_000_000);

        carSet.addAll(Arrays.asList(car1, car2, car3, car4));


        carSet.forEach(System.out::println);

        Car newCar = new Car(20, "Land Cruiser", "Toyota", 2_500_000);
        // 4 good methods of NavigableSet

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("--------------------------------------");
        System.out.println("lower: ");
        System.out.println(carSet.lower(newCar));
        System.out.println("floor: ");
        System.out.println(carSet.floor(newCar));
        System.out.println("higher: ");
        System.out.println(carSet.higher(newCar));
        System.out.println("ceiling: ");
        System.out.println(carSet.ceiling(newCar));

        System.out.println("--------------------------------------------");
        System.out.println(carSet.size());
        System.out.println(carSet.pollFirst());
        System.out.println(carSet.size());
        System.out.println("---------------------------------------------");

    }
}
