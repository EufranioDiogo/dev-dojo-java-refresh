package org.eufranio.javaoneforall.introduction;

public class Class06LoopStatements01 {
    public static void main(String[] args) {
        int counter = 0;

        System.out.println("=================WHILE=================");
        while (counter < 10) {
            System.out.println("Counter = " + counter);
            counter++;
        }

        counter = 0;

        System.out.println("=================DO WHILE=================");
        do {
            System.out.println("Counter = " + counter);
            counter++;
        } while (counter < 10);

        counter = 0;

        System.out.println("=================FOR=================");
        for (; counter < 10; counter++) {
            System.out.println("Counter = " + counter);
        }
    }
}
