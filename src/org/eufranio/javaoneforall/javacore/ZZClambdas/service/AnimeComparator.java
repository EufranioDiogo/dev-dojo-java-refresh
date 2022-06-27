package org.eufranio.javaoneforall.javacore.ZZClambdas.service;

import org.eufranio.javaoneforall.javacore.ZZClambdas.domain.Anime;

import java.util.Comparator;

public class AnimeComparator implements Comparator<Anime> {
    @Override
    public int compare(Anime o1, Anime o2) {
        return Integer.compare(o1.getEpisode(), o2.getEpisode());
    }

    public static int compareByTitle(Anime o1, Anime o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    public int compareByEpisodes(Anime o1, Anime o2) {
        return Integer.compare(o1.getEpisode(), o2.getEpisode());
    }
}
