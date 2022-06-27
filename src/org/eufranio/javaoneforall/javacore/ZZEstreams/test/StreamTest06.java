package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import org.eufranio.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest06 {
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
        boolean isTrueContainsO = lightNovels.stream().anyMatch(ln -> ln.getTitle().equals("O"));

        System.out.println(isTrueContainsO);

        boolean allPricesAbove50_000 = lightNovels.stream().allMatch(ln -> ln.getPrice() > 50_000L);

        System.out.println(allPricesAbove50_000);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 10_000)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .min(Comparator.comparing(LightNovel::getPrice).reversed())
                .ifPresent(System.out::println);
    }
}
