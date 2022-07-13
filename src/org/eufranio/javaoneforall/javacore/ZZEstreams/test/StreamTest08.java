package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import org.eufranio.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        double totalPrice = lightNovels
                .stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 4000)
                .reduce(0, Double::sum);

        System.out.println(totalPrice);
    }
}
