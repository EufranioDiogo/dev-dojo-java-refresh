package org.eufranio.javaoneforall.javacore.ZZDOptional.repositories;

import org.eufranio.javaoneforall.javacore.ZZDOptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class MangaRepository {
    private static List<Manga> mangas = new ArrayList<>(List.of(
            new Manga(1, "Naruto", 250L),
            new Manga(2, "Boruto", 500L),
            new Manga(3, "Sensei", 300L)
    ));

    public static Manga findById(Integer id) {
        return mangas
                .stream()
                .filter(manga -> manga.getId().equals(id))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public static Manga findByTitle(String title) {
        return mangas
                .stream()
                .filter(manga -> manga.getTitle().equals(title))
                .findFirst()
                .map(manga -> new Manga(manga.getId(), manga.getTitle().toUpperCase(Locale.ROOT), manga.getEpisoddes()))
                .orElse(new Manga());
    }
}
