package org.eufranio.javaoneforall.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Eufánio, Lukeny, Manuel, Diogo";
        String[] groupElements = text.split(",");

        for (String groupElement :
                groupElements) {
            System.out.println(groupElement);
        }

    }
}
