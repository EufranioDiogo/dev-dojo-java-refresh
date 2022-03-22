package org.eufranio.javaoneforall.introduction;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {
        int age = 15;
        String category;

        if (age < 15) {
            category = "Junior";
        } else if (age < 18) {
            category = "Senior";
        } else {
            category = "Junior";
        }

        System.out.println("You're in: " + category + " category");
    }
}
