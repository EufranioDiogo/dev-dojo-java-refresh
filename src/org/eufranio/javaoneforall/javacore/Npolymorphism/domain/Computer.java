package org.eufranio.javaoneforall.javacore.Npolymorphism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.21;
    public String reference;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        return this.price * Computer.TAX_PERCENTAGE;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", tax Value=" + this.calculateTaxValue() +
                '}';
    }
}
