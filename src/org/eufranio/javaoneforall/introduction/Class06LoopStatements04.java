package org.eufranio.javaoneforall.introduction;

public class Class06LoopStatements04 {
    public static void main(String[] args) {
        float carTotalPrice = 20000;
        float totalPayedByUser = 0F;
        int quantOfMonthsToPay = 1;

        for (; quantOfMonthsToPay <= carTotalPrice; quantOfMonthsToPay++) {
            float monthAmountToPay = carTotalPrice / quantOfMonthsToPay;

            if (monthAmountToPay < 1000) {
                System.out.println("Can not pay the car");
                break;
            } else {
                totalPayedByUser += monthAmountToPay;
                System.out.println("Monthly payment: " + monthAmountToPay + " AOA - Month: " + quantOfMonthsToPay);
            }
        }

        System.out.println("Value Payed: " + totalPayedByUser + " AOA - Quantity Months: " + quantOfMonthsToPay );
    }

}
