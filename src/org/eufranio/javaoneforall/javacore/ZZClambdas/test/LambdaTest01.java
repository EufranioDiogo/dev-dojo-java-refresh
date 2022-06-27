package org.eufranio.javaoneforall.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Eufránio", "Creuma", "William");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        forEach(names, System.out::println);
        forEach(numbers, System.out::println);

        System.out.println(modify(names, String::length));

        List<String> namesWithUcaSuffix = modify(names, (name) -> name + " - UCAN");

        System.out.println(namesWithUcaSuffix);
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }

    public static <T,R> List<R> modify(List<T> names, Function<T, R> function) {
        return names.stream()
                .map(function::apply)
                .collect(Collectors.toList());
    }
}
