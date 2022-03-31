package org.eufranio.javaoneforall.Einitializationblock.test;

import org.eufranio.javaoneforall.Einitializationblock.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 270);
        Car car2 = new Car("Mercedes", 285);
        Car car3 = new Car("Audi", 290);

        Car.setSpeedLimit(180);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}
