package org.eufranio.javaoneforall.javacore.aintroduction.test;

import org.eufranio.javaoneforall.javacore.aintroduction.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car i10 = new Car();
        Car bugatti = new Car();

        i10.setName("Hyundai");
        i10.setModel("i10");
        i10.setYear(5);

        bugatti.setName("Bugatti");
        bugatti.setModel("Aventanor");
        bugatti.setYear(10);

        System.out.println(i10);
        System.out.println("==================");
        System.out.println(bugatti);
    }
}
