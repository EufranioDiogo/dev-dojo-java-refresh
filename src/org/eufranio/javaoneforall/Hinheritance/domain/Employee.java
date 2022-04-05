package org.eufranio.javaoneforall.Hinheritance.domain;

public class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected float salary;

    static {
        System.out.println("Employee.static initializer");
    }

    {
        System.out.println("Employee.instance initializer 1");
    }

    {
        System.out.println("Employee.instance initializer 2");
    }

    public Employee(String name, String socialSecurityNumber, Address address, float salary) {
        System.out.println("Employee.Employee");
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}
