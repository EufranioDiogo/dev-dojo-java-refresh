package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("bola", "música", "elemento");

        words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .forEach(System.out::println);
    }
}
