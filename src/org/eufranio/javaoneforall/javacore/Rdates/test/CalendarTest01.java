package org.eufranio.javaoneforall.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        System.out.println(calendar.getFirstDayOfWeek());

        if (calendar.getFirstDayOfWeek() == calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        //System.out.println(calendar);
        System.out.println(date);

        calendar.add(Calendar.DAY_OF_MONTH, 4);
        calendar.add(Calendar.HOUR, 4);

        date = calendar.getTime();

        System.out.println(date);

        calendar.roll(Calendar.DAY_OF_WEEK, 6);
        date = calendar.getTime();

        System.out.println(date);
    }
}
