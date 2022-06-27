package org.eufranio.javaoneforall.javacore.ZZDOptional;

import org.eufranio.javaoneforall.javacore.ZZDOptional.domain.Manga;
import org.eufranio.javaoneforall.javacore.ZZDOptional.repositories.MangaRepository;

public class OptionalTest02 {
    public static void main(String[] args) {

        Manga byId = MangaRepository.findById(2);
        Manga naruto = MangaRepository.findByTitle("Naruto");

        System.out.println(byId);
        System.out.println(naruto);
    }
}
