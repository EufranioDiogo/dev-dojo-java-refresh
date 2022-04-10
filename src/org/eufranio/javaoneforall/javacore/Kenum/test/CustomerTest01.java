package org.eufranio.javaoneforall.javacore.Kenum.test;

import org.eufranio.javaoneforall.javacore.Kenum.domain.Customer;
import org.eufranio.javaoneforall.javacore.Kenum.domain.CustomerType;
import org.eufranio.javaoneforall.javacore.Kenum.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer01 = new Customer("William Suavez", CustomerType.COMPANY, PaymentType.DEBIT);
        Customer customer02 = new Customer("Eufránio Diogo", CustomerType.INDIVIDUAL, PaymentType.CREDIT);

        System.out.println(customer01);
        System.out.println(customer02);
        System.out.println(PaymentType.DEBIT.calculateDiscount(1000));

        CustomerType customerType = CustomerType.getCustomerType("iNDIVIDUAL");

        System.out.println(customerType);

    }
}
