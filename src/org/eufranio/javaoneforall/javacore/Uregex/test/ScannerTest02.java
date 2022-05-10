package org.eufranio.javaoneforall.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Eufánio,Lukeny,Manuel,Diogo,true,2";
        Scanner scanner = new Scanner(text);

        scanner.useDelimiter(",");
        int quantOfValuesNotString = 0;

        while(scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                quantOfValuesNotString++;
                System.out.println(scanner.nextInt());
            } else if (scanner.hasNextBoolean()) {
                quantOfValuesNotString++;
                System.out.println(scanner.nextBoolean());
            } else if (scanner.hasNextFloat()) {
                quantOfValuesNotString++;
                System.out.println(scanner.nextFloat());
            } else {
                System.out.println(scanner.next());
            }
        }

        System.out.println("Quant of values different of String: " + quantOfValuesNotString);
    }
}
