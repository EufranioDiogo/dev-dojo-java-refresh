package org.eufranio.javaoneforall.javacore.ZZBparameterization.domain;

public class Boat {
    private String name = "Audi";
    private String color;
    private int year;
    private final Long MAX_CAPACITY;

    public Boat(String color, int year, Long maxCapacity) {
        this.color = color;
        this.year = year;
        this.MAX_CAPACITY = maxCapacity;
    }

    public String getName() {
        return name;
    }

    public Boat setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Boat setColor(String color) {
        this.color = color;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Boat setYear(int year) {
        this.year = year;
        return this;
    }

    public Long getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", MAX_CAPACITY=" + MAX_CAPACITY +
                '}';
    }
}
