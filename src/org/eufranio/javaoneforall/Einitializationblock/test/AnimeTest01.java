package org.eufranio.javaoneforall.Einitializationblock.test;

import org.eufranio.javaoneforall.Einitializationblock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episode : anime.getEpisodes()) {
            System.out.println(episode);
        }


    }
}
