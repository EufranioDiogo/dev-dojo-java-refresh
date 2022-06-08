package org.eufranio.javaoneforall.javacore.Ycollections.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapTest01 {
    public static void main(String[] args) {
        // LinkedHashMaps maintains the order of insertion
        // HashMap doesn't maintain the order of insertion
        Map<String, String> dictionary = new LinkedHashMap<>();

        dictionary.put("mango", "manga");
        dictionary.put("mouse", "rator");
        dictionary.put("sun", "sol");

        System.out.println(dictionary);

        dictionary.forEach(printValue);

        System.out.println("--------------------------------");

        for (String key :
                dictionary.keySet()) {
            System.out.println(key + " -> " +  dictionary.get(key));
        }

        System.out.println("--------------------------------");

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    static BiConsumer<String, String> printValue = (s1, s2) -> System.out.println(s1 + " -> " + s2);
}
