package org.eufranio.javaoneforall.Einitializationblock.domain;

public class Car {
    private String brandName;
    private double maxSpeed;
    private static double speedLimit = 250;

    public Car(String brandName, double maxSpeed) {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static double getSpeedLimit() {
        return speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "Car{\n" +
                "brandName='" + this.brandName + '\'' +
                "\n, maxSpeed=" + this.maxSpeed +
                "\n, speedLimit=" + speedLimit +
                "\n}";
    }
}
