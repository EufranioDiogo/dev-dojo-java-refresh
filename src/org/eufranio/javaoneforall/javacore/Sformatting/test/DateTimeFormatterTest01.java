package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();

        String formatter1 = date.format(DateTimeFormatter.ISO_DATE);
        String formatter2 = date.format(DateTimeFormatter.ISO_WEEK_DATE);
        String formatter3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String formatter4 = date.format(DateTimeFormatter.ISO_WEEK_DATE);
        String formatter5 = date.format(DateTimeFormatter.BASIC_ISO_DATE);

        String dateTimeFormatter1 = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(formatter1);
        System.out.println(formatter2);
        System.out.println(formatter3);
        System.out.println(formatter4);
        System.out.println(formatter5);

        System.out.println(dateTimeFormatter1);
    }
}
