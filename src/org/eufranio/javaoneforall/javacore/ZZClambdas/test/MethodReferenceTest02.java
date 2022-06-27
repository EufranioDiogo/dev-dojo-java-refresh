package org.eufranio.javaoneforall.javacore.ZZClambdas.test;

import org.eufranio.javaoneforall.javacore.ZZClambdas.domain.Anime;
import org.eufranio.javaoneforall.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(
                List.of(new Anime("Berserk", 40), new Anime("One Piece", 900), new Anime("Naruto", 500))
        );

        AnimeComparator animeComparator = new AnimeComparator();

        animes.sort(animeComparator::compareByEpisodes);

        System.out.println(animes);
    }
}
