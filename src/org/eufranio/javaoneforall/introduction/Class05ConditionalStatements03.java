package org.eufranio.javaoneforall.introduction;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        // ternary operator
        // <condition> ? <result if codition is true> : <result if condition is false>;


        float salary = 1000000F;
        String shouldBuyMessage = "Buy PS5";
        String shouldNotBuyMessage = "Not buy PS5";
        String displayMessage;

        displayMessage = salary > 200000 ? shouldBuyMessage : shouldNotBuyMessage;

        System.out.println(displayMessage);
    }
}
