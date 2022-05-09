package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // ISO 639, ISO 3166

        Locale localeBR = new Locale("pt", "br");
        Locale localeAO = new Locale("pt", "ao");
        Locale localeItaly = new Locale("it", "IT");
        Locale localeFR = new Locale("fr", "fr");
        Locale localeAR = new Locale("ar", "af");
        Locale localeJP = new Locale("ja", "jp");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeAO);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeFR);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeAR);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeJP);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(df4.format(calendar.getTime()));
        System.out.println(df5.format(calendar.getTime()));
        System.out.println(df6.format(calendar.getTime()));
    }
}
