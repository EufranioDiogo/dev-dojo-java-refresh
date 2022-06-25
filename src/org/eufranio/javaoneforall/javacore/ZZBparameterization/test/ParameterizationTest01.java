package org.eufranio.javaoneforall.javacore.ZZBparameterization.test;

import org.eufranio.javaoneforall.javacore.ZZBparameterization.domain.Car;
import org.eufranio.javaoneforall.javacore.ZZBparameterization.interfaces.CarPredicate;

import java.util.List;
import java.util.stream.Collectors;

public class ParameterizationTest01 {
    private static List<Car> cars = List.of(new Car("Black", 2020), new Car("White", 2018), new Car("Red", 2007), new Car("Green", 2007));

    public static void main(String[] args) {
        List<Car> greenCars = filterCarsByColor(ParameterizationTest01.cars, "green");
        List<Car> redCars = filterCarsByColor(ParameterizationTest01.cars, "red");

        System.out.println(greenCars);
        System.out.println(redCars);

        List<Car> carsFilteredByYear = filterCarsByDate(ParameterizationTest01.cars, 2010);

        System.out.println(carsFilteredByYear);

    }

    private static List<Car> filterCarsByColor(List<Car> cars, String color) {
        return cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    private static List<Car> filterCarsByDate(List<Car> cars, int year) {
        return cars.stream()
                .filter(car -> car.getYear() < year)
                .collect(Collectors.toList());
    }

}
