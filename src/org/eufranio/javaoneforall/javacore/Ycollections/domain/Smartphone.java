package org.eufranio.javaoneforall.javacore.Ycollections.domain;

public class Smartphone {
    private String serialNumber;
    private String model;
    private String brand;
    private double price;

    public Smartphone(String serialNumber, String model, String brand) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Smartphone setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Smartphone setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Smartphone setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Smartphone setPrice(double price) {
        this.price = price;
        return this;
    }
}
