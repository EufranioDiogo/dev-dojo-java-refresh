package org.eufranio.javaoneforall.javacore.Npolymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        return this.price * Tomato.TAX_PERCENTAGE;
    }
}
