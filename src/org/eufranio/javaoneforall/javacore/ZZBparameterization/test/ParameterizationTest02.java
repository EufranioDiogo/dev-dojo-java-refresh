package org.eufranio.javaoneforall.javacore.ZZBparameterization.test;

import org.eufranio.javaoneforall.javacore.ZZBparameterization.domain.Boat;
import org.eufranio.javaoneforall.javacore.ZZBparameterization.domain.Car;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ParameterizationTest02 {
    private static List<Car> cars = List.of(
            new Car("Black", 2020),
            new Car("White", 2018),
            new Car("Red", 2007),
            new Car("Green", 2007)
    );
    private static List<Boat> boats = List.of(
            new Boat("Marrom", 2000, 10L),
            new Boat("White", 2005, 25L)
    );

    public static void main(String[] args) {
            List<Car> filteredByColor = filter(cars, car -> car.getColor().equalsIgnoreCase("black"));
            List<Boat> filteredByMaxCapacity = filter(boats, boat -> boat.getMAX_CAPACITY() > 10);

        System.out.println(filteredByColor);
        System.out.println(filteredByMaxCapacity);
    }

    public static  <T> List<T> filter(List<T> e, Predicate<T> p) {
        return e.stream().filter(element -> p.test(element)).collect(Collectors.toList());
    }

}
