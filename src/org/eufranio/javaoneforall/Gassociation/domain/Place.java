package org.eufranio.javaoneforall.Gassociation.domain;

public class Place {
    private String address;

    public Place(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Place{" +
                "address='" + address + '\'' +
                '}';
    }
}
