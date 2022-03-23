package org.eufranio.javaoneforall.javacore.bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.bintroductionmethods.domain.Car;
import org.eufranio.javaoneforall.javacore.bintroductionmethods.domain.PaintShop;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        PaintShop paintShop = new PaintShop();

        car.setModel("M-15");
        car.setName("Volvo");
        car.setYear(2022);

        System.out.println(car);
        System.out.println("==============");
        paintShop.changePaint(car, "Yellow");
        System.out.println(car);
    }
}
