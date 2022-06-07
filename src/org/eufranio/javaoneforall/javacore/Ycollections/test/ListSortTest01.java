package org.eufranio.javaoneforall.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.addAll(Arrays.asList(
                "BMW",
                "Mercedes",
                "Porsche",
                "Lamborghini"
        ));

        Collections.sort(cars);

        System.out.println(cars);
    }
}
