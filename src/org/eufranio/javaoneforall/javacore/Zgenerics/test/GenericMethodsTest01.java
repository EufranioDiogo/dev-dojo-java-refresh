package org.eufranio.javaoneforall.javacore.Zgenerics.test;

import org.eufranio.javaoneforall.javacore.Oexception.exception.domain.Person;
import org.eufranio.javaoneforall.javacore.Zgenerics.domain.Boat;
import org.eufranio.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        List<Car> cars = createArrayWithOneObject(new Car("Mercedes"));
        List<Boat> boats = createArrayWithOneObject(new Boat("BT-70"));

        System.out.println(cars);
        System.out.println(boats);
    }

    private static <T> List<T> createArrayWithOneObject(T t) {
        List<T> list = List.of(t);
        System.out.println(list);

        return list;
    }
}

class SeveralTypes<T, X, A> {
    private T t;
    private X x;
    private A a;
}
