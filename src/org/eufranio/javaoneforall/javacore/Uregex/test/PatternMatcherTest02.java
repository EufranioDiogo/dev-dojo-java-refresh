package org.eufranio.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d -> All the digits 0 - 9
        // \D -> Everything that is not \d
        // \s -> All blank spaces \t \r \f \n
        // \S -> Everything that is not \s
        // \w -> All the letters a-zA-z, 0-9, _
        // \W -> Everything that is not \w

        String regex = "\\d\\d";
        String text = "jsu39ids0330skd";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("text:  " + text);
        System.out.println("index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");

        while (matcher.find()) {
            System.out.println(matcher.start() + " | " + matcher.group() + " | Count: " + matcher.groupCount());
        }

    }
}
