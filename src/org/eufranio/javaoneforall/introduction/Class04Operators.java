package org.eufranio.javaoneforall.introduction;

/**
 * Author: Eufránio Diogo
 * Topic: Java Operators
 * Date: 2022-03-19
 */
public class Class04Operators {
    public static void main(String[] args) {
        /*
        There are 3 types of operators on java, and those are: relational operators, arithmetic operators
        and logical operators

        Relation: >, <, >=, <=, !=, ==
        Logical: &&, ||, !
        Arithmetic: +, -, *, /, //, %
        */

        int number1 = 10;
        int number2 = 20;

        boolean isNumber1EqualToNumber2 = number1 == number2;
        boolean isNumber1GreaterThanNumber2 = number1 > number2;
        boolean isNumber1GreaterOrEqualToNumber2 = number1 >= number2;
        boolean isNumber1LowerThanNumber2 = number1 < number2;
        boolean isNumber1LowerOrEqualToNumber2 = number1 <= number2;
        boolean isNumber1NotEqualToNumber2 = number1 != number2;


        System.out.println("Arithmetic Operators: ");
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + ((float) number1 / (float) number2));
        System.out.println("(int)("+ number1 + " / " + number2 + ") = " + (int)(number1 / number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));

        System.out.println("\nRelational Operators: ");
        System.out.println(number1 + " == " + number2 + " = " + isNumber1EqualToNumber2);
        System.out.println(number1 + " > " + number2 + " = " + isNumber1GreaterThanNumber2);
        System.out.println(number1 + " >= " + number2 + " = " + isNumber1GreaterOrEqualToNumber2);
        System.out.println(number1 + " < " + number2 + " = " + isNumber1LowerThanNumber2);
        System.out.println(number1 + " <= " + number2 + " = " + isNumber1LowerOrEqualToNumber2);
        System.out.println(number1 + " != " + number2 + " = " + isNumber1NotEqualToNumber2);

        int age = 20;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3383;

        System.out.println("isLegalOlder Than Thirty: " + isLegalOlderThanThirty);
        System.out.println("isYoungOlder Than Thirty: " + isLegalYoungerThanThirty);

        if (age > 18) {
            System.out.println("You can get driver license");
        } else {
            System.out.println("You can not get driver license");
        }
    }
}
