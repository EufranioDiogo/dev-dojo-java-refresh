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
        boolean isThereAnyPriceLowerThan1000 = lightNovels
                .stream()
                .anyMatch(lightNovel -> lightNovel.getPrice() < 1000);

        boolean isEveryPricesGraterThan1000 = lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 1000);

        System.out.println("isThereAnyPriceLowerThan1000 = " + isThereAnyPriceLowerThan1000);
        System.out.println("isEveryPricesGraterThan1000 = " + isEveryPricesGraterThan1000);

        lightNovels
                .stream()
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() > 1500)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .forEach(System.out::println);


    }
}
