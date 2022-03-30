package org.eufranio.javaoneforall.javacore.bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.bintroductionmethods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3, 4, 5};

        int totalSum = calculator.sumArray(numbers);
        int totalSumVarArgs = 0;

        System.out.println("Total: " + totalSum);

        totalSumVarArgs = calculator.sumVarArgs(1, 2, 3, 4, 5, 6);

        System.out.println("Total Sum Var Args: " + totalSumVarArgs);
    }
}
