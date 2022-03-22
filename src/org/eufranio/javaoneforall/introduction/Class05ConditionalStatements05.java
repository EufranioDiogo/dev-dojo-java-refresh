package org.eufranio.javaoneforall.introduction;

public class Class05ConditionalStatements05 {
    public static void main(String[] args) {
        byte dayIndex = 10;
        String dayName;

        switch (dayIndex) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wenesday";
                break;
            case 4:
                dayName = "Thrusday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = "Not registered";
        }

        System.out.println("The day is: " + dayName);
    }
}
