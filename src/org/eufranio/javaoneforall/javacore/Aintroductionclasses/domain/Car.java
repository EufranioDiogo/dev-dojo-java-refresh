package org.eufranio.javaoneforall.javacore.Aintroductionclasses.domain;

public class Car {
    public String name;
    public String model;
    public int year;

    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
