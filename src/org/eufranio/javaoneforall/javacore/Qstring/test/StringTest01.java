package org.eufranio.javaoneforall.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Eufránio";
        String name2 = "Eufránio";
        String name3 = "Eufránio Diogo";

        String resultName = name.concat(" Diogo");

        System.out.println(resultName);
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

        System.out.println(name3 == resultName);
        System.out.println(name3.equals(resultName));
        System.out.println(name3 == resultName.intern());
    }
}
