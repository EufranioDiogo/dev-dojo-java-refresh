package org.eufranio.javaoneforall.Kenum.domain;

public class Customer {
    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType type, PaymentType paymentType) {
        this.name = name;
        this.customerType = type;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
                ", customerTypeDatabaseValue=" + customerType.DB_VALUE +
                ", paymentType=" + paymentType +
                '}';
    }
}
