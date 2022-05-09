package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2022, Month.FEBRUARY, 10);

        System.out.println(date);
        System.out.println(LocalDate.now());

    }
}
