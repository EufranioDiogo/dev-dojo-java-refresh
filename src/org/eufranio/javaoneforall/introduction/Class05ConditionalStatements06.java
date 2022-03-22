package org.eufranio.javaoneforall.introduction;

public class Class05ConditionalStatements06 {
    public static void main(String[] args) {
        int dayOfTheWeek = 2;

        switch (dayOfTheWeek) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Work day");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
