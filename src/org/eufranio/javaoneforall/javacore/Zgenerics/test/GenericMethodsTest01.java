package org.eufranio.javaoneforall.javacore.Zgenerics.test;

import org.eufranio.javaoneforall.javacore.Oexception.exception.domain.Person;
import org.eufranio.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        createArrayWithOneObject(new Car("Mercedes"));
        createArrayWithOneObject(new Car("BMW"));
    }

    private static <T> void createArrayWithOneObject(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }
}

class SeveralTypes<T, X, A> {
    private T t;
    private X x;
    private A a;
}
