package org.eufranio.javaoneforall.introduction;

public class Class05ConditionalStatements04 {
    public static void main(String[] args) {
        float annualSalary = 1000;
        float taxes;
        float taxesAmountBasedInAnnualSalary;

        if (annualSalary < 34713) {
            taxes = 9.70F;
        } else if (annualSalary < 68508) {
            taxes = 37.35F;
        } else {
            taxes = 49.50F;
        }

        taxesAmountBasedInAnnualSalary = annualSalary * (taxes / 100);

        System.out.println("You're annualSalary is " +
                annualSalary + " and the taxes for it is: " + taxes +
                " and the amount to pay based in your annualSalary is: " + taxesAmountBasedInAnnualSalary);
    }
}
