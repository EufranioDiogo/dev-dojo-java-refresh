package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);
        int year, month, day;

        System.out.println("What's your year of birth?");
        year = keyboardReader.nextInt();

        System.out.println("What's your month of birth?");
        month = keyboardReader.nextInt();

        System.out.println("What's your day of birth?");
        day = keyboardReader.nextInt();

        LocalDate past = LocalDate.of(year, month, day);


        printTimeInfoFromBirthDate(past);
    }

    private static  void printTimeInfoFromBirthDate(LocalDate birthDate) {
        LocalDate now = LocalDate.now();

        System.out.println("DECADES: " + birthDate.until(now, ChronoUnit.DECADES));
        System.out.println("YEARS: " + birthDate.until(now, ChronoUnit.YEARS));
        System.out.println("MONTHS: " + birthDate.until(now, ChronoUnit.MONTHS));
        System.out.println("WEEKS: " + birthDate.until(now, ChronoUnit.WEEKS));
        System.out.println("DAYS: " + birthDate.until(now, ChronoUnit.DAYS));
    }
}
