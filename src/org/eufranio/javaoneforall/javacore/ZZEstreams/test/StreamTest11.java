package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import org.eufranio.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("L1", 1000),
            new LightNovel("L2", 3292),
            new LightNovel("L3", 4903),
            new LightNovel("L4", 3932),
            new LightNovel("L5", 1300),
            new LightNovel("L5", 1300),
            new LightNovel("L6", 10390),
            new LightNovel("L6", 15390)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        lightNovels.stream().collect(Collectors.counting());

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
    }
}
