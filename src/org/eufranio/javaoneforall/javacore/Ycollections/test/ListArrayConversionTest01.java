package org.eufranio.javaoneforall.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numberList01 = new ArrayList<>();

        numberList01.add(1);
        numberList01.add(2);
        numberList01.add(3);
        numberList01.add(4);

        Integer[] integers = numberList01.toArray(new Integer[0]);
        System.out.println(numberList01);
        System.out.println(Arrays.toString(integers));

        System.out.println("\n-----------------------\n");

        Integer[] arraysOfAges = new Integer[]{1, 2, 3};

        List<Integer> listOfAges = Arrays.asList(arraysOfAges);

        listOfAges.set(0, 10);

        System.out.println(Arrays.toString(arraysOfAges));
        System.out.println(listOfAges);

        List<Integer> listOfAgesWithoutReference = new ArrayList<>(Arrays.asList(arraysOfAges));

        listOfAgesWithoutReference.add(10);

        System.out.println(listOfAgesWithoutReference);


        Arrays.asList(1, 2, 3, 4); // Create an immutable list in size
        List.of(1, 2, 3, 4); // Create and mutable list

    }
}
