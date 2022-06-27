package org.eufranio.javaoneforall.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Rimuru", "Veldora", "Eufránio"));

        names.sort(String::compareTo);

        System.out.println(names);

        List<String> numbersAsString = new ArrayList<>(List.of("1", "2", "3"));
        List<Integer> numbersAsNumbers = numbersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(numbersAsString);
        System.out.println(numbersAsNumbers);

        BiPredicate<List<String>, String> predicate = List::contains;

        System.out.println(predicate.test(names, "Eufra"));

    }
}
