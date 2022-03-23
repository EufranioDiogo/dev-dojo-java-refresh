package org.eufranio.javaoneforall.javacore.bintroductionmethods.domain;

public class Car {
    private String name;
    private String model;
    private int year;
    private String paintColor;

    public Car() {
        this.paintColor = "white";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", paintColor='" + paintColor + '\'' +
                '}';
    }
}
