package org.eufranio.javaoneforall.javacore.Npolymorphism.domain;

public class Television extends Product {
    private static final double TELEVISION_TAX = 0.05;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        return this.price * Television.TELEVISION_TAX;
    }

    @Override
    public String toString() {
        return "Television{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Tax=" + Television.TELEVISION_TAX +
                '}';
    }
}
