package org.eufranio.javaoneforall.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L);

        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);

        System.out.println(date.getTime());
    }
}
