package org.eufranio.javaoneforall.javacore.bintroductionmethods.domain;

public class Calculator {

    public void desc() {
        System.out.println("Hello guys, I'm a calculator object");
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int subract(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int sumArray(int[] arrayOfNumbers) {
        int sum = 0;

        for (int number :
                arrayOfNumbers) {
            sum += number;
        }
        return sum;
    }

    public int sumVarArgs(int... arrayOfNumbers) {
        int sum = 0;

        for (int number :
                arrayOfNumbers) {
            sum += number;
        }
        return sum;
    }
    public int division(int number1, int number2) {
        return number2 != 0 ? number1 / number2 : 0;
    }
}
