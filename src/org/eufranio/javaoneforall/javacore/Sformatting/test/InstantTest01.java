package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String... args) {
        Instant instant = Instant.now();

        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        System.out.println(instant.ofEpochSecond(3));

    }
}
