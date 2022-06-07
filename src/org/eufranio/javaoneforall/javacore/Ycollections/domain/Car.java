package org.eufranio.javaoneforall.javacore.Ycollections.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private int id;
    private String model;
    private String brand;
    private double price;
    private int quantity;


    public Car(int id, String model, String brand, double price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }


    public Car(int id, String model, String brand, double price, int quantity) {
        this(id, model, brand, price);
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Car setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Car setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(model, car.model) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, brand);
    }

    @Override
    public int compareTo(@NotNull Car o) {
        /*
        if (this.id < o.id) return -1;
        if (this.id > o.id) return 1;
        return 0;*/
        return Integer.compare(this.id, o.id);
    }
}
