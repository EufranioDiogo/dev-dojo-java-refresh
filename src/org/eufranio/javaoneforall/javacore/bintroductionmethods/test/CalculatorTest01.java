package org.eufranio.javaoneforall.javacore.bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.bintroductionmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int number1 = 10;

        int number2 = 25;

        int sum;
        sum = calculator.sum(number1, number2);
        int division;
        division = calculator.division(10, 0);

        System.out.println("Division: " + division);
        System.out.println("Sum: " + sum);

    }
}
