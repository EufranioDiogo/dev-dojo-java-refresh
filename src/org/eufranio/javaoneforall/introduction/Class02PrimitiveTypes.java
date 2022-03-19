package org.eufranio.javaoneforall.introduction;

/**
 * Author: Eufránio Diogo
 * Topic: Primitive Types
 * Date: 2021-03-18
 */
public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        // 8 Primitive Types: int double float boolean char byte short long
        int age = 20; // 4 Bytes
        double pi = 3.1415; // 8 Bytes
        float salary = 1000; // 4 Bytes
        boolean isMarried = true; // 1 Byte
        char character = 'E'; // 2 Bytes
        char characterAsANumber = 69;
        char characterAsUnicode = '\u2602';
        byte smallNumber = 2; // 1 Byte
        short shortNumber = 1; // 2 Bytes
        long veryLongNumber = 1234567890; // 8 Bytes
        var address = "Terra Nova - Luanda - Angola";
        String name = "Eufránio Diogo";


        System.out.println("Age (int): " + age);
        System.out.println("PI (double): " + pi);
        System.out.println("salary(1/2) (float): " + salary);
        System.out.println("Is Married (boolean): " + isMarried);
        System.out.println("Character (char): " + character);
        System.out.println("Character As a Number (char): " + characterAsANumber);
        System.out.println("Character As Unicode(char): " + characterAsUnicode);
        System.out.println("small Number (byte): " + smallNumber);
        System.out.println("short Number (short): " + shortNumber);
        System.out.println("Long Number (long): " + veryLongNumber);
        System.out.println("Address (var): " + address);
        System.out.println("Name (String): " + name);
        System.out.println("Class 02 running");
    }
}
