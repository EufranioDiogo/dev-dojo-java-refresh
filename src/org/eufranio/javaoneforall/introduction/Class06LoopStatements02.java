package org.eufranio.javaoneforall.introduction;

public class Class06LoopStatements02 {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 1000001) {
            if (counter % 2 == 0) {
                System.out.print(counter + ", ");
            }
            counter++;
        }
    }
}
