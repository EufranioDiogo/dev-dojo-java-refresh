package org.eufranio.javaoneforall.Jfinalmodifier.domain;

public class Car {
    private String brandName;
    private double maxSpeed;
    public static final double SPEED_LIMIT = 250;
    private final Buyer BUYER;

    public Car(String brandName, Buyer BUYER) {
        this.brandName = brandName;
        this.BUYER = BUYER;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Buyer getBUYER() {
        return BUYER;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", BUYER=" + BUYER +
                '}';
    }
}
