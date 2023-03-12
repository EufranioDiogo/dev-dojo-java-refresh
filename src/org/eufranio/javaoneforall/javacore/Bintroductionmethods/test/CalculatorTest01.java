package org.eufranio.javaoneforall.javacore.Bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 15, '+');

        calculator.performSimpleComputation();

        System.out.println(calculator);

        //-----------------------------------------------
        calculator.changeOperator('-');

        calculator.performSimpleComputation();

        System.out.println(calculator);

        //------------------------------------------------
        calculator.changeFirstOperand(-1);
        calculator.changeSecondOperand(0);

        calculator.changeOperator('/');

        calculator.performSimpleComputation();

        System.out.println(calculator);
    }
}
