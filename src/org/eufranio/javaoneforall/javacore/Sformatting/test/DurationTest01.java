package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime future = LocalDateTime.now().plusYears(1).plusMonths(6);

        System.out.println(Duration.between(now, future));
    }
}
