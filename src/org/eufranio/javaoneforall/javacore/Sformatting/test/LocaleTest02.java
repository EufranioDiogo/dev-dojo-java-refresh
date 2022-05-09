package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        for (String locale :
                Locale.getISOCountries()) {
            System.out.print(locale + " ");
        }

        System.out.println();

        for (String languages :
                Locale.getISOLanguages()) {
            System.out.print(languages + " ");
        }



    }
}
