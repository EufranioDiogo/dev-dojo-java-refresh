package org.eufranio.javaoneforall.javacore.ZZBparameterization.test;

import org.eufranio.javaoneforall.javacore.ZZBparameterization.domain.Car;
import org.eufranio.javaoneforall.javacore.ZZBparameterization.interfaces._Predicate;

import java.util.List;
import java.util.stream.Collectors;

public class ParameterizationTest03 {
    private static List<Car> cars = List.of(new Car("Black", 2020), new Car("White", 2018), new Car("Red", 2007), new Car("Green", 2007));

    public static void main(String[] args) {
        System.out.println(filter(cars, car -> car.getColor().equalsIgnoreCase("green")));
        System.out.println(filter(cars, car -> car.getColor().equalsIgnoreCase("red")));
        System.out.println(filter(cars, car -> car.getYear() < 2015));

    }

    private static <T> List<T> filter(List<T> cars, _Predicate<T> predicate) {
        return cars.stream()
                .filter(car -> predicate.test(car))
                .collect(Collectors.toList());
    }

}
