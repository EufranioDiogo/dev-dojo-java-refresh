package org.eufranio.javaoneforall.javacore.cmethodoverloading.test;

import org.eufranio.javaoneforall.javacore.cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Sun Goku", "TV", 21, "ACTIVE");

        anime.print();
    }
}
