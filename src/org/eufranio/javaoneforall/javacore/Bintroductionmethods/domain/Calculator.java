package org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {
    public float[] operands;
    public float firstOperand;
    public float secondOperand;
    public float result;
    public char operator;


    public Calculator(float firstOperand, float secondOperand, char operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    public Calculator(char operator, float... operands) {
        this.operands = operands;
        this.operator = operator;
    }

    public void performSimpleComputation() {
        switch (this.operator) {
            case '+':
                this.result = firstOperand + secondOperand;
                break;
            case '-':
                this.result = firstOperand - secondOperand;
                break;
            case 'x':
                this.result = firstOperand * secondOperand;
                break;
            case '/':
                this.result = firstOperand / secondOperand;
                break;
            default:
                result = 0;
        }
    }

    public void perfomArrayComputation() {
        float result = 0;

        switch (this.operator) {
            case '+':
                for (float operand : operands) {
                    result += operand;
                }
                this.result = result;
                break;
            case '-':
                if (operands.length == 0) {
                    result = 0;
                    break;
                }
                result = operands[0];

                for (int i = 1; i < operands.length; i++) {
                    result -= operands[i];
                }
                this.result = result;
                break;
            case 'x':
                result = 1;

                for (float operand : operands) {
                    result *= operand;
                }
                this.result = result;
                break;
            case '/':
                if (operands.length == 0) {
                    result = 0;
                    break;
                }
                result = operands[0];

                for (int i = 1; i < operands.length; i++) {
                    result /= operands[i];
                }
                this.result = result;
                break;
            default:
                result = 0;
        }
    }

    public void changeFirstOperand(float firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void changeSecondOperand(float secondOperand) {
        this.secondOperand = secondOperand;
    }

    public void changeOperator(char operator) {
        this.operator = operator;
    }



    @Override
    public String toString() {
        return firstOperand + " " + operator + " " + secondOperand + " = " + result;
    }
}
