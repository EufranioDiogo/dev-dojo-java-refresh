package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1);

        numbers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        Integer reduce = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println("reduce = " + reduce);

        System.out.println(numbers.stream().reduce(0, Integer::sum));

        System.out.println("---------------");

        numbers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(numbers.stream().reduce(-1, (x, y) -> x > y ? x : y));
    }
}
