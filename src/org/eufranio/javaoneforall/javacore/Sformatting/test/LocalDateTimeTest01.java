package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2001-03-14");
        LocalTime time = LocalTime.parse("14:35:23.23442");

        System.out.println(LocalDateTime.of(date, time));

        System.out.println(now);
    }
}
