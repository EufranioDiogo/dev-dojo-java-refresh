package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import org.eufranio.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("L1", 1000),
            new LightNovel("L2", 3292),
            new LightNovel("L3", 4903),
            new LightNovel("L4", 3932),
            new LightNovel("L5", 1300),
            new LightNovel("L5", 1300),
            new LightNovel("L6", 10390)
    ));

    public static void main(String[] args) {
        // BAD: lightNovels.stream().forEach(System.out::println);
        // GOOD: lightNovels.forEach(System.out::println);

        Stream<LightNovel> stream = lightNovels.stream();

        long count = stream
                .filter(ln -> ln.getPrice() < 4000)
                .distinct()
                .count();

        System.out.println(count);


        // Once you used a terminal operation

    }
}
