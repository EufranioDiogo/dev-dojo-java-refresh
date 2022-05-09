package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        System.out.println(simpleDateFormat.format(new Date()));
    }
}
