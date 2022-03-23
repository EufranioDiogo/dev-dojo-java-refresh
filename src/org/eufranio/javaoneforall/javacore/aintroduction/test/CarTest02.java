package org.eufranio.javaoneforall.javacore.aintroduction.test;

import org.eufranio.javaoneforall.javacore.aintroduction.domain.Car;

public class CarTest02 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setName("Hyundai");
        car1.setModel("i10");
        car1.setYear(5);

        car2.setName("Bugatti");
        car2.setModel("Aventanor");
        car2.setYear(10);

        car1 = car2;
        System.out.println(car1);
        System.out.println("==================");
        System.out.println(car2);

        System.out.println("**********************");

        car1.setName("Hyundai");
        System.out.println(car1);
        System.out.println("==================");
        System.out.println(car2);

    }
}
