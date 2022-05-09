package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeAO = new Locale("pt", "AO");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeAO);
        nfa[2] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeJP);

        for (NumberFormat numberFormat :
                nfa) {
            numberFormat.setMaximumFractionDigits(3);
            System.out.println(numberFormat.format(250_000.4556));
        }

        String stringValue = "121.234";

        try {
            System.out.println(NumberFormat.getNumberInstance(Locale.ITALY).parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
