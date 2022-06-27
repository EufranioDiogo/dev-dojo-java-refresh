package org.eufranio.javaoneforall.javacore.ZZClambdas.test;

import org.eufranio.javaoneforall.javacore.ZZClambdas.domain.Anime;
import org.eufranio.javaoneforall.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {

        Supplier<AnimeComparator> animeComparatorSupplier = AnimeComparator::new;
        AnimeComparator animeComparator = animeComparatorSupplier.get();
        BiFunction<String, Integer, Anime> generateAnime = Anime::new;


        List<Anime> animes = new ArrayList<>(
                List.of(new Anime("Berserk", 40), new Anime("One Piece", 900), new Anime("Naruto", 500))
        );

        Anime anime1 = generateAnime.apply("Dragon Bull Z", 670);

        System.out.println(anime1);
    }
}
