package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Period p1 = Period.between(now, now.plusDays(2).plusYears(2));

        System.out.println(p1.get(ChronoUnit.MONTHS));

        System.out.println(now.until(now.plusDays(3).plusYears(3), ChronoUnit.MONTHS));

    }
}
