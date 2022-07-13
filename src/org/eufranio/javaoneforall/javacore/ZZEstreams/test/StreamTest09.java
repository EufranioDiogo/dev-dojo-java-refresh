package org.eufranio.javaoneforall.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 != 0).forEachOrdered(number -> System.out.print(number + " "));
        System.out.println();
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEachOrdered(number -> System.out.print(number + " "));

        System.out.println();

        Stream.of("Eufránio Diogo", "Creuma Diogo", "Helga Valente", "Hevlin Valente")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println();

        int[] nums = {1, 2, 3, 4, 5};

        Arrays.stream(nums).average().ifPresent(System.out::println);

        Arrays.stream(nums).max().ifPresent(System.out::println);

        System.out.println();

        try (
                Stream<String> lines = Files.lines(Paths.get("file.txt"));
                )
        {
            lines.map(String::toUpperCase)
                    .filter(line -> !line.isBlank() && line.contains("JAVA") && line.length() > 20)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
