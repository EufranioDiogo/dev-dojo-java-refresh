package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = now.plusDays(25);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.withDayOfMonth(22);
        System.out.println(now);

        now = LocalDate.now();

        System.out.println(now.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));
    }
}
