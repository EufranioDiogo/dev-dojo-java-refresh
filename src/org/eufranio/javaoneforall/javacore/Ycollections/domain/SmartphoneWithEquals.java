package org.eufranio.javaoneforall.javacore.Ycollections.domain;

import java.util.Objects;

public class SmartphoneWithEquals {
    private String serialNumber;
    private String model;
    private String brand;
    private double price;

    public SmartphoneWithEquals(String serialNumber, String model, String brand) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public SmartphoneWithEquals setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public String getModel() {
        return model;
    }

    public SmartphoneWithEquals setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public SmartphoneWithEquals setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public SmartphoneWithEquals setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        SmartphoneWithEquals smartphone = (SmartphoneWithEquals) o;
        if (smartphone.serialNumber == null || this.serialNumber == null) return false;
        return this.serialNumber.equals(smartphone.serialNumber);
    }

    // x.equals(y) == true, means that x == y and x.hashCode() == y.hashCode()
    // x.hashCode() == y.hashCode() doesn't mean that x.equals(y) == true
    // x.equals(y) == false, means that x.hashCode() != y.hashCode()
    // x.hashCode() != y.hashCode() and x.equals(y) == false
    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "SmartphoneWithEquals{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
