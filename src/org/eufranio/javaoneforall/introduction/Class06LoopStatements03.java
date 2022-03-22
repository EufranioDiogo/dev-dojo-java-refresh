package org.eufranio.javaoneforall.introduction;

public class Class06LoopStatements03 {
    public static void main(String[] args) {
        int limitNumber = 50;
        int limitOfCounter = limitNumber / 2;

        for (int i = 0; i < limitNumber; i++) {
            if (limitOfCounter == i) {
                break;
            }
            System.out.println(i + 1);
        }
    }
}
