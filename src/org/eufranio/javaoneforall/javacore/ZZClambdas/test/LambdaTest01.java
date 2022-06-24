package org.eufranio.javaoneforall.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Eufránio", "Creuma", "William");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        forEach(names, System.out::println);
        forEach(numbers, System.out::println);

        System.out.println(modify(names, name -> name + " Diogo"));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }

    private static <T, R> List<R> modify(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        list.forEach(element -> {
            result.add(function.apply(element));
        });
        return result;
    }
}
