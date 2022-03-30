package org.eufranio.javaoneforall.javacore.cmethodoverloading.test;

import org.eufranio.javaoneforall.javacore.cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        Anime anime02 = new Anime("Naruto", "TV", 1500, "ENDED", "Star studios");

        anime01.init("Sun Goku", "TV", 21, "ACTIVE");

        anime01.print();
        anime02.print();

    }
}
