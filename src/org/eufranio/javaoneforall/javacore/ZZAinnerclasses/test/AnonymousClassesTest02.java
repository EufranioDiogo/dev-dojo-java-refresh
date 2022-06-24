package org.eufranio.javaoneforall.javacore.ZZAinnerclasses.test;

import org.eufranio.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        System.out.println(this.toString());
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Volvo"), new Car("Audio")));

        cars.sort(Comparator.comparing(Car::getName));
        cars.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                System.out.println(this.toString());
                return o1.getName().compareTo(o2.getName());
            }
        });

        cars.sort(new CarComparator());

        System.out.println(cars);
    }
}
