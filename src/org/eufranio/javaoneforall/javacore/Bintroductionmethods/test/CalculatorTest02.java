package org.eufranio.javaoneforall.javacore.Bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator('+', new float[]{1, 2, 3, 4, 5});

        calculator.perfomArrayComputation();

        System.out.println(calculator);

        calculator = new Calculator('+', 1, 2, 3, 4, 5);

        calculator.perfomArrayComputation();


        System.out.println(calculator);

    }
}
