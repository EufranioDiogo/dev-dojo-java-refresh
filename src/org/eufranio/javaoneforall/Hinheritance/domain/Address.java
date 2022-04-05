package org.eufranio.javaoneforall.Hinheritance.domain;

public class Address {
    private String street;
    private String zipCode;

    public Address(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getstreet() {
        return street;
    }

    public void setstreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
