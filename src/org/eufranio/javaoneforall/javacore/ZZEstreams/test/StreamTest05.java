package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("bola", "música", "elemento");
        String[] letters = words.get(0).split("");

        System.out.println(Arrays.toString(letters));

        Stream<String> stream = Arrays.stream(letters);

        Stream<String> stream1 = words.stream();

        List<String> collect = stream1
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());


        System.out.println(collect);
    }
}
