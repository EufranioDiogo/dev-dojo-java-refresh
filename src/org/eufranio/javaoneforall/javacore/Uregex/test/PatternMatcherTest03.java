package org.eufranio.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d -> All the digits 0 - 9
        // \D -> Everything that is not \d
        // \s -> All blank spaces \t \r \f ,
        // \S -> Everything that is not \s
        // \w -> All the letters a-zA-z, 0-9, _
        // \W -> Everything that is not \w
        // [] -> range delimiter
        // ? -> zero or one character
        // * -> zero or more characters
        // + -> one or more characters
        // {min, max} -> max limit and min limit
        // () -> grouping
        // | person(a|s) -> persons or persona
        // $ -> end of the line
        // . -> one character


        String regex = "([a-zA-Z\\d\\._-])+@([A-Za-z])+(\\.([A-Za-z])+)+";
        String text = "example@email.com, " +
                "example.first.middle.lastname@email.com, " +
                "example@subdomain.email.com, " +
                "example+firstname+lastname@email.com, " +
                "example@234.234.234.234, " +
                "example@[234.234.234.234], " +
                "“example”@email.com, " +
                "0987654321@example.com, " +
                "example@email-one.com, " +
                "_______@email.com, " +
                "example@email.name, " +
                "example@email.museum, " +
                "example@email.co.jp, " +
                "example.firstname-lastname@email.com, " +
                "Valid Email Addresses that appear at glance to be invalid, " +
                "extremely.”odd\\unusual”@example.com, " +
                "extremely.unusual.”@”.unusual.com@example.com, " +
                "very.”(),:;<>[]”.VERY.”very@\\\\ “very”.unusual@strange.email.example.com";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("text:  " + text);
        System.out.println("index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");

        int countOfValids = 0;

        while (matcher.find()) {
            countOfValids++;
            System.out.println(matcher.start() + " | " + matcher.group() + " | Count: " + matcher.groupCount());
        }

        System.out.println(countOfValids);

        int hexNumber = 0xC350;
        System.out.println(hexNumber);

    }
}
