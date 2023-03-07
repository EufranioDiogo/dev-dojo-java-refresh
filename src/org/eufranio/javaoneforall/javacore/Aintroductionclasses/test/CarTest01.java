package org.eufranio.javaoneforall.javacore.Aintroductionclasses.test;

import org.eufranio.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {

    public static void main(String[] args) {
        Car suzukiAlto = new Car("Suziki", "Alto", 2019);
        Car bmwX9 = new Car("BMW", "X9", 2023);

        System.out.println(suzukiAlto);
        System.out.println(bmwX9);
    }

}
