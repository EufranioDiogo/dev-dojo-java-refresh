package org.eufranio.javaoneforall.Jfinalmodifier.domain;

public class Buyer {
    private String name;

    public Buyer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                '}';
    }
}
