package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {

        Stream.iterate(0, n -> n + 1)
                .limit(500)
                .forEach(System.out::println);

        System.out.println("----------------------");

        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]}).limit(10)
                .forEach(fib -> {
                    String s = Arrays.toString(fib);

                    System.out.println(s);
                });

        System.out.println("----------------------");

        Stream.generate(() -> ThreadLocalRandom.current().nextInt(0, 10))
                .limit(10)
                .forEach(System.out::println);
    }
}
