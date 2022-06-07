package org.eufranio.javaoneforall.javacore.Ycollections.test;

import org.eufranio.javaoneforall.javacore.Ycollections.domain.Smartphone;
import org.eufranio.javaoneforall.javacore.Ycollections.domain.SmartphoneWithEquals;

public class EqualsTest01 {
    public static void main(String[] args) {
        String name1 = new String("Eufránio Diogo");
        String name2 = new String("Eufranio Diogo");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        Smartphone smartphone1 = new Smartphone("kmsak", "RMX821", "realme");
        Smartphone smartphone2 = new Smartphone("kmsak", "RMX821", "realme");

        System.out.println(smartphone1.equals(smartphone2));


        SmartphoneWithEquals smartphone1WithEquals = new SmartphoneWithEquals("kmsak", "RMX821", "realme");
        SmartphoneWithEquals smartphone2WithEquals = new SmartphoneWithEquals("kmsak", "RMX821", "realme");

        System.out.println(smartphone1WithEquals.equals(smartphone2WithEquals));

        SmartphoneWithEquals smartphone3WithEquals = new SmartphoneWithEquals(null, "RMX821", "realme");
        SmartphoneWithEquals smartphone4WithEquals = new SmartphoneWithEquals("kmsak", "RMX821", "realme");

        System.out.println(smartphone3WithEquals.equals(smartphone4WithEquals));
    }
}
