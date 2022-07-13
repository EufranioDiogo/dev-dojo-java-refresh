package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Telinho Borges", "Hernani Rafael");
        List<String> developers = List.of("Eufránio Diogo", "Ricardo Sabino", "Yuri Domingos");
        List<String> students = List.of("Isaura Mânico", "Eliana Neto");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
